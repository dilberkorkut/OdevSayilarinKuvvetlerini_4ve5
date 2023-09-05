import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdırma

        int n;

        Scanner input = new Scanner(System.in);

        System.out.println("Sayi Giriniz: ");
        n = input.nextInt();

        System.out.println("\n4'un kuvvetleri");
        for(int i = 1; i <= n; i *=4){
            System.out.println(i);
        }

        System.out.println("\n5'in kuvvetleri");
        for(int i = 1; i <= n; i *=5){
            System.out.println(i);
        }


    }
}