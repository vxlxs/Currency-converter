import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double input,result;
        System.out.println("Select currency");
        System.out.print("1 = usd"+ "    " + "2 = pln"+ "    " + " 3 = uah"+ "    " + " 4 = euro");
        choice = sc.nextInt();
        System.out.println(" Write amount of money");
        input = sc.nextDouble();
        switch (choice){
            case 1:
                result = input * 4.16;
                System.out.println(result + " pln");
                result = input * 40;
                System.out.println(result + " uah");
                result = input * 0.95;
                System.out.println(result + " euro");
                break;

            case 2 :
                result = input * 0.24;
                System.out.println(result + " usd");
            result = input * 9.93;
                System.out.println(result + " uah");
            result = input * 0.23;
                System.out.println(result + " euro");
                break;
            case 3 :
                result = input * 0.024;
                System.out.println(result + " usd");
                result = input * 0.10;
                System.out.println(result + " pln");
            result = input * 0.023;
                System.out.println(result + " euro");
            break;
            case 4 :
                result = input * 1.04;
                System.out.println(result + " usd");
            result = input * 4.34;
                System.out.println(result + " pln");
            result = input * 43;
                System.out.println(result + " uah");
            break;
            default:
                System.out.println("Invalide choice");
                break;
        }

    }
}