import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ch_11_09
{
   /*Write a method hasEven that accepts a set of integers as a parameter and returns true if the set contains at least
    one even integer and false otherwise. If passed the empty set, your method should return false.*/

    public static void main(String[] args)
    {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println(hasEven(set));
    }

    public static boolean hasEven(Set<Integer> maybeEven)
    {
        for (int number : maybeEven)
        {
            if (number % 2 == 0)
            {
                return true;
            }
        }
        return false;
    }
}
