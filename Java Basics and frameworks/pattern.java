public class pattern {
    public static void main(String[] args) {
        int num = 4;
        for(int i = 1; i<=num ; i++){
            //spaces
            for(int j =1; j<=num-i-1; j++){
                System.out.print(" ");
            }
            // star
            System.out.print("*");
            if(i!=1){
                // spaces
                for(int j =1; j<=2*i-3; j++){
                System.out.print(" ");
            }
            // star
            System.out.print("*");


            }
            System.out.println();
        }
    }
}
