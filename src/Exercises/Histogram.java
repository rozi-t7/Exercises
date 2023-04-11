package Exercises;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        int n;
        double p1Percentage;
        double p2Percentage;
        double p3Percentage;
        double p4Percentage;
        double p5Percentage;

        int cntP1 = 0;
        int cntP2 = 0;
        int cntP3 = 0;
        int cntP4 = 0;
        int cntP5 = 0;

        Scanner scanner = new Scanner(System.in);
        n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++);{
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber < 200) {
                cntP1++;
            } else if (currentNumber <= 399) {
                cntP2++;
            } else if (currentNumber <= 599) {
                cntP3++;
            } else if (currentNumber <= 899) {
                cntP4++;
            } else {
                cntP5++;
            }
        }
        p1Percentage = cntP1 * 100.0 / n;
        p2Percentage = cntP2 * 100.0 / n;
        p3Percentage = cntP3 * 100.0 / n;
        p4Percentage = cntP4 * 100.0 / n;
        p5Percentage = cntP5 * 100.0 / n;

        System.out.printf("%.2f%%%n", p1Percentage);
        System.out.printf("%.2f%%%n", p2Percentage);
        System.out.printf("%.2f%%%n", p3Percentage);
        System.out.printf("%.2f%%%n", p4Percentage);
        System.out.printf("%.2f%%%n", p5Percentage);
    }
}