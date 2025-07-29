public class prime_num {
    public static void main(String[] args) {
        int pr = 9;
        int count = 0;
        if(pr<=0){
            System.out.println("Invalid number enterd");
        }else if(pr==1){
            System.out.println("its not a prime no");
        }else{
            for(int i = 1; i<=pr ; i++){
                if(pr%i==0){
                    count++;
                }
            }
        }
        if(count==2){
            System.out.println("It is a prime ");
        }else{
            System.out.println("its not a prime");
        }
    }
}
