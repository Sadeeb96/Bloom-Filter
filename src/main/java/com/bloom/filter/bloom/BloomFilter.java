package com.bloom.filter.bloom;

import com.bloom.filter.helper.HashFunction;

import java.util.HashSet;

public class BloomFilter {
    private HashSet<String> names;
    private int size;
    private int k;
    private HashSet<HashFunction> hashFunctions;
    private boolean[] bitArray;
    private int queryCount;

    public BloomFilter(HashSet<HashFunction> hashFunctions, int size) {
        this.queryCount = 0;
        this.hashFunctions = new HashSet<>();
        this.names = new HashSet<>();
        this.hashFunctions.addAll(hashFunctions);
        k = this.hashFunctions.size();
        this.size = size;
        bitArray = new boolean[size];
        for(int i=0;i<size;i++)bitArray[i] = false;
    }

    boolean query(String str)
    {
      //  System.out.println("Query "+str);
        for(HashFunction hashFunction : hashFunctions){
            if(!bitArray[(int) hashFunction.hash(str,size)]){
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public HashSet<String> getNames() {
        return names;
    }

    public int getQueryCount() {
        return queryCount;
    }

    boolean isNameAvailable(String name)
    {
        this.queryCount++;
        return !names.contains(name);
    }
    public HashSet<HashFunction> getHashFunctions() {
        return hashFunctions;
    }
    public void addHash(HashFunction hashFunction){
        this.hashFunctions.add(hashFunction);
        k = this.hashFunctions.size();
    }

    public boolean[] getBitArray() {
        return bitArray;
    }
    public void addDumb(String name){
        if(isNameAvailable(name)){
            names.add(name);
            setBits(name);
        }
    }
    public void setBits(String name){
        for(HashFunction hashFunction: hashFunctions){
            int idx = (int)hashFunction.hash(name,size);
            bitArray[idx] = true;
        }
    }
    public void addSmart(String name){
      //  System.out.println(name);
        if(!query(name)){
            names.add(name);
            setBits(name);
        }else{
           // System.out.println(name+" probab");
            addDumb(name);
        }
    }
    public void showBits(){
        for(boolean b : bitArray){
            System.out.print(b+" ");
        }
        System.out.println();
    }

}
