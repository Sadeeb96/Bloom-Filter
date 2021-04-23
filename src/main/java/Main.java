import com.bloom.filter.helper.*;

public class Main {
    public static void main(String[] args)
    {
        HashFuntion h1 = new SDBMHash();
        System.out.println(h1.hash("abcdefg",10));
    }
}
