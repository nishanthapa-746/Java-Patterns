public class inverseTrainglePattern {
    public static void main(String[] args) {
        int n= 5;

        for(int i=0; i<n; i++){
            /* 
               we start with 0 index
               so that we print first 5 then 4 ...
               so index is increasing by 1 and in innerloop we have to deduct to 1 so we use i
               (n-1) condition will be perfect to execute the code.
            */
            for(int j= 0 ; j<n-i; j++){
                System.out.print("1 ");
            }
            System.out.println();

        }
    }
}
