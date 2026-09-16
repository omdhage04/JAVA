import java.util.function.*;

public class PredicateI {
    public static void main(String[] args) {
        Predicate<String> p = (s) -> {
            if (s.equals("Ram"))
                return true;
            return false;
        };
        System.out.println(p.test("suresh"));

        Predicate<Integer> obj = (t) -> {
            if (t >= 18)
                return true;
            return false;
        };
        System.out.println(obj.test(78));

        if (obj.test(34) == true) {
        }

    }

}
