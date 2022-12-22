import Objetos.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio02 {
    /**
     * Crie um objeto chamado Cliente com os atributos: id, nome, idade, telefone.
     * Faça um programa para solicitar os dados de vários clientes e armazenar em um ArrayList até que se digite um número de ID negativo.
     * Em seguida exiba os dados de todos os clientes via SystemOut, formatando cada objeto separado por linhas.
     */
    public static void main(String[] args) {
       ArrayList <Cliente> novoCliente = new ArrayList<Cliente>();

       int id, idade;
       String nome, telefone;
        while(true){
            System.out.println("Digite o ID: ");
            id = new Scanner(System.in).nextInt();
            if (id<0){
                break;
            }
            System.out.println("Digite o nome: ");
            nome = new Scanner(System.in).nextLine();
            System.out.println("Digite a idade: ");
            idade = new Scanner(System.in).nextInt();
            System.out.println("Digite o telefone: ");
            telefone = new Scanner(System.in).nextLine();

            novoCliente.add(new Cliente(id, nome, idade, telefone));
        }
        System.out.println("Clientes adicionados a lista");
        for(int i = 0; i<novoCliente.size(); i++){
            novoCliente.get(i).print();

        }
//        novoCliente.forEach(cliente ->
//                novoCliente.get().print());
    }
}
