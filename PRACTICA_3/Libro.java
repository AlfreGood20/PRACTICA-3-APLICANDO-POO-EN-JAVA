package PRACTICA_3;
//CODE CREADO POR J.ALFREDO L.D.C
public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private int numeroPaginas;
	
	public Libro(String isbn, String titulo, String autor, int numeroPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	@Override
	public String toString() {
		return "El libro con "+isbn+" creado por el autor "+autor+" tiene paginas "+numeroPaginas;
	}
}