
public class trainglePatternAdv {

    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {//it will help to execute as the value of n .
            
            //first printing the spaces and then printing the * so that it can form shape
            for (int k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
