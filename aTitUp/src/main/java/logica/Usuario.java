package logica;

public class Usuario {
    private String correo;
    private String idioma;
    
	public Usuario(String correo, String idioma) {
		super();
		this.correo = correo;
		this.idioma = idioma;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
    
}