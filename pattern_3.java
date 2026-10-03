
package bhakti;


public class pattern_3 {
    public static void main(String[] args) {
        int n=5;// n=5
        for (int i = 1; i <= n; i++)//outer loop it print number of rows
        {
            for(int j=0;j<=i;j++)// inner loop it print number of columns
            {
                System.out.print("*");
                
            }
            
            System.out.println();
            
        }
    }
   
}
