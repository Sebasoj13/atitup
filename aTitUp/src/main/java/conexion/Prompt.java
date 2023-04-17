package conexion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Prompt{
    private String categoria;
    private String texto;
    private LocalDateTime fechaHora;
    private int numeroPrompt;
    private List<Integer> calificaciones;

    public Prompt(String categoria, String texto) {
        this.categoria = categoria;
        this.texto = texto;
        this.fechaHora = LocalDateTime.now();
        this.numeroPrompt = 0;
        this.calificaciones = new ArrayList<>();
    }

    public void registrarPrompt(List<Prompt> listaPrompts) {
        this.numeroPrompt = listaPrompts.size() + 1;
        listaPrompts.add(this);
        System.out.println("El prompt se registro.");
    }
    
    public boolean menorQue(Prompt obj){
        if (this.categoria.compareTo(obj.getCategoria()) == -1){
            return true;
        }
        
        else{
            return false;
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public String getTexto() {
        return texto;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public int getNumeroPrompt() {
        return numeroPrompt;
    }

    public List<Integer> getCalificaciones() {
        return calificaciones;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void setNumeroPrompt(int numeroPrompt) {
        this.numeroPrompt = numeroPrompt;
    }

    public void setCalificaciones(List<Integer> calificaciones) {
        this.calificaciones = calificaciones;
    }

    @Override
    public String toString() {
        return "Prompt{" + "categoria=" + categoria + ", texto=" + texto + ", fechaHora=" + fechaHora + ", numeroPrompt=" + numeroPrompt + ", calificaciones=" + calificaciones + '}';
    }

}
