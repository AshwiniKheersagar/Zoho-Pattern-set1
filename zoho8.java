package Default;

public class zoho8 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int n=3;
        int size=n*2-1;
        int [][] matrix=new int[size][size];
        int mincol=0,maxcol=size-1;
        int minrow=0,maxrow=size-1;
        int value=n;
        while(value>0)
        {
        	for(int i=mincol;i<=maxcol;i++)
        	{
        		matrix[minrow][i]=value;
        	}
        	for(int i=minrow+1;i<=maxrow;i++)
        	{
        		matrix[i][maxcol]=value;
        	}
        	for(int i=maxcol;i>=mincol;i--)
        	{
        		matrix[maxrow][i]=value;
        	}
        	for(int i=maxrow-1;i>minrow;i--)
        	{
        		matrix[i][mincol]=value;
        	}
        	value--;
        	mincol++;
        	minrow++;
        	maxcol--;
        	maxrow--;
        }
        
        for(int i=0;i<size;i++)
        {
        	for(int j=0;j<size;j++)
        	{
        		System.out.print(matrix[i][j]+" ");
        	}
        	System.out.println(" ");
        }
	}

}
