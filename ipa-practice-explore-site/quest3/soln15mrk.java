package ipa-practice-explore-site.quest1;

import java.util.*;

public class soln15mrk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Enter a number: ");
            int input = sc.nextInt();

            if (input > 0 && input % 2 == 0) {
                s += input;
            }
        }

        System.out.println("Sum of positive even numbers: " + s);
        sc.close();
    }
}
