package estudosProva;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int num1 = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = sc.nextInt();

            int resultado = num1 / num2;
            System.out.println("Resultado da divisão: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: você deve digitar apenas números inteiros.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Scanner fechado. Programa encerrado.");
        }
    }
}
