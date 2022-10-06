package com.soprasteria.javaguessmynumber;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		int numeroRandom = r.nextInt(10);
		
		System.out.print("Prova ad indovinare il numero: ");
		int tentativo = s.nextInt();
		s.nextLine();
	}

}
