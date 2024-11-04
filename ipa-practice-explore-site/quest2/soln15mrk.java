package ipa-practice-explore-site.quest2;

import java.util.*;

public class soln15mrk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;

        while (n != 0) {
            int r = n % 10;
            sum += r;
            n = n / 10;
        }

        if (sum % 3 == 0) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        sc.close();
    }
}
