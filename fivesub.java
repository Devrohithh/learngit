import java.util.Scanner;

public class fivesub {
    public static void main(String[] args) {
        System.out.println("Enter your marks of five subjects:");
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Subject 1:");
        float a = sc.nextFloat();
        System.out.println("Enter marks of Subject 2:");
        float b = sc.nextFloat();
        System.out.println("Enter marks of Subject 3:");
        float c = sc.nextFloat();
        System.out.println("Enter marks of Subject 4:");
        float d = sc.nextFloat();
        System.out.println("Enter marks of Subject 5:");
        float e = sc.nextFloat();
        float total = a+b+c+d+e;
        float percentage = (total/500)*100;
        System.out.println("Total percentage is:"+percentage);
    }
}
