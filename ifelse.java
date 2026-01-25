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

//5️⃣ Pass or Fail

//Input marks

// 40 → Pass

// 40 → Fail



import java.util.Scanner;
public class ifelse{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter your makes of Mathematics");
        int math = ip.nextInt();
        System.out.print("Enter your makes of Science");
        int science = ip.nextInt();
        System.out.print("Enter your makes of Physics");
        int phy = ip.nextInt();
        System.out.print("Enter your makes of English");
        int eng = ip.nextInt();
        System.out.print("Enter your makes of So-Science");
        int So = ip.nextInt();
        float result = (math+science+phy+eng+So)/5;
        if (result >= 40){
            System.out.println("you have "+result+"and you are pass");
        }else{
            System.out.println("you have "+result+"and you are Fail");
        }

    }
}






//login task
import java.util.Scanner;
public class ifelse{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter your ID to log in ");
        int id = ip.nextInt();
        System.out.println("Enter your Pass to log in ");
        int pa = ip.nextInt();
        if(id == 7878 && pa == 7872 ){
            System.out.println("Login Successful");
        }else{
            System.out.println("Faild invalid ID or Pass");
        }




    }
}
     */


/*7️⃣ Grade Calculator

90–100 → A

75–89 → B

60–74 → C

< 60 → Fail */
import java.util.Scanner;
public class ifelse{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter your Percentage \n");
        float per = ip.nextFloat();
        if(per < 0){
            System.out.println("Enter a Valid Percentage ");

        }else if(per < 60){
            System.out.println("you are Fail");

        }else if(per > 60 && per <74 ){
            System.out.println("You got C grade ");

        }else if(per > 75 && per  <89 ){
            System.out.println("you Got B grade");

        }else if(per >90 && per <= 100){
            System.out.println("you Got A grade");

        }else if(per > 100){
            System.out.println("Enter a Valid Grade");

        }
    }
}