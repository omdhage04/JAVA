/*
creating a teenager chaking system
import java.util.Scanner;
public class onlyIF{
        public static void main (String[] args){
            int num;
            Scanner ip = new Scanner(System.in);
            System.out.println("Enter Your age");
            num = ip.nextInt();
            if (num<18) {
                System.out.println("You are just a teenagaeer");
                
            }
            
            System.out.println("your welcome , your age is"+num)
}

}

*/
/* 

import java.util.Scanner;
public class onlyIF{
        public static void main (String[] args){
            int num;
            Scanner ip = new Scanner(System.in);
            System.out.println("Enter Your age");
            num = ip.nextInt();
            if (num == 0){
                System.out.println("really ");
            }
            if (num<18 && num > 0) {
                System.out.println("You are just a teenagaeer");
                
            }
            if(num>=18){
            
                System.out.println("your welcome , your age is"+num);
            }
}

}
*/

/*

//  level 1 : Even or odd Number
import java.util.Scanner;
public class onlyIF{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number to cheack its Even or Odd ");
        int num = ip.nextInt();
        if(num%2==0){
            System.out.println("Its an Even Number");
        }
        if(num%2!=0){
            System.out.println("Its an Odd Number");
        }
    }
}  
*/

// Level 2 : Find the largest number after taking the user input
import java.util.Scanner;
public class onlyIF{
    public static void main (String[] args){
        System.out.println("Lets cheack which is the largest Number");
        System.out.println("Enter the First Number");
        Scanner ip = new Scanner(System.in);
        int num1 = ip.nextInt();
        System.out.println("Enter the Second Number");
        int num2 = ip.nextInt();
        if (num1>num2){
            System.out.print(num1+"is the Largest number");
        }
        if (num1<num2){
            System.out.print(num2+"\nis the Largest number");
        }


    }
}
