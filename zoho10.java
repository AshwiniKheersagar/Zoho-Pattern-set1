package Default;

public class zoho10 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="zohocorporationteam";
		
		int n=(str.length()/3)+1;
		
        for(int i=1,p=0;i<=n;i++)
        {
        	for(int j=1;j<=n;j++)
        	{
        		if(i == 1 )
        		    System.out.print(str.charAt(p++)+" ");
        		else if(i + j == n + 1)
        			System.out.print(str.charAt(p++)+" ");
        		else if(i == n)
        			System.out.print(str.charAt(p++)+" ");
        		else
        			System.out.print("  ");
        	}
        	System.out.println("");
        }
	}

}
