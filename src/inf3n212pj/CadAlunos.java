/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

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
        Aluno juca = new Aluno(123, "321", "Juca Bala", "Masculino",
                55, "51999889988", true, "Vai saber");
        System.out.println("Aluno: " + juca.toString());
        System.out.println("Nome: " + juca.getNome());
        juca.setNome("Juca Bala das Candongas");
        System.out.println("Aluno: " + juca.toString());
    }

}
