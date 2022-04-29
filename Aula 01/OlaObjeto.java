/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.hello;

/**
 *
 * @author aluno
 */
public class OlaObjeto {
    
    String palavra = "mundo";
    
    void imprimir() {
        System.out.println("olá " + this.palavra);
    }
    
    public static void main(String[] args) {
        OlaObjeto objeto = new OlaObjeto();
        objeto.imprimir();
    }
    
}
