package PRACTICA_3;
//CODE CREADO POR J.ALFREDO L.D.C

public class Principal {

	public static void main(String[] args) {
		
		//PRIMER OBJETO
		Libro libro1=new Libro("978-3-16-148410-0","Programación Orientada a Objetos con Java","Carlos López García",350);
		
		//SEGUNDO OBJETO
		Libro libro2=new Libro("978-1-491-92759-4","Algoritmos y Estructuras de Datos","Roberto Martínez Vega",420);
		
		//MOSTRAR EN PANTALLA
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		//MOSTRAR CUAL DE LOS DOS TIENE MAS PAGINAS
		System.out.println("EL LIBRO CON MAS PAGINA ES: ");
		System.out.println((libro1.getNumeroPaginas()>libro2.getNumeroPaginas())?libro1.getTitulo():libro2.getTitulo());
	}
}