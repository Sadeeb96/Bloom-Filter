# A simple implementation of Bloom Filter in Java
# Bloom Filter:
A Bloom filter is a space-efficient probabilistic data structure, conceived by Burton Howard Bloom in 1970, that is used to test whether an element is a member of a set. False positive matches are possible, but false negatives are not – in other words, a query returns either "possibly in set" or "definitely not in set". Elements can be added to the set, but not removed (though this can be addressed with the counting Bloom filter variant); the more items added, the larger the probability of false positives.

# Hash Functions Used:
1) djb2: http://www.cse.yorku.ca/~oz/hash.html
2) sdbm: http://www.cse.yorku.ca/~oz/hash.html
3) Jenkins Hash: https://en.wikipedia.org/wiki/Jenkins_hash_function
4) Java Default Hash: https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
