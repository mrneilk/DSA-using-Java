package DAY1;

import java.util.*;

public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks>90) {
            System.out.println("Excellent");
        } 
        else if(marks>80 && marks<90){
            System.out.println("Good");
        }
        else if(marks>70 && marks<80){
            System.out.println("Fair");
        }
        else if(marks>60 && marks<70){
            System.out.println("Meets Expectations");
        }
        else{
            System.out.println("Below Par");
        }
        sc.close();
    }
}
