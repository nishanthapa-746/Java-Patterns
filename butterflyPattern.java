
public class butterflyPattern {

    public void main(String args[]) {
        int n = 4;
        /*
        we have to dive the butterfly into two half 
        upper one and lower one 
        so that we can use combine the logic we use in earlier to gain this pattern.
        and the upper half further into 3 parts.
         */
        //upperhalf
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //logic for space.
            for (int k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //lower half
        for (int a = 0; a < n; a++) {

            for (int b = 1; b <= n - a; b++) {
                System.out.print("*");
            }

            for (int c = 1; c <= a; c++) {
                System.out.print("  ");
            }
            for (int d = 1; d <= n - a; d++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
