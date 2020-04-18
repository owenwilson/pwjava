package cuarentena2020;

public class Asignamiento {

	public static void main(String[] args) {
		// These are my exampless
		int num;
		String name;
		num = 10;
		name = "example string";
		System.out.println("num is assigned "+num);
		System.out.println("name is assigned "+name);
		
		int num1, num2;
		num1 = 10;
		num2 = 20;
		System.out.println("num1= "+num1);
		System.out.println("num2= "+num2);
		num1+=num2;
		System.out.println("num1= " + num1);
		num1*=num2;
		System.out.println("resNum1= "+num1);
		num1/=num2;
		System.out.println("resNum1= "+num1);
		num1%=num2;
		System.out.println("resNum1= "+num1+"\n");
		
		// OPERATIONS
		Operations operacion1 = new Operations();
		System.out.println("resultado suma: "+operacion1.suma(5,6));
		System.out.println("resultado resta: "+operacion1.resta(10,8));
		System.out.println("resultado multiplicacion: "+operacion1.multiplicar(2,5));
		System.out.println("resultado division: "+operacion1.dividir(10.0,2.0));
		System.out.println("resultado residuo: "+operacion1.residuo(10.0,2.0));
	}

}
