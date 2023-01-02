import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int choice ;
        do {
            System.out.println("For the evaluation of the factorial of a number enter a number not equal to -1, enter -1 to exit");
            choice=Integer.parseInt(sc.nextLine());
            if(choice!=-1){
                System.out.println("Enter the number for which compute the operation");
                int a=Integer.parseInt(sc.nextLine());
                System.out.println("the factorial of "+a+" is: "+factorial(a));
            }
        }while(choice!=-1);

    }
    protected static int factorial(int a){
        if(a>0){
            return a*factorial(a-1);
        }
        return 1;
    }
}