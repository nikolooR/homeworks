package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        int lowerBound = 1;
        int upperBound = 100;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
        }
        average = (double) sum / upperBound;
        System.out.printf("The sum of %d to %d is %d %n", lowerBound, upperBound, sum);
        System.out.printf("The average is %.1f", average);
    }
}
