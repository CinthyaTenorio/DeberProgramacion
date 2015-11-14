package Parcial1;

import java.util.Scanner;

public class Calificaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i;
		double acum=0;
		System.out.println("Bienvenidos al sistema");
		double [] num =new double[50];
		for (i=0;i<50;i++){
			System.out.println("Ingrese las notas");
			num [i] = sc.nextDouble();
			acum=acum+num [i];
		}
		acum=acum/50;
		System.out.println("Promedio es: " +acum);
		if (acum<7){
			System.out.println("Esta reprobado");
		}else if(acum>=7){
			System.out.println("Esta aprobado");
		}
		
	}
	
	

}
