import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();

        int perfect = 0;
        int larger = 0;
        int smaller = 0;

        for (int i = 0; i < n; i++){
            int p = scanner.nextInt();

            if (p == 0){
                perfect++;
            }else if (p < 0){
                smaller++;
            }else{
                larger++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}