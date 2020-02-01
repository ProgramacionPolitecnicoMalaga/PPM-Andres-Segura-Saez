public class Compra {
    private int compra_cliente;

    public Compra(int compra_cliente){
        this.compra_cliente = compra_cliente;
    }

    public int getCompra(){
        return compra_cliente;
    }

    public void setCompra(){
        this.compra_cliente = compra_cliente;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "compra=" + compra_cliente +
                '}';
    }
}
