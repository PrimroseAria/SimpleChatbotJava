import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String word = scanner.nextLine();
        int rangeStart = scanner.nextInt();
        int rangeEnd = scanner.nextInt();

        System.out.println(word.substring(rangeStart, rangeEnd + 1));
    }
}