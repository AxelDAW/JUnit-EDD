package com.mavenproject.calculadora;

/**
 *
 * @author axel
 */
public class Calculadora {
	
        // Declaramos dos variables.
        private float lastResult;
	private String lastOp;
	
        // Guardamos el último resultado.
	public float getLastResult() {
		return this.lastResult;
	}
	
        // Guardamos la última operación.
	public String getLastOp() {
		return this.lastOp;
	}
	
        // Introducimos dos valores a la función y realizamos la suma de ellos.
	public float suma( float op1, float op2) {
		float result = op1 + op2;
		this.lastResult = result;
		this.lastOp = "Suma";
		return result;
	}
	
        // Introducimos dos valores a la función y realizamos la resta.
	public float resta(float op1, float op2) {
		float result = op1 - op2;
		this.lastResult = result;
		this.lastOp = "Resta";
		return result;
	}
	
        // Introducimos dos valores a la función y realizamos la multiplicación.
	public float multiplica(float op1, float op2) {
		float result = op1 * op2;
		this.lastResult = result;
		this.lastOp = "Multiplica";
		return result;
	}
	
        // Introducimos dos valores a la función y realizamos la división.
	public float divideix(float op1, float op2) {
		float result = op1 / op2;
		this.lastResult = result;
		this.lastOp = "Divideix";
		return result;
	}
	
        // Introducimos dos valores a la función y si el primer valor es mayor saldra verdadero, si no falso.
	public boolean majorQue (float op1, float op2) {
		if (op1 > op2) {
			return true;
		}
		return false;
	}
	
        // Reestablecemos los valores de las variables declaradas a 0.
	public void restablecer(){
		this.lastResult = 0;
		this.lastOp = "Ninguna";
	}
}

