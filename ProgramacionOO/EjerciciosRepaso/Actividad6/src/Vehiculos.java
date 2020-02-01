public class Vehiculos {
    private String modelo;
    private String marca;
    private String color;
    private int anho_fabricacion;
    private String combustion;
    private String estado;
    private double precio;

    public Vehiculos(String modelo, String marca, String color, int anho_fabricacion, String combustion, String estado, double precio){
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.anho_fabricacion = anho_fabricacion;
        this.combustion = combustion;
        this.estado = estado;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnho_fabricacion() {
        return anho_fabricacion;
    }

    public void setAnho_fabricacion(int anho_fabricacion) {
        this.anho_fabricacion = anho_fabricacion;
    }

    public String getCombustion() {
        return combustion;
    }

    public void setCombustion(String combustion) {
        this.combustion = combustion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", anho_fabricacion=" + anho_fabricacion +
                ", combustion='" + combustion + '\'' +
                ", estado='" + estado + '\'' +
                ", precio=" + precio +
                '}';
    }
}
