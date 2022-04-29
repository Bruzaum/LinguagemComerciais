/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.hello;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String produto = scan.nextLine();
        float valor = scan.nextFloat();
        
        if ( valor > 100 ){
            System.out.println("O produto " + produto + " custa mais de 100, excedendo em " + (valor - 100));
        }else { 
            System.out.println("O produto " + produto + " custa " + valor);
        }
        
    }
}
