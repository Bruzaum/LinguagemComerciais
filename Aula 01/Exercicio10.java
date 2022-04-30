/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio10 {
    
    private double salario;
    private double deducao;
    
    void cadastro(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor da hora:");
        float valor_hora = scan.nextFloat();
        System.out.print("Digite horas trabalhadas na semana:");
        float horas_trab = scan.nextFloat();
        this.salario = (valor_hora * horas_trab * 4);
        scan.close();
    }
    
        float getSalario(){
            return (float) this.salario;
        }
	
	void deduzirIRPF(){
            if (this.salario <= 1903.98)
		this.deducao = 0;
            else if (this.salario > 1903.98 && this.salario <= 2826.65)
		this.deducao = (this.salario * 0.075) - 142.80;
            else if (this.salario > 2826.65 && this.salario <= 3751.05)
		this.deducao = (this.salario * 0.15) - 354.80;
            else if (this.salario > 3751.05 && this.salario <= 4664.68)
		this.deducao = (this.salario * 0.225) - 636.13;
            else
		this.deducao = (this.salario * 0.275) - 869.36;
	}
        
        
	
	
	float getDeducao(){
		return (float) this.deducao;
	}
	
	public static void main(String[] args){
		Exercicio10 valor_hora = new Exercicio10();
		valor_hora.cadastro();
		valor_hora.deduzirIRPF();
		System.out.printf("A deducao do IRPF do salario %.2f sera de %.2f", valor_hora.getSalario(), valor_hora.getDeducao());
	}

    
}
