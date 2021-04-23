package com.bloom.filter.helper;

public class DefaultHash implements HashFunction {

    @Override
    public long hash(String s, int size) {
        return Math.abs(s.hashCode())%size;
    }
}
