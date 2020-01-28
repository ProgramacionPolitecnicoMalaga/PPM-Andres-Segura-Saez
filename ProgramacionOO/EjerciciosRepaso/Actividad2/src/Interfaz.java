import java.util.Scanner;

public class Interfaz {
    private static final int ITEMS_VENDIDOS = 1;
    private static final int OBTENER_PROMEDIO = 2;
    private static final int MAYOR_VENTAS = 3;
    private static final int INSERTAR_EMPLEADO = 4;

    private int OpcionEscogida;
    private int itemSeleccionado;
    private Scanner entrada = new Scanner(System.in);
    private Ventas comerciales = new Ventas();
    private int numeroVentasEmpleado;
    private String nombreEmpleado;
    private int mayorVentaEnUnDiaIsabel=0;
    private int mayorVentaEnUnDiaVicente=0;
    private double promedioVicente=0;
    private double promedioIsabel=0;
    private int[] ventasEmpleado = {};
    private boolean loTieneVicente = false;
    private boolean loTieneIsabel = false;

    public void mostrarInterfaz(){
        System.out.println("1. Empleados que vendieron un número de ítems" +
                            "\n2. Obtener el promedio de ventas de cada uno" +
                            "\n3. Averiguar quién han conseguido el mayor número de ventas en un día" +
                            "\n4. Insertar un nuevo empleado y sus ventas");

        OpcionEscogida = entrada.nextInt();
        ElegirOpcion();
    }

    private void ElegirOpcion(){
        switch (OpcionEscogida){
            case ITEMS_VENDIDOS:
                BusquedaPorItems();
            break;

            case  OBTENER_PROMEDIO:
                Promedios();
            break;

            case MAYOR_VENTAS:
                ComparacionDePromedios();
            break;

            case INSERTAR_EMPLEADO:
                InsertarNuevoEmpleado();
            break;
        }
    }

    private void NotSupportedOption() {
        System.out.println("  Esa opción no es válida. Reescriba una opcion correcta a continuación: ");
        OpcionEscogida = entrada.nextInt();
        ElegirOpcion();
    }
    private void InsertarNuevoEmpleado() {
        System.out.println("  ¿Cuantas ventas ha realizado el nuevo empleado?");
        numeroVentasEmpleado = entrada.nextInt();
        System.out.println("  ¿Como se llama este empleado?");
        nombreEmpleado = entrada.next();
        for (int f=0;f<numeroVentasEmpleado;f++){
            System.out.println("  ¿Cuantas ventas realizo en el dia "+(f+1)+"?");
            ventasEmpleado[f] = entrada.nextInt();
        }
        System.out.println("  "+nombreEmpleado +"  Ventas: {"+ventasEmpleado[0]+", "+ventasEmpleado[1]+
                ", "+ventasEmpleado[2]+", "+ventasEmpleado[3]+", "+ventasEmpleado[4]);

    }
    private void ComparacionDePromedios() {
        MayorVentaDeIsabelEnUnDia();
        MayorVentaDeVicenteEnUnDia();
        if (mayorVentaEnUnDiaVicente > mayorVentaEnUnDiaIsabel){
            System.out.println(" Vicente ha realizado la mayor venta en un dia con "+mayorVentaEnUnDiaVicente+" ventas");
        }
        else{
            System.out.println(" Isabel ha logrado la mayor venta en un solo dia "+mayorVentaEnUnDiaIsabel+" ventas");
        }
    }
    public void getPromedioIsabel(){
        for (int j=0;j<comerciales.getIsabel().length;j++){
            promedioIsabel += comerciales.getIsabel()[j];
        }
        promedioIsabel = promedioIsabel/(comerciales.getIsabel().length);
    }
    public void getPromedioVicente(){
        for (int j=0; j<(comerciales.getVicente().length);j++){
            promedioVicente += comerciales.getVicente()[j];
        }
        promedioVicente = promedioVicente/(comerciales.getVicente().length);
    }
    private void Promedios() {
        getPromedioIsabel();
        getPromedioVicente();
        System.out.println("  Promedio de Vicente:  " + promedioVicente+"\n" +
                "  Promedio de Isabel:  " + promedioIsabel);
    }
    private void BusquedaPorItems() {
        System.out.println("  Item a ser buscado: ");
        itemSeleccionado = entrada.nextInt();
        BuscarEnIsabel();
        BuscarEnVicente();
        if ((loTieneVicente == true)&&(loTieneIsabel == true)){
            System.out.println("Vicente e Isabel, ambos, realizaron la venta de ese item");
        }
        else{
            if (loTieneIsabel == true){
                System.out.println("Isabel realizó la venta de este item");
            }
            else{
                if (loTieneVicente == true){
                    System.out.println("Vicente realizó la venta de este item");
                }
                else{
                    System.out.println("Ninguno vendió este item");
                }
            }
        }
    }
    public void BuscarEnIsabel(){
        for (int i=0;i<comerciales.getIsabel().length;i++){
            if (comerciales.getIsabel()[i] == itemSeleccionado) {
                loTieneIsabel = true;
            }
        }
    }
    public void BuscarEnVicente(){
        for (int i=0;i<comerciales.getVicente().length;i++){
            if (comerciales.getVicente()[i] == itemSeleccionado){
                loTieneVicente = true;
            }
        }
    }


    public void MayorVentaDeIsabelEnUnDia(){
        for (int k=0;k<(comerciales.getIsabel().length);k++){
            if (comerciales.getIsabel()[k]>mayorVentaEnUnDiaIsabel){
                mayorVentaEnUnDiaIsabel= comerciales.getIsabel()[k];
            }
        }
    }
    public void MayorVentaDeVicenteEnUnDia(){
        for (int k=0;k<(comerciales.getVicente().length);k++){
            if (comerciales.getVicente()[k]>mayorVentaEnUnDiaVicente){
                mayorVentaEnUnDiaVicente= comerciales.getVicente()[k];
            }
        }
    }

}
