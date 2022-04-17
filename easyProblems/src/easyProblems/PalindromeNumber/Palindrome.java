package easyProblems.PalindromeNumber;

public class Palindrome {
    public static void main(String[] args) {

        int palindrome1 = 1101;

        int count = 0;

        if ((palindrome1 < Math.pow(-2, 31)) || (palindrome1 > Math.pow(2,31)))
        {
            System.out.println("not valid Number");
            return;
        }
        int digitCount = 1;
        while (true)
        {
            if(palindrome1/Math.pow(10,digitCount) < 1)
                break;
            digitCount ++;
        }
        System.out.println("digitCount: " + digitCount);

        int palindrome2 = (palindrome1 % 10) * (int)Math.pow(10, digitCount-1) +
                (palindrome1 % 100)/10 * (int)Math.pow(10, digitCount-2) +
                (palindrome1 % 1000)/100 * (int)Math.pow(10, digitCount-3) +
                (palindrome1/1000) *  (int)Math.pow(10, digitCount-4);
        System.out.println("palindrome1: " + palindrome1 + ",palindrome2: " + palindrome2);


    }
}
