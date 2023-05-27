import java.io.InputStream;
import java.util.Scanner;

public class Calculo {



    public static void main(String args[]){
        System.out.println("Digite a primeira nota: ");
        Scanner num1 = new Scanner(System.in);
        int nota1 = num1.nextInt();
        System.out.println("Digite a segunda nota: ");
        Scanner num2 = new Scanner(System.in);
        int nota2 = num2.nextInt();
        System.out.println("Digite a terceira nota: ");
        Scanner num3 = new Scanner(System.in);
        int nota3 = num3.nextInt();
        System.out.println("Digite a quarta nota: ");
        Scanner num4 = new Scanner(System.in);
        int nota4 = num4.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média é:");
        System.out.println(media);
    }



}
