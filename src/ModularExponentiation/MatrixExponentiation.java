/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModularExponentiation;

/**
 *
 * @author krish
 */
public class MatrixExponentiation {
    public static int[][] matmul(int a[][],int b[][])
    {
        int k=a.length;
        int[][] prod=new int[k][k];
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<k;j++)
            {
                prod[i][j]=0;
                for(int s=0;s<k;s++)
                {
                    prod[i][j] += a[i][s]*b[s][j];
                }
            }
        }
        return prod;
    }

	public static int[][] mulExp(int m[][],int n)
	{
	    int k=m.length;
	    int[][] res=new int[k][k];
	    for(int i=0;i<m.length;i++)
	        res[i][i]=1;
        while(n>0)
        {
            if((n&1)==1){
                res=matmul(res,m);
            }
            m=matmul(m,m);
            n=n>>1;
        }
	    return res;
	}

	// Driver method
	public static void main(String args[])
	{
		int a[][] = {{1,2},{3,4}};
		int n = 2;
		int k=a.length;
		int[][] res=new int[k][k];
		res=mulExp(a,n);
		
		for(int i=0;i<k;i++)
		{
		    for(int j=0;j<k;j++)
		        System.out.print(res[i][j]+" ");
		    System.out.println();
		}
		
	}
}
