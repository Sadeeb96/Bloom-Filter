package com.bloom.filter.helper;

public class Hash1 implements HashFuntion{
    @Override
    public long hash(String s, int size) {
        long hash = 0;
        for (int i = 0; i < s.length(); i++)
        {
            hash = (hash + ((int)s.charAt(i)));
            hash = hash % size;
        }
        return hash;
    }
}
