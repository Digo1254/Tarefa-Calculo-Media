public class Calculo {



    public static void main(String args[]){
    media();


    }

    private static void media(){
        int nota1 = 8;
        int nota2 = 6;
        int nota3 = 4;
        int nota4 = 6;

        int soma = nota1 + nota2 + nota3 + nota4;
        int fim = soma / 4;
        System.out.println("A média final é:" + fim);
    }
}
