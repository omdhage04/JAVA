
import java.util.ArrayList;

public class ArrayList1{






    public static void main(String[] args) {
        // created ArrayList object
        //calling zero parameterized constructor of ArrayList class
        // default value of the zero parametrized constructor is 10;


        ArrayList pankaj = new ArrayList();
        pankaj.add("suradkar");
        System.out.println(pankaj);


        //calling intilized constructor of ArrayList class
        ArrayList Aditya = new ArrayList(40);
        Aditya.add("Tathe");
        System.out.println(Aditya);

        //calling Collection AddAll constructor of ArrayList class
        ArrayList added = new ArrayList(Aditya);
        System.out.println(Aditya);
    }
}