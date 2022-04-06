package GeeksForGeeks;

import java.util.Scanner;

public class Matrix_Modify
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int matrix[][] = new int[m][n];
		
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
				matrix[i][j] = sc.nextInt();
		}
		Matrix_Modify ob = new Matrix_Modify();
		ob.booleanMatrix(matrix);
		sc.close();
	}
	void booleanMatrix(int matrix[][])
    {
        int row = matrix.length, col = matrix[0].length;
        int row_arr[] = new int[row];
        int col_arr[] = new int[col];
        
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(matrix[i][j] == 1)
                {
                    row_arr[i] = 1;
                    col_arr[j] = 1;
                }
            }
        }
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(row_arr[i] == 1 || col_arr[j] == 1)
                    matrix[i][j] = 1;
            }
        }
        
        System.out.println();
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
            	System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
