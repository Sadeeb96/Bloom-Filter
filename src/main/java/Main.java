import com.bloom.filter.bloom.BloomFilter;
import com.bloom.filter.helper.*;

import java.util.HashSet;

public class Main {
    public static void main(String[] args)
    {
        /*Create a list of the hash functions*/
        HashSet<HashFunction> hashFunctions = new HashSet<>();
        //hashFunctions.add(new SDBMHash());
       // hashFunctions.add(new DJB2Hash());
        //hashFunctions.add(new DefaultHash());
        hashFunctions.add(new JenkinsHash())
        hashFunctions.add(new Hash1());
        hashFunctions.add(new Hash2());
        hashFunctions.add(new Hash3());
        hashFunctions.add(new Hash4());
        int size = 100;
        BloomFilter filter = new BloomFilter(hashFunctions,size);
        createList(filter);
        System.out.println(filter.getQueryCount()+" Accesses");
       // System.out.println(filter.getNames().size());
    }
    static void createList(BloomFilter filter){
        String[] names =new String[] { "abound",   "abounds",       "abundance",
                "abundant", "accessable",    "bloom",
                "blossom",  "bolster",       "bonny",
                "bonus",    "bonuses",       "coherent",
                "cohesive", "colorful",      "comely",
                "comfort",  "gems",          "generosity",
                "generous", "generously",    "genial",
                "bluff",    "cheater",       "hate",
                "war",      "humanity",      "racism",
                "hurt",     "nuke",          "gloomy",
                "facebook", "ahsan", "twitter" };
        for(String name : names) {
            //filter.addDumb(name);// Normal Add
            filter.addSmart(name);// Reduce query using bloom filter
        }
    }
}
