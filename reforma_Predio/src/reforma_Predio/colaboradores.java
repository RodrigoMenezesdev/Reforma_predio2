package reforma_Predio;
import java.util.Scanner;
public class colaboradores {

	private int id_colaborador;
	private String nome;
	private int contato;
	private double salario;
	private int cargo;
	private int endereco;
	
	public int getId_colaborador() {
		return id_colaborador;
	}
	public void setId_colaborador(int id_colaborador) {
		this.id_colaborador = id_colaborador;
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getCargo() {
		return cargo;
	}
	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
	public int getEndereco() {
		return endereco;
	}
	public void setEndereco(int endereco) {
		this.endereco = endereco;
	}
	
	public static void main (String [] args) {
	 Scanner sc = new Scanner (System.in);
	 colaboradores a = new colaboradores();
	 
	System.out.println("Digite a id do colaborador");
	a.setId_colaborador(sc.nextInt());
	
	System.out.println("Digite o nome do colaborador");
	a.setNome (sc.next());	
	
	System.out.println("Digite o contato do colaborador");
	a.setContato (sc.nextInt());
	
	System.out.println("Digite o salario do colaborador");
	a.setSalario (sc.nextDouble());
	
	System.out.println("Digite o cargo do colaborador");
	a.setCargo (sc.nextInt());
	
	System.out.println("Digite o endereço do colaborador");
	a.setEndereco (sc.nextInt());
	
	 sc.close();
	}	
	
}

