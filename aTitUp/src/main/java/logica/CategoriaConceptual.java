package logica;

import java.util.ArrayList;
import java.util.List;

public class CategoriaConceptual {
    private String descripcion;
    private String codigo;
    private String nombre;
    private List<Item> items;
    
    public CategoriaConceptual(String descripcion, String codigo, String nombre, List<Item> items) {
		super();
		this.descripcion = descripcion;
		this.codigo = codigo;
		this.nombre = nombre;
		this.items = items;
	}
    
    public CategoriaConceptual() {
        items = new ArrayList<>();
    }

	public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
