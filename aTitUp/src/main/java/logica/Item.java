package logica;

import java.util.List;

public class Item {
    private String pregunta;
    private String respuesta;
    private String fuenteRespuesta;
    private String fuenteEjemplo;
    private String ejemplo;
    private List<Valoracion> valoraciones;
    
    
    
	public Item(String pregunta, String respuesta, String fuenteRespuesta, String fuenteEjemplo, String ejemplo,
			List<Valoracion> valoraciones) {
		super();
		this.pregunta = pregunta;
		this.respuesta = respuesta;
		this.fuenteRespuesta = fuenteRespuesta;
		this.fuenteEjemplo = fuenteEjemplo;
		this.ejemplo = ejemplo;
		this.valoraciones = valoraciones;
	}

	public String getPregunta() {
		return pregunta;
	}
	
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	
	public String getRespuesta() {
		return respuesta;
	}
	
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
	public String getFuenteRespuesta() {
		return fuenteRespuesta;
	}
	
	public void setFuenteRespuesta(String fuenteRespuesta) {
		this.fuenteRespuesta = fuenteRespuesta;
	}
	
	public String getFuenteEjemplo() {
		return fuenteEjemplo;
	}
	
	public void setFuenteEjemplo(String fuenteEjemplo) {
		this.fuenteEjemplo = fuenteEjemplo;
	}
	
	public String getEjemplo() {
		return ejemplo;
	}
	
	public void setEjemplo(String ejemplo) {
		this.ejemplo = ejemplo;
	}
	
	public List<Valoracion> getValoraciones() {
		return valoraciones;
	}
	
	public void setValoraciones(List<Valoracion> valoraciones) {
		this.valoraciones = valoraciones;
	}
    
}