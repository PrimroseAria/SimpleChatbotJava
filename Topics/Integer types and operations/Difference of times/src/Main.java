import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int second = scanner.nextInt();
        int hour2 = scanner.nextInt();
        int minute2 = scanner.nextInt();
        int second2 = scanner.nextInt();

        int time2Total = (hour2 * 3600) + (minute2 * 60) + (second2);
        int timeTotal = (hour * 3600) + (minute * 60) + (second);
        System.out.println(time2Total - timeTotal);
    }
}