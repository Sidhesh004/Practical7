class Practical7 {
    public static void displaypatternS(int num){
        for(int row = 1; row <= 5; row++){
            for(int col = 1; col <=5; col++){
                if (row == 1 || row == 3 || row == 5 || row == 2 && col ==1 || row == 4 && col ==5 ) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    public static void displaypatternI(int num){
        for(int row = 1; row <=5; row++){
            for(int col = 1; col <=5; col++){
                if (row == 1 || row == 5 || col ==3) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    public static void displaypatternD(int num){
        int n= 5;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col <=n; col++){
                if (col == 1 || row == 1 && col<=n-1 || row == 5 && col<=n-1 || ((row>=2&row<=4)&col == 5)) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    public static void displaypatternH(int num){
        int n= 5;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col <=n; col++){
                if (col == 1|| col==5 || row==3) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    public static void displaypatternE(int num){
        int n = 5;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=n; col++){
                if (col==1 || row == 1 || row == 3 || row == 5) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    public static void displaypatternW(int num){
        int n = 5;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=n; col++){
                if (col == 1 || col == 5 || row==4&&col==2 || row==4&&col==4 || row==3&&col==3) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    public static void displaypatternA(int num){
        int n = 5;
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                if (col==1||col==5||row==1||row==3) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    public static void displaypatternR(int num){
        int n = 5;
        int k = 1;
        for(int row =1; row<=n; row++){
            for(int col = 1; col<=n; col++){
                if (col==1||row==1||row==3 || (col==5&row==2) || row+col==k) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            k+=2;
        }
        System.out.println();
        System.out.println();
    }
    
    public static void main(String[] args) {
        displaypatternS(5);
        displaypatternI(5);
        displaypatternD(5);
        displaypatternH(5);
        displaypatternE(5);
        displaypatternW(5);
        displaypatternA(5);
        displaypatternR(5);
    }
}
