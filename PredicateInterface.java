import java.util.*;
import java.util.function.Predicate;

public class PredicateInterface {

    public static void main(String[] args) {
        Predicate<String> p = (s) -> {
            if (s.equals("sam"))
                return true;
            return false;
        };

        System.out.println(p.test("sham"));

    }
}
