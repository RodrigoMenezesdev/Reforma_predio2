package reforma_Predio;
import java.util.Scanner;
public class clientes {

	private int id_cliente;
	private String nome;
	private int contato;
	private int endereco;
	
	
	
	public int getId_cliente() {
		return id_cliente;
	}



	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getContato() {
		return contato;
	}



	public void setContato(int contato) {
		this.contato = contato;
	}



	public int getEndereco() {
		return endereco;
	}



	public void setEndereco(int endereco) {
		this.endereco = endereco;
	}



	public static void main (String [] args) {
	 Scanner sc = new Scanner (System.in);
	clientes a = new clientes ();
	 
	System.out.println("Digite a id do cliente");
	a.setId_cliente(sc.nextInt());
	
	System.out.println("Digite o nome do cliente");
	a.setNome (sc.next());	
	
	System.out.println("Digite o contato do contato");
	a.setContato (sc.nextInt());
	
	System.out.println("Digite o endereço:");
	a.setEndereco (sc.nextInt());
	
	
	 sc.close();
	}	
	
}