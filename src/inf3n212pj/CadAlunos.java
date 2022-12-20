/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.Scanner;
import model.Aluno;

/**
 *
 * @author jbferraz
 */
public class CadAlunos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno juca = new Aluno(123, "999", "Juca Bala", "Masculino",
                55, "51999889988", true, "Vai saber");
        System.out.println("Nome: " + juca.getNome());
        //atualiza no do Juca para nome completo
        juca.setNome("Juca Bala das Candongas");
        System.out.println("Aluno: " + juca.toString());

        //.: Criar novo objeto aluno com seus dados logo abaixo :.
        Aluno jair = new Aluno(321, "666", "Jair Ferraz", "Masculino",
                40, "51988998899", false, "Gravataí");
        System.out.println("Aluno: " + jair.toString());

        //Criar novo aluno utilizando a leitura no console pelo Scanner
        Scanner leia = new Scanner(System.in);
        int matricula;
        String cpf;
        String nome;
        String sexo;
        int idade;
        String telefone;
        boolean status;
        String endereco;
        System.out.print("Informe a matricula: ");
        matricula = leia.nextInt();
        leia.nextLine();
        System.out.print("Informe o CPF: ");
        cpf = leia.nextLine();
        System.out.print("Informe o Nome: ");
        nome = leia.nextLine();
        System.out.print("Informe o Sexo (M/F): ");
        sexo = leia.nextLine();
        System.out.print("Informe a idade: ");
        idade = leia.nextInt();
        leia.nextLine();
        System.out.print("Informe o telefone: ");
        telefone = leia.nextLine();
        System.out.print("Informe o endereço: ");
        endereco = leia.nextLine();
        System.out.print("Aluno ativo? Digite: 1 Sim | 2 Não: ");
        int valorStatus = leia.nextInt();
        if (valorStatus == 1) {
            status = true;
        } else {
            status = false;
        }
        Aluno aluno1 = new Aluno(matricula, cpf, nome, sexo, idade, telefone, status, endereco);
        System.out.println("Aluno 1: " + aluno1.toString());
    }//fim da main

}
