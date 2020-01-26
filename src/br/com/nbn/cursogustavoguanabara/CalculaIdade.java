/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nbn.cursogustavoguanabara;

import java.util.Scanner;

/**
 *
 * @author Netto
 */
public class CalculaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano de Nascimento: ");
        int nasc = teclado.nextInt();
        int i = 2015 - nasc;
        System.out.println("Sua idade é "  + i );
        if(i>=18 ){ 
            System.out.println("Maior Idade ");
        } else{ 
            System.out.println("Menor de Idade");
        }
    }
}
       
