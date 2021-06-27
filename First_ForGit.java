package com.company;

public class First_ForGit {

    public static int squirrel(int N) {

        int f = 1;                        // Factorial of the number.
        int firstNum = 0;                 // Store first numeral of number.

        for(int i = 1; i <= N; i++){      // Find the factorial of a number.
            f *= i;
        }

        // To get first numeral of a number.
        while (f > 0){
            firstNum = f;                // Keep the previous value of the number.
            f = (f - (f%10)) / 10;
        }

        return firstNum;
    }

}
