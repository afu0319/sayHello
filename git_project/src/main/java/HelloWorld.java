import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isInternetBarTonight = sc.nextBoolean();
        if (isInternetBarTonight) {
            Say.goodbye();
        } else {
            Say.hi();
        }
    }
}
