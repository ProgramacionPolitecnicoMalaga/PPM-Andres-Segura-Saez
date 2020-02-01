public class Venta {
    private int venta_cliente;

    public Venta(int venta_cliente){
        this.venta_cliente = venta_cliente;
    }

    public int getVenta(){
        return venta_cliente;
    }

    public void setVenta(){
        this.venta_cliente = venta_cliente;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "venta=" + venta_cliente +
                '}';
    }
}
