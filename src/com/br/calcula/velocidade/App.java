package com.br.calcula.velocidade;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		float tempo = teclado.nextInt();
		float velocidade = teclado.nextInt();
		float distancia = tempo * velocidade;
		System.out.println("o valor é? " + (distancia /12));
	}
}
