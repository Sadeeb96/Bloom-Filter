package com.bloom.filter.helper;

import static java.lang.Math.pow;

public class Hash4 implements HashFunction {
    @Override
    public long hash(String s, int size) {
        long hash = 3;
        int p = 7;
        for (int i = 0; i < s.length(); i++) {
            hash += hash * 7 + s.charAt(i) * pow(p, i);
            hash = hash % size;
        }
        return hash;
    }
}
