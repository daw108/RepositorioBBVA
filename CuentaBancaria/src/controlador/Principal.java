package controlador;



import modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		
		
		
		
		//programa que tenga un saldo en una cuenta y que el usuario pueda ingresar dinero y retirar
		
		Cuenta cuentaJose = new Cuenta("Jose Ignacio",1,2000F); // objeto de la clase Cuenta con las 3 variables (string titular,long ncta,float saldo)
		Cuenta cuentaFernando=new Cuenta("Fernando Ortiz",2,200F);
		
		cuentaJose.reintegro(100F); //saco 100 euros
		System.out.println("Su saldo Sr.Jose:" + cuentaJose.getSaldo()); // nos dice el saldo que nos queda llamando con el get desde cuentajose el saldo
		
		cuentaJose.transferencia(cuentaFernando, 200F); // le hacemos una transferencia desde cuentajose hacia cuentafernando
		System.out.println("Su saldo Sr.Jose:" + cuentaJose.getSaldo()); //nos da por pantalla el saldo que nos queda después de la transferencia a cuentafernando
		System.out.println("Su saldo Sr.Fernando:" + cuentaFernando.getSaldo()); // nos da por pantalla el saldo de la cuentafernando después de hacerle una transferencia nosotros
		
	}

}
