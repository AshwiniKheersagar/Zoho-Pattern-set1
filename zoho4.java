package Default;

public class zoho4 {

    public static void main(String[] args) {
        
        String str = "ASHWINI";
        int n = str.length();
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (i == j) 
                {
                    System.out.print(str.charAt(i) + " ");
                } 
                else if (i + j == n - 1) 
                {
                    System.out.print(str.charAt(i) + " ");
                } 
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
