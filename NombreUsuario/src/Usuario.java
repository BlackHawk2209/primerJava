import java.util.Scanner;

public class Usuario {
	public static void main(String[] args) {
	
	Scanner x = new Scanner(System.in);
	
	String nombre, apellido;
	
	System.out.println("Ingresa tu nombre: ");
	nombre = x.nextLine();
	System.out.println("Ingresa tu apellido: ");
	apellido = x.nextLine();
	
	System.out.println("Tu nombre es: " + nombre + " Tu apellido es: " + apellido);
	
}}
