package ipa-practice-explore-site.quest2;

public class soln35mrk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower limit (l1): ");
        int l1 = sc.nextInt();

        System.out.print("Enter the upper limit (l2): ");
        int l2 = sc.nextInt();

        int[] nums = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int s = 0;
        int c = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > l1 && nums[i] < l2) {
                s += nums[i];
                c++;
            }
        }

        int ans = (c > 0) ? s / c : 0; // Avoid division by zero
        System.out.println("Average of numbers between l1 and l2: " + ans);

        sc.close();
    }
}
