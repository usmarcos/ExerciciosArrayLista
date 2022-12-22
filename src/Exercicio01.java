import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {

    /**
     * Escreva um programa Java contendo um ArrayList de inteiros chamado valores.
     * Peça para o usuário informar 5 valores inteiros e adicione-os individualmente no ArrayList.
     * Em seguida imprima os elementos do ArrayList, de forma individual, usando o laço for.
     */
    public static void main(String[] args) {
        ArrayList inteiro = new ArrayList();

        System.out.println("Insira o primeiro valor: ");
        inteiro.add(new Scanner(System.in).nextInt());
        System.out.println("Insira o segundo valor: ");
        inteiro.add(new Scanner(System.in).nextInt());
        System.out.println("Insira o terceiro valor: ");
        inteiro.add(new Scanner(System.in).nextInt());
        System.out.println("Insira o quarto valor: ");
        inteiro.add(new Scanner(System.in).nextInt());
        System.out.println("Insira o quinto valor: ");
        inteiro.add(new Scanner(System.in).nextInt());

        System.out.print("Os valores inseridos foram: ");
        inteiro.forEach(valor ->
                System.out.print(" " + valor));
    }
}