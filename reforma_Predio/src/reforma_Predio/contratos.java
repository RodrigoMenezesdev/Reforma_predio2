package reforma_Predio;
import java.util.Scanner;
public class contratos {

	private int id_contrato;
	private String descricao;
	
	

	public int getId_contratos() {
		return id_contrato;
	}






	public void setId_contrato (int id_contrato) {
		this.id_contrato = id_contrato;
	}






	public String getDescricao() {
		return descricao;
	}






	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}






	public static void main (String [] args) {
	 Scanner sc = new Scanner (System.in);
	contratos a = new contratos ();
	 
	System.out.println("Digite a id do contrato:");
	a.setId_contrato (sc.nextInt());
	
	System.out.println("Digite a descrição:");
	a.setDescricao (sc.next());	
	
	
	
	 sc.close();
	}	
	
}