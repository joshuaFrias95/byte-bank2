package com.bytebank.modelo;

/**
 * Objeto que nos permite guardar muchas cuentas
 * Permite agregar cuentas con un método
 *
 */
public class GuardaReferencias {

	Object[] referencia = new Object[10];
	int indice = 0;


	public void adicionar(Object cc) {
		referencia[indice] = cc;
		indice++;
	}

	public Object obtener(int indice) {
		return referencia[indice];
	}

}
