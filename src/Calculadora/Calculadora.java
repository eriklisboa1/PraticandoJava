package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void LimparTela() {
        for (int i = 0; i < 30; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int a, b;
        boolean run = true;
        while (run) {

            System.out.println("1-SOMAR:\n2-MULTPLICAR:\n3-SUBTRAIR:\n4-DIVIDIR:\n5-SAIR:\n");
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    //LimparTela();
                    System.out.println("Digite o primeiro Valor: ");
                    a = scanner.nextInt();
                    System.out.println("Digite o Segundo valor Valor: ");
                    b = scanner.nextInt();
                    int somar = somar(a, b);
                    System.out.println("Resultado = " + somar);
                    break;
                case 2:
                    // LimparTela();
                    System.out.println("Digite o primeiro Valor: ");
                    a = scanner.nextInt();
                    System.out.println("Digite o Segundo valor Valor: ");
                    b = scanner.nextInt();
                    int multiplicar = multiplicar(a, b);
                    System.out.println("Resultado = " + multiplicar);

                    break;
                case 3:
                    System.out.println("Digite o primeiro Valor: ");
                    a = scanner.nextInt();
                    System.out.println("Digite o Segundo valor Valor: ");
                    b = scanner.nextInt();
                    int subtrair = subtrair(a, b);
                    System.out.println("Resultado = " + subtrair);
                    //LimparTela();
                    break;
                case 4:
                    System.out.println("Digite o primeiro Valor: ");
                    float i = scanner.nextInt();
                    System.out.println("Digite o Segundo valor Valor: ");
                    float p = scanner.nextInt();
                    float dividir = dividir(i,p);
                    System.out.println("Resultado = " + dividir);
                    //LimparTela();
                    break;
                case 5:
                    run = false;
                    LimparTela();
                    System.out.println("Programa Encerreado");
                    break;
                default:
                     LimparTela();
                    System.out.println("Digite uma opção correta:");
                    break;
            }
        }
    }


    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static float dividir(float a, float b) {
        return a / b;
    }


}

