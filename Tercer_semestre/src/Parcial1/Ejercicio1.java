package Parcial1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,N;
		double acum=0;
		System.out.println("Bienvenidos al sistema");
			System.out.println("N�meros a ingresar en el arreglo?:");
			N = sc.nextInt();
		double [] num =new double[N];
		for (i=0;i<N;i++){
			System.out.println("Ingrese las notas");
			num [i] = sc.nextDouble();
			acum=acum+num [i];
		}
		acum=acum/N;
		System.out.println("Promedio es: " +acum);
}
}
