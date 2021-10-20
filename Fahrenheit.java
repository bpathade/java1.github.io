import java.util.Scanner;

public class Fahrenheit{

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int far = Sc.nextInt();
        int cel = (far - 32) * 5/9;
        System.out.printf("%d Fahrenheit is %d Celsius", far, cel);
    }
}