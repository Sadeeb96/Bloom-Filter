package com.bloom.filter.helper;

public class SDBMHash implements HashFuntion{
    @Override
    public long hash(String s, int size) {
        long hash = 0;
        for(int i=0;i<s.length();i++){
            hash = (int)s.charAt(i) + (hash << 6) + (hash << 16) - hash;
            hash = Math.abs(hash);
        }
        return hash%size;
    }
}
