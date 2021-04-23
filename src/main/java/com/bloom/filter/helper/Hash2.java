package com.bloom.filter.helper;

import static java.lang.Math.pow;

public class Hash2 implements HashFunction {
    @Override
    public long hash(String s, int size) {
        long hash = 1;
        for (int i = 0; i < s.length(); i++)
        {
            hash = (long) (hash + pow(19, i) * (int)s.charAt(i));
            hash = hash % size;
        }
        return hash % size;
    }
}
