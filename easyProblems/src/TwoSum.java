//        Given an array of integers nums and an integer target,
//        return indices of the two numbers such that they add up to target.
//        You may assume that each input would have exactly one solution,
//         and you may not use the same element twice.
//        You can return the answer in any order.

/*
Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter NUmbers: ");
        String line = bufferedReader.readLine();
        String [] inputArray = line.split(" ");


        int arraySize = inputArray.length;
        if(arraySize != 0)
        {
            int[] array = new int[arraySize];
            for (int i = 0 ; i < arraySize; i++)
            {
                try
                {
                    array[i] =Integer.parseInt(inputArray[i]);
//                    System.out.println(array[i]);
                }
                catch (Exception EX)
                {
                    System.out.println("input is not in a number format");
                }
            }
        }
    }

    public int[] twoSum(int[] nums, int target) {
    int [] result= new int[2];
    return result;
    }

}
