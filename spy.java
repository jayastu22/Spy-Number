//without using return type
import java.util.Scanner;
class spy
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int ip = sc.nextInt();
        int sum = 0;
        int product = 1;
        while(ip>0){
            int rem = ip%10;
            sum = sum +rem;
            product = product*rem;
            ip = ip/10;

        }if(sum == product){
            System.out.println("it is spy number");
        }else{
            System.out.println("it is not spy number");
        }
    }
}