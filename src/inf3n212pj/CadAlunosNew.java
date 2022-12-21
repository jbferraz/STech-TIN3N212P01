/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.ArrayList;
import java.util.Scanner;
import model.Aluno;

/**
 *
 * @author jbferraz
 */
public class CadAlunosNew {

    static ArrayList<Aluno> alunos = new ArrayList<>();
    static Scanner leia = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opM;
        do {
            menu();
            opM = leiaInt();
            switch(opM){
                case 1:
                    cadAluno();
                    break;
                case 2:
                    break;
                case 3:
                    imprimeAlunos();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("Aplicação encerrada!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opM != 0);
    }//fim main

    public static void menu() {
        System.out.println(".: Sistema de Alunos :.");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Editar Aluno");
        System.out.println("3 - Imprimir Todos Alunos");
        System.out.println("4 - Deletar Aluno");
        System.out.println("5 - Imprimir Alunos Ativos");
        System.out.println("0 - Sair");
        System.out.print("Digite aqui: ");
    }//fim menu

    public static void cadAluno() {
        System.out.println("Cadastro de Aluno");
        System.out.print("Digite o CPF do aluno: ");
        String cpf = leia.nextLine();
        if (!verCPF(cpf)) {//"!" serve para negar o retorno do verCPF()
            System.out.print("Digite a matricula: ");
            int matricula = leiaInt();
            System.out.print("Informe o nome: ");
            String nome = leia.nextLine();
            System.out.print("Informe o sexo: ");
            String sexo = leia.nextLine();
            System.out.print("Informe a idade: ");
            int idade = leiaInt();
            System.out.print("Informe o telefone: ");
            String telefone = leia.nextLine();
            boolean status = true;
            System.out.print("Informe o endereço: ");
            String endereco = leia.nextLine();
            Aluno a = new Aluno(matricula, cpf, nome, sexo, idade, telefone, status, endereco);
            alunos.add(a);
        } else {
            System.out.println(cpf + " já existe!");
        }
    }//fim cadAluno

    public static boolean verCPF(String cpf) {
        for (Aluno aluno : alunos) {//For para percorreer objeto
            if (aluno.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }//fim verCPF

    public static int leiaInt() {
        try {
            Scanner leia = new Scanner(System.in);
            return leia.nextInt();
        } catch (Exception e) {
            System.out.print("Valor inserido inválido, tente novamente: ");
            return leiaInt();
        }
    }

    public static void imprimeAlunos() {
        System.out.println("Lista de Alunos");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.toString());
        }
    }
}
