public class Categoria {
    private String nombre;

    public Categoria(){

    }

    public Categoria(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        Categoria categoria = (Categoria) obj;
        return categoria.getNombre().equals(getNombre());
    }
}
