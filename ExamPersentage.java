// https://www.facebook.com/anushka.saine.735/posts/137136021429328
// subscribed by status gram
package com.company;
import java.util.Scanner;
public class ExamPersentage {
    public static void main(String[] args) {
        Scanner mr=new Scanner(System.in);
        System.out.println("Enter your 1st subject marks");
        float a=mr.nextFloat();
        System.out.println("Enter your 2nd subject marks");
        float b=mr.nextFloat();
        System.out.println("Enter your 3rd subject marks");
        float c=mr.nextFloat();
        System.out.println("Enter your  subject marks");
        float d=mr.nextFloat();
        System.out.println("Enter your 5th subject marks");
        float e=mr.nextFloat();
        float sum=a+b+c+d+e;
        float per1=sum/500*100;



    }
}
