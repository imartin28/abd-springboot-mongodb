package transfer;


import prototipo.SA.ServicioAplicacionImp;

public class TransferCalculadora {
	private String operando1;//Se tienen que llamar igual que en el html(th:field)
	private String operando2;//Se tienen que llamar igual que en el html(th:field)
	private String operador;//Se tienen que llamar igual que en el html(th:field)
	private int op1;
	private int op2;
	private int resultado;
	
	/*public void calcular() throws NumberFormatException{
		op1 = Integer.parseInt(operando1);
		op2 = Integer.parseInt(operando2);
		if(operador.equals("suma")) {
			resultado= op1 + op2;
		}
		else if(operador.equals("resta")) {
			resultado = op1 - op2;
		}
	}*/
	public void calcular() throws NumberFormatException{
		ServicioAplicacionImp saCalcu = new ServicioAplicacionImp();
		op1= Integer.parseInt(operando1);
		op2= Integer.parseInt(operando2);
		if(operador.equals("suma")) {
			resultado = saCalcu.suma(op1, op2);
		}
		else resultado = saCalcu.resta(op1,op2);
				
	}
	

	public String getOperando1() {
		return operando1;
	}

	public void setOperando1(String operando1) {
		this.operando1 = operando1;
	}

	public String getOperando2() {
		return operando2;
	}

	public void setOperando2(String operando2) {
		this.operando2 = operando2;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public int getOp1() {
		return op1;
	}

	public void setOp1(int op1) {
		this.op1 = op1;
	}

	public int getOp2() {
		return op2;
	}

	public void setOp2(int op2) {
		this.op2 = op2;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
}
