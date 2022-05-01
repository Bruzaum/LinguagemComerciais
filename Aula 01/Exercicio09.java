import java.util.Scanner;

//esta faltando sair do WHILE quando produto == "SAIR"

public class Exercicio09 {
    
    private float compra;
    private String produto;
    private float valor_total;
    
    void cadastro(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do produto:");
        String nome = scan.nextLine();
        System.out.print("Digite a quantidade:");
        float qtd = scan.nextFloat();
        System.out.print("Digite o valor pago:");
        float valor = scan.nextFloat();
        this.compra = (qtd * valor);
        this.produto = nome;
        //scan.close();
    }
    
	
	void ateSair(){
	    
	    while(produto != "SAIR"){
	        this.valor_total = this.valor_total + this.compra;
	        System.out.printf("%.2f ", valor_total);
            cadastro();
	    }
	    
        
    float getValorCompra(){
        return (float) this.valor_total;
    }    
	
	public static void main(String[] args){
		Exercicio09 nome = new Exercicio09();
		nome.cadastro();
		nome.ateSair();
		System.out.printf("O valor da compra ficou em: R$ %.2f", nome.getValorCompra());
	}

    
}
