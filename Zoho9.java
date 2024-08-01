package Default;

public class Zoho9 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int n=5;
        for(int i=1;i<=n;i++)
        {
        	int p=i-1;
        	for(int j=i;j<n;j++)
        	{
        		System.out.print("  ");
        	}
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print((p--)+" ");
        	}
        	p+=2;
        	for(int j=1;j<i;j++)
        	{
        		System.out.print((p++)+" ");
        	}
        	
        	System.out.println(" ");
        }
        
	}

}
