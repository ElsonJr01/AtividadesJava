package Questao4Tarefa1;

import java.util.Scanner;

public class Questao4Tarefa {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome do Eleitor: ");
            Scanner nome = new Scanner(System.in);
            String nomeEleitor = nome.nextLine();
            System.out.println("Digite a idade do aluno: \n");
            Scanner idade = new Scanner(System.in);
            int idadeEleitor = idade.nextInt();
            if (idadeEleitor < 16){
                System.out.println("O cidadão " + nomeEleitor + " nao pode votar. Motivo: menor de idade perante o TSE");
            }
            if (idadeEleitor > 16 && idadeEleitor < 18) {
                System.out.println("Eleitor " + nomeEleitor + " pode votar. Motivo: apto perante o TSE, mas sem obrigação de voto");
            }
            if (idadeEleitor > 16 && idadeEleitor < 65){
                System.out.println("Eleitor " +nomeEleitor + " deve votar obrigatoriamente");
                }
            if (idadeEleitor > 65){
                System.out.println("Eleitor " +nomeEleitor + " Vota, mas não é obrigatorio");
            }
        }
    }
}