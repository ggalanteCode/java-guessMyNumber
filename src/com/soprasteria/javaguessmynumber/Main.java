package com.soprasteria.javaguessmynumber;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		int numeroRandom = r.nextInt(10), tentativo, numeroTentativi = 0;
		
		do {
			System.out.print("Prova ad indovinare il numero: ");
			tentativo = s.nextInt();
			s.nextLine();
			if(tentativo < numeroRandom) {
				System.out.println("Sbagliato! prova con un numero più grande...");
			} else if(tentativo > numeroRandom) {
				System.out.println("Sbagliato! prova con un numero più piccolo...");
			}
			numeroTentativi++;
		} while(tentativo != numeroRandom);
		
		System.out.println("Congratulazioni!!! hai indovinato il numero dopo " 
							+ numeroTentativi + " tentativi");
	}

}
