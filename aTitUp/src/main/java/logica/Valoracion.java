package logica;

public class Valoracion {
    private int estrellas;
    private String comentario;
    private Usuario usuario;
    
    
    
	public Valoracion(int estrellas, String comentario, Usuario usuario) {
		super();
		this.estrellas = estrellas;
		this.comentario = comentario;
		this.usuario = usuario;
	}
	
	public int getEstrellas() {
		return estrellas;
	}
	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
    
    
}
