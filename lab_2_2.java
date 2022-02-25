package lesson_02;
import java.util.Scanner;

public class lab_2_2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number:");
        int inputInt = scanner.nextInt();
        System.out.println(inputInt);
        int result = inputInt % 2;
        if (result == 0){
            System.out.println("this is even number");
        }else{
            System.out.println("this is odd number");
        }


    }
}
