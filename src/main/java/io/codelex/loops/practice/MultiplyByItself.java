package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i=2, n;

        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int result = 1;
        //todo - complete loop to multiply i with itself n times, it is NOT allowed to use Math.pow()
        for (int j = 0; j < n; j++) {
          result *= i;
        }
        System.out.println(result);

    }

}
