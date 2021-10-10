public class Solution {

    public static void main(String[] args) {

        pattern7(5);

    }

    public static void pattern1(int n) {
        for(int row=0; row<n; row++){ 
            for(int col=0; col<n; col++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern2(int n) {
        for(int row=0; row<n; row++){ 
            for(int col=0; col<=row; col++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern3(int n) {

        for (int row = 0; row < n; row++) {
            // (n-row)*2 for extra spaces, else (n-row)
            for (int col = 0; col <= (n-row)*2; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void pattern4(int n) {
        // method 1
        // for (int row = 1; row <= n*2; row=row+2) {
        //     for (int col = 1; col <= row; col++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // method 2
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= (row*2)-1; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            for(int col=1; col<= n - row; col++){
                System.out.print(" ");
            }
            for (int col = 0; col < (row*2) - 1; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pattern6(int n) {
        for (int row = n-1; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void pattern7(int n){
        for(int row = n-1; row >= 0; row--){
            for(int col = 0; col <= (n - row); col++){
                System.out.print(" ");
            }
            for(int col = 0; col <= row; col++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}