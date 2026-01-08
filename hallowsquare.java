public class hallowsquare {
    public static void main(String[] args) {
        int n=5;

        for (int i=0; i<n ; i++)
        {
            for(int j =0; j<n ; j++)
            {
                /*so here we are trying to make a java program where we see hallow square
                hallow square- fill from outside empty inside
                */
               // taking output in array format and executing the logic 
                if(i== 0 || i==4 || j==0 || j==4 )
                {
                    System.out.print("-");
                }
                else{
                    System.out.print(" ");//space
                }
            System.out.print( " ");
            }
            System.out.println();
        }
    }
}
