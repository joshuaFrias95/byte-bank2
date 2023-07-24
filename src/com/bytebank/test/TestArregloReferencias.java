package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias {
	
	public static void main(String[] args) {

		CuentaCorriente cc = new CuentaCorriente(23, 44);

		Object[] referencias = new Object[5];
		referencias[1] = cc;

		Cliente cliente = new Cliente();
		referencias[4] = cliente;

		Cliente obtenido = (Cliente) referencias[4];

		CuentaAhorros ca = new CuentaAhorros(44, 55);
		referencias[3] = ca;

		referencias[0] = new CuentaCorriente(11, 99);
		System.out.println(referencias[0]);

		// Cast (transformar un tipo de objeto en otro
		CuentaCorriente cuenta = (CuentaCorriente) referencias[1];

		for (int i = 0; i < referencias.length; i++) {
			System.out.println(referencias[i]);
		}
		
	}

}