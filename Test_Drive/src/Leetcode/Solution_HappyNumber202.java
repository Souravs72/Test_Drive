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
/*
        int arr[] = new int[410];
        
        arr[0] = 0; arr[1] = 1;
        for(int i = 2; i< 410; i++)
        {
            arr[i] = -1;
        }
        
        
        
        
        for(int i = 2; i< 410; i++)
        {
            int k = sums(i);
            
            if(k == 1 || arr[k] == 1)
            {
                arr[i] = 1;
                for(int j = 2; j < 410; j++)
                {
                    if(arr[j]== -2)
                        arr[j]= 1;
                }
                break;
            }
            else if(arr[k] == -2 || arr[k] == 0)
            {
                arr[i] = 0;
                for(int j = 2; j < 410; j++)
                {
                    if(arr[j]== -2)
                        arr[j]= 0;
                }
                break;
            }
            else
                arr[k]-= 1;
           
        }
        if(arr[ans]== 0)
            return false;
        else
            return true;
*/