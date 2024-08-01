package Default;

public class zoho2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
         int n=5;
         for(int i=1;i<=n;i++)
         {
        	
        	 for(int j=i;j<n;j++)
        	 {
        		 System.out.print("  ");
        	 }
        	 for(int j=1,p=i;j<=i;j++,--p)
        	 {
        		 System.out.print(p + " ");
        	 }
        	 System.out.println("");
         }
	}

}
