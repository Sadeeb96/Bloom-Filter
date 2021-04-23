package com.bloom.filter.helper;

public class Hash3 implements HashFunction {
    @Override
    public long hash(String s, int size) {
        long hash = 7;
        for (int i = 0; i < s.length(); i++)
        {
            hash = (hash * 31 + s.charAt(i)) % size;
        }
        return hash % size;
    }
}
