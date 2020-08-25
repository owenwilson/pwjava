package cuarentena2020;

public class ControlFlujo {
	
	public int numeroMayoMenor(int miVariableA, int miVariableB) {
		if(miVariableA > miVariableB) {
			return miVariableA;
		}else {
			return miVariableB;
		}
	}
	
	public String controlSwtich(int miVariableA) {
		switch (miVariableA) {
		case 5:
			return "es menor";
		case 6:
			return "es igual";
		case 7:
			return "es mayor";
		default:
			return "ninguno";
		}
	}
}
