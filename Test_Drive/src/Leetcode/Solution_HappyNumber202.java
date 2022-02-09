package Leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution_HappyNumber202
{
    public static void main(String[] args)
    {
    	Scanner sc= new Scanner(System.in);
    	int ans = sc.nextInt();
        boolean res = isHappy(ans);
        System.out.println(res);
        sc.close();
    }
    
    static boolean isHappy(int ans) 
    {
    	if(ans == 1)
            return true;
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(ans);
        
        while(true)
        {
            int k = list.get(list.size() - 1);
            int sum = sums(k);
            if(sum == 1)
            {
                return true;
            }
            else if(list.contains(sum))
            {
                return false;
            }
            else
                list.add(sum);
        }
    }
    
    static int sums(int n)
    {
        int d = 0, sum =0;
        while(n != 0)
        {
            d = n % 10;
            sum+= d*d;
            n = n/ 10;

        }
        System.out.println(sum);
        return sum;
    }
}
