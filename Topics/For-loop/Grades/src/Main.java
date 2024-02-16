import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();

        int D = 0;
        int C = 0;
        int B = 0;
        int A = 0;

        for (int i = 0; i <= n; i++) {
            String grade = scanner.nextLine();
            if (grade.equals("D")) {
                D++;
            }

            if (grade.equals("C")){
                C++;
            }
            if (grade.equals("B")){
                B++;
            }
            if (grade.equals("A")){
                A++;
            }
        }
        System.out.println(D + " " + C + " " + B + " " + A);
    }
}