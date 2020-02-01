public class Clientes {
    private String nombre, apellidos, niv, cuenta_bancaria;

    public Clientes(String nombre, String apellidos, String niv, String cuenta_bancaria){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.niv = niv;
        this.cuenta_bancaria = cuenta_bancaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNiv() {
        return niv;
    }

    public void setNiv(String niv) {
        this.niv = niv;
    }

    public String getCuenta_bancaria() {
        return cuenta_bancaria;
    }

    public void setCuenta_bancaria(String cuenta_bancaria) {
        this.cuenta_bancaria = cuenta_bancaria;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", niv='" + niv + '\'' +
                ", cuenta_bancaria='" + cuenta_bancaria + '\'' +
                '}';
    }
}
