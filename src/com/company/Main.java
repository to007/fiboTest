package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("What integer would you like to check?");
            int w = input.nextInt();
            fiboTest(w,0,1);
        }
        catch(java.util.InputMismatchException e){
            System.out.println("That is not even an integer!");
        }

    }
    public static int fiboTest(int x, int y, int z){
        ArrayList fibo = new ArrayList<>();
        if(x == y || x ==z){
            System.out.println(x + " is a fibonacci number.");
            return 0;
        }else if(x < z){
            System.out.println(x + " is not a fibonacci number.");
            return 0;
        }else{
            fibo.add(z)
            return fiboTest(x, z, y + z);
        }
    }
}
