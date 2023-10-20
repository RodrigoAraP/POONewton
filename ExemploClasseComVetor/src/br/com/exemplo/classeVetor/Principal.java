package br.com.exemplo.classeVetor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String nome, buscar;
        int matricula, i;
        Aluno[] alunos = new Aluno[10];
        Scanner input = new Scanner(System.in);

        for (i=0;i<2;i++){
            System.out.print("Digite matricula: ");
            matricula = input.nextInt();
            System.out.print("Digite nome: ");
            nome = input.nextLine();
            nome = input.nextLine();
            alunos[i] = new Aluno(nome,matricula);
            System.out.println(alunos[i].mostrar());
        }

        System.out.print("Digite um nome para buscar: ");
        buscar=input.nextLine();
        for (i=0;i<2;i++){
            if (alunos[i].getNome().equals(buscar))
                System.out.println("Nome encontrado com sucesso.");
        }
    }
}
