package edu.macalester.comp221.hw5;

public class RecursiveStaircase {
    private static int stepPerms(int n) {
        // Base cases: If n is less than 3, then return n. If n is equal to 3, then return 4. 
        if (n < 3) return n;
        if (n == 3) return 4;

        // Otherwise, return a recursive call:
        // From the target step n, Davis can jump from either step n-1, n-2, or n-3. 
        // We make a recursive call to this function for each and sum the return value. See the homework writeup for an example tracethrough for n=5.
        return stepPerms(n - 1) + stepPerms(n - 2) + stepPerms(n - 3);
    }

    public static void main(String[] args) {
        System.out.println(stepPerms(1));
        System.out.println(stepPerms(3));
        System.out.println(stepPerms(5));
        System.out.println(stepPerms(7));
    }
}
