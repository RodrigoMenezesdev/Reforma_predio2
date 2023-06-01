package reforma_Predio;
import java.util.Scanner;
public class enderecos {

	private int id_endereco;
	private int cep;
	private String bairro;
	private String cidade ;
	private String municipio;
	
	
	
	
	public int getId_endereco() {
		return id_endereco;
	}




	public void setId_endereco(int id_endereco) {
		this.id_endereco = id_endereco;
	}




	public int getCep() {
		return cep;
	}




	public void setCep(int cep) {
		this.cep = cep;
	}




	public String getBairro() {
		return bairro;
	}




	public void setBairro(String bairro) {
		this.bairro = bairro;
	}




	public String getCidade() {
		return cidade;
	}




	public void setCidade(String cidade) {
		this.cidade = cidade;
	}




	public String getMunicipio() {
		return municipio;
	}




	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}




	public static void main (String [] args) {
	 Scanner sc = new Scanner (System.in);
	 enderecos a = new enderecos();
	 
	System.out.println("Digite a id ");
	a.setId_endereco (sc.nextInt());
	
	System.out.println("Digite o cep:");
	a.setCep (sc.nextInt());	
	
	System.out.println("Digite o bairro:");
	a.setBairro (sc.next());
	
	System.out.println("Digite a cidade:");
	a.setCidade (sc.next());
	
	System.out.println("Digite o municipio");
	a.setMunicipio (sc.next());
	
	
	 sc.close();
	}	
	
}