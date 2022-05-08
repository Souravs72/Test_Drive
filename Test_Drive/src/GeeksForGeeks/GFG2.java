package GeeksForGeeks;

import java.util.*;
public class GFG2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t;
		t =sc.nextInt();
		for (int l = 0; l < t; l++)
		{
			ArrayList<Integer> A = new ArrayList<Integer>();
			int q =sc.nextInt();
			
			for (int i = 0; i < q; i++)
			{
				char c =sc.next().charAt(0);
				G g =new G();
				if(c=='a')
				{
					int x = sc.nextInt();
					g.add_to_ArrayList(A, x);
				}
				if(c=='b')
				{
					g.sort_ArrayList_Asc(A);
				}
				if(c=='c')
				{
					g.reverse_ArrayList(A);
				}
				if(c=='d')
				{
					System.out.print(g.size_Of_ArrayList(A)+" ");
				}
				if(c=='e')
				{
					g.print_ArrayList(A);
				}
				if(c=='f')
				{
					g.sort_ArrayList_Desc(A);
				}
			}
			System.out.println();
		}
		
	}
}
class G
{
    /*inserts an element x at 
    the back of the ArrayList A */
    void add_to_ArrayList(ArrayList<Integer> A, int x)
    {
    	A.add(x);
    }	
	
    /*sort the ArrayList A in ascending order*/
    void sort_ArrayList_Asc(ArrayList<Integer> A)
    {
	    Collections.sort(A);
    }
	
    /*reverses the ArrayList A*/
    void reverse_ArrayList(ArrayList<Integer> A)
    {
	    Collections.reverse(A);
    }
	
    /*returns the size of the ArrayList A */
    int size_Of_ArrayList(ArrayList<Integer> A)
    {
    	return A.size();
    }
	
    /*sorts the ArrayList A in descending order*/
    void sort_ArrayList_Desc(ArrayList<Integer> A)
    {
    	Collections.sort(A);
    	Collections.reverse(A);
    }
	
    /*prints space separated 
    elements of ArrayList A*/
    void print_ArrayList(ArrayList<Integer> A)
    {
       for(int i =0;i<A.size();i++)
       {
           System.out.print(A);
       }
    }
}
