public class solidRohmbusPattern {
    public static void main(String args[]){
        int n= 5;

        for(int i=1;i<=n;i++){
            
            //left side
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
        
            //right side
            for(int l=1;l<=n-i ; l++){
                System.out.print("*");
            }
        
            System.out.println();
        }
    }
}
