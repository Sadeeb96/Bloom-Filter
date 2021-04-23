package com.bloom.filter.helper;

public class DJB2Hash implements HashFuntion{
    @Override
    public long hash(String s, int size) {
        long hash = 5381;
        for(int i=0;i<s.length();i++){
            hash = ((hash << 5) + hash) + (int)s.charAt(i);
            hash = Math.abs(hash);
        }
        return hash%size;
    }
}
