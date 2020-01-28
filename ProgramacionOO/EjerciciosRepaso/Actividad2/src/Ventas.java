public class Ventas {
    private int[] Isabel;
    private int[] Vicente;
    private int[] EmpleadoNuevo;

    public Ventas(){
        this.Isabel = new int[] {7,7,10,6,4};
        this.Vicente = new int[] {4,7,5,4,5};
        this.EmpleadoNuevo = new int[] {};
    }

    public int[] getIsabel() {
        return Isabel;
    }

    public void setIsabel(int[] isabel) {
        Isabel = isabel;
    }

    public int[] getVicente() {
        return Vicente;
    }

    public void setVicente(int[] vicente) {
        Vicente = vicente;
    }

    public int[] getEmpleadoNuevo() {
        return EmpleadoNuevo;
    }

    public void setEmpleadoNuevo(int[] empleadoNuevo) {
        EmpleadoNuevo = empleadoNuevo;
    }
}
