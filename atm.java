import java.util.Scanner;

class atm{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT THYE AMNT TO BE WITHDRAWL: ");
        int x=sc.nextInt();
        double y=sc.nextDouble();
        if(x%5==0){
            System.out.println(String.format("%.2f",  y-(x+0.50)));
        }
        else{
            System.out.println("invalid transaction");
            System.out.println("aman");
        }
    }
}