import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int squirrelN = scanner.nextInt();
        int nutK = scanner.nextInt();

        System.out.println(nutK / squirrelN);
    }
}