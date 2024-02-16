import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();

        if (H >= A){
            if(H >= B){
                System.out.println("Excess");
            } else {
                System.out.println("Normal");
            }
        }else {
            System.out.println("Deficiency");
        }
        }
    }
