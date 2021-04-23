package com.bloom.filter.helper;

public class JenkinsHash implements HashFunction {
    @Override
    public long hash(String s, int size) {
        long hash = 0;
        for(int i=0;i<s.length();i++){
            hash += (int)s.charAt(i);
            hash += hash << 10;
            hash ^= hash >> 6;
        }
        hash += hash << 3;
        hash ^= hash >> 11;
        hash += hash << 15;
        hash = Math.abs(hash);

        return hash%size;
    }
}
