/* 
making a pattern of traingle + some extra ideas to print 1 & 0 patterns questions.
*/


public class trianglePattern {
    public static void main (String args[]){
        int n=5;

        for (int i=0 ; i<=n ; i++) // it will help to execute upto 5 lines
        {
            for (int j= 0; j<i ; j++) // increase the number to print by 1 so that it will help to form triangle
            {
                //just adding other pattern question in this program.
                if((i+j)% 2 == 0){
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}
