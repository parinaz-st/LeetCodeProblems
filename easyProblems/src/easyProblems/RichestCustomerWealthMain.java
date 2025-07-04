package easyProblems;

/**
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
 *
 * A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
 *
 *
 *
 * Example 1:
 *
 * Input: accounts = [[1,2,3],[3,2,1]]
 * Output: 6
 * Explanation:
 * 1st customer has wealth = 1 + 2 + 3 = 6
 * 2nd customer has wealth = 3 + 2 + 1 = 6
 * Both customers are considered the richest with a wealth of 6 each, so return 6.
 * Example 2:
 *
 * Input: accounts = [[1,5],[7,3],[3,5]]
 * Output: 10
 * Explanation:
 * 1st customer has wealth = 6
 * 2nd customer has wealth = 10
 * 3rd customer has wealth = 8
 * The 2nd customer is the richest with a wealth of 10.
 * Example 3:
 *
 * Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
 * Output: 17
 *
 *
 * Constraints:
 *
 * m == accounts.length
 * n == accounts[i].length
 * 1 <= m, n <= 50
 * 1 <= accounts[i][j] <= 100
 */
public class RichestCustomerWealthMain {
    public static void main(String[] args) {
        int [][]  newarray = new int [][]{
                {2,8,7},{7,1,3},{1,9,5}};
        System.out.println("Richest Customer Wealth: " + maximumWealth(newarray));
    }

    public static int maximumWealth(int[][] accounts) {

        int m = accounts.length;
        int n = accounts[0].length;
        if(m < 1 || m > 50 || n < 1 || n > 50){
            System.out.println("Wrong array size!");
            return 0;
        }
        int [] wealthArray = new int[accounts.length];
        int wealthiestCustomer = 0;

        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[0].length; j++){
                if(accounts[i][j] > 100 || accounts[i][j] < 1){
                    System.out.println("wrong array value!");
                    return 0;
                }
                wealthArray[i] += accounts[i][j];
            }
            if(i != 0 && (wealthArray[i] >= wealthArray[wealthiestCustomer]))
                wealthiestCustomer = i;
        }
        return wealthArray[wealthiestCustomer];
    }
}
