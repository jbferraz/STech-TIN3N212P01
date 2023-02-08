/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inf3n212pj;

import model.Carro;
import model.Pessoa;

/**
 *
 * @author jbferraz
 */
public class PessoaCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa p1 = new Pessoa();
        p1.setNome("Jair");
        p1.setCpf("123");
        p1.setCelular("51999889988");
        
        Pessoa p2 = new Pessoa("Ferdinando", "321", "51988998899");
        
        Carro car1 = new Carro();
        car1.setPlaca("ABC1234");
        car1.setMarca("Fiat");
        car1.setModelo("Palio");
        car1.setAnoFab(2008);
        car1.setAnoMod(2009);
        car1.setProprietario(p2);
        
        Carro car2 = new Carro("ABC321", "Peugeot", "405 GRI", 
                1995, 1996, p1);
        
        Carro car3 = new Carro("ABB1122", "Renaut", "Duster", 
                2020, 2021, p2);
        
        System.out.println("Pessoas:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("\nCarros");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
    
}
