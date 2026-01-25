/*
import java.util.Scanner;

public class ifelse {
    public static void main (String[] args){
        // chake where the age is adult or teenager 
        System.out.println("Enter you age to cheack the conditon");
        Scanner ip = new Scanner(System.in);
        int age;
        age = ip.nextInt();
        if (age >= 18){
            System.out.println("Congrats you are an adult ");  
              }
        else{
            System.out.println("you are just a teenager");

        }
    }
    
}








// check the age to the current date

import java.util.Scanner;
public class ifelse{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int today = 2026;
        int birth;
        System.out.println("Enter Your birth year to calcultae your age ");
        birth = ip.nextInt();
        if(birth == 0){
            System.out.println("Enter the valid age ");
        }
        else{
            int result = today - birth;
            System.out.println("Hey your age is "+result);
        }
    }
}


import java.util.Scanner;
public class ifelse{
    public static void main(String[] args) {
        System.out.println("Enter the number tp cheack the even or odd");
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        if(num % 2 == 0){
            System.out.println("Its an Even number");        }
        else{
            System.out.println("Its an Odd number");
        }


    }
}


*/
import java.util.Scanner;
public class ifelse{
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner io = new Scanner(System.in);
        int num  = io.nextShort();
        if(num > 0){
            System.out.println("Its a Positive ");

        }
        else if(num == 0){
            System.out.println("Its a Zero ");

        }else{
            
            System.out.println("Its a Negative ");

        }
        }
    }



