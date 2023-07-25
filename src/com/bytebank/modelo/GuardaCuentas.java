package com.bytebank.modelo;

/**
 * Clase que nos servirá para guardar cuentas
 * Permite agregar cuentas con un método
 */
public class GuardaCuentas {

	Cuenta[] cuenta = new Cuenta[10];
	int index = 0;

	public void adicionar(Cuenta cc) {
		cuenta[index] = cc;
		index++;
	}

	public Cuenta obtener(int index) {
		return cuenta[index];
	}
}
