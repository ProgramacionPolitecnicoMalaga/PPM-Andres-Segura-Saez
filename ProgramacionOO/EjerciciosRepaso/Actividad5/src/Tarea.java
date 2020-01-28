import java.util.Date;

public class Tarea{
    private String nombre;
    private Categoria categoria;
    private Date fechaLimite;
    private boolean done;

    public Tarea(){

    }

    public Tarea(String nombre, Categoria categoria, Date fechaLimite, boolean done){
        this.nombre = nombre;
        this.categoria = categoria;
        this.fechaLimite = fechaLimite;
        done = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", fechaLimite=" + fechaLimite +
                '}';
    }
}
