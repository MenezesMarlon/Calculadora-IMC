import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        CalculoIMC();


    }

    public static void CalculoIMC() {
        Float peso;
        Float altura;
        Float imc;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        peso = scanner.nextFloat();
        System.out.print("Digite sua altura em Metros: ");
        altura = scanner.nextFloat();

        imc = peso / (altura * altura);
        System.out.println(imc);
    }

}