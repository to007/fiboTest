package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
private static int i = 0;
    private static ArrayList<Integer> fibo = new ArrayList<Integer>();
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
    private static int fiboTest(int x, int y, int z){
        fibo.add(i, y);
        if(x == y || x == z){
            System.out.println(x + " is a fibonacci number.");
            System.out.print("The numbers leading up to it are ");
            for(int j = 0;j < fibo.size(); j++){
                System.out.print(fibo.get(j) + ", ");
            }
            return 0;
        }else if(x < z){
            System.out.println(x + " is not a fibonacci number.");
            return 0;
        }else{
            i++;
            return fiboTest(x, z, y + z);
        }
    }
}
