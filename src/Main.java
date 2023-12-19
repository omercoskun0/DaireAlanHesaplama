import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int r;
        double pi=3.14, acı, alan;

        System.out.print("r değeri giriniz: ");
        Scanner inp = new Scanner(System.in);
        r= inp.nextInt();
        System.out.print("Açı değeri giriniz : ");
        acı = inp.nextDouble();

        alan = (pi*(r*r)*acı) / 360;
        System.out.print("Alan: " + alan);

        /*
        int r;
        double pi = 3.14, alan, cevre;

        System.out.print("r değeri giriniz: ");
        Scanner inp = new Scanner(System.in);
        r = inp.nextInt();

        alan = pi * r * r;
        cevre = 2*pi*r;
        System.out.println("Çevre : " + cevre);
        System.out.print("Alan : " + alan);
        */
    }
}