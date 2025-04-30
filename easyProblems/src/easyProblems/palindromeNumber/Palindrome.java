package easyProblems.palindromeNumber;

import java.util.ArrayList;
import java.util.List;

public class Palindrome

{
    public static void main(String[] args) {

        int palindrome1 = 123;
        boolean resault = IsPalindrome2(palindrome1);


//        int palindrome2 = (palindrome1 % 10) * (int)Math.pow(10, digitCount-1) +
//                (palindrome1 % 100)/10 * (int)Math.pow(10, digitCount-2) +
//                (palindrome1 % 1000)/100 * (int)Math.pow(10, digitCount-3) +
//                (palindrome1/1000) *  (int)Math.pow(10, digitCount-4);
//        System.out.println("palindrome1: " + palindrome1 + ",palindrome2: " + palindrome2);



    }

    public  static boolean isPalindrome(int x)
    {
        int palindrome1 = x;
        int count = 0;
        int digitCount = 1;
        boolean cntn= true;
        int xx = palindrome1;
        int y = palindrome1;
        int taghsimRes, baghimandehRes;
        int i,j;
        int palindrome2 = 0;
        List<Integer> digitReversLSt = new ArrayList<>();


        if ( ( Math.pow(-2, 31) > palindrome1) || (palindrome1 >= Math.pow(2,31)-1) )
        {
            System.out.println("not valid Number");
            return false;
        }
        if (palindrome1 < 0)
        {
            System.out.println("digit manfi, not palindrome! ");
            return false;

        }
        // chand raghamie
        while (true)
        {
            if(palindrome1/Math.pow(10,digitCount) < 1)
                break;
            digitCount ++;
        }
        System.out.println("digitCount: " + digitCount);

        while(cntn)
        {
            taghsimRes = xx / 10;
            baghimandehRes = y % 10;
            digitReversLSt.add(baghimandehRes);
            if(taghsimRes == 0)
            {
                cntn = false;
                break;
            }
            xx = taghsimRes;
            y = taghsimRes;
        }
        for (j = digitCount-1 , i =0; j>=0 ; j--, i++)
        {
            palindrome2 += digitReversLSt.get(i) * Math.pow(10, j);
        }

        System.out.println("digit:         " + palindrome1 + "\n" + "reverse digit: " + palindrome2);

        if(palindrome1 == palindrome2)
        {
            System.out.println("palindrome!");
            return true;
        }
        else
        {
            System.out.println("not palindrome!");
            return false;
        }

    }
    public static boolean IsPalindrome2(int x) {
        // Special cases:
        // As discussed above, when x < 0, x is not a palindrome.
        // Also if the last digit of the number is 0, in order to be a palindrome,
        // the first digit of the number also needs to be 0.
        // Only 0 satisfy this property.
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
        return x == revertedNumber || x == revertedNumber/10;
    }

}
