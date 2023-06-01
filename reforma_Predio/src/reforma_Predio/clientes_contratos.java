package reforma_Predio;
import java.util.Scanner;
public class clientes_contratos {

	private int contrato;
	private int colaboradores;
	
	
	

	public int getContrato() {
		return contrato;
	}




	public void setContrato(int contrato) {
		this.contrato = contrato;
	}




	public int getColaboradores() {
		return colaboradores;
	}




	public void setColaboradores(int colaboradores) {
		this.colaboradores = colaboradores;
	}




	public static void main (String [] args) {
	 Scanner sc = new Scanner (System.in);
	 clientes_contratos a = new clientes_contratos ();
	 
	System.out.println("Digite o contrato: ");
	a.setContrato(sc.nextInt());
	
	System.out.println("Digite o  cliente: ");
	a.setContrato(sc.nextInt());
	
	 sc.close();
	}	
}
