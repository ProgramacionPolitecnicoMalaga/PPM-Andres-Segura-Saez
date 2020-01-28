import javax.swing.*;
import java.util.Scanner;

public class Unidades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Qué unidad desea utilizar? \n1. mm \n2. cm \n3. m \nIntroduzca una opción:");

        int unidad = entrada.nextInt();

        Scanner opcion = new Scanner(System.in);

        switch (unidad){
            case 1:
                System.out.println("¿Qué operación desea realizar?" +
                                    "\n1. Calcular la hipotenusa de un triángulo a partir de sus catetos." +
                                    "\n2. Calcular un cateto de un triángulo a partir del otro cateto y la hipotenusa." +
                                    "\n3. Calcular el área de un triángulo a partir de un cateto y la hipotenusa." +
                                    "\n4. Calcular el área de un triángulo a partir de dos catetos." +
                                    "\nElige una opción:");

                int operación = opcion.nextInt();

                switch (operación){
                    case 1:
                        int Cateto11 = Integer.parseInt(JOptionPane.showInputDialog("Introduce Primer Cateto"));
                        int Cateto21 = Integer.parseInt(JOptionPane.showInputDialog("Introduce Segundo Cateto"));

                        double Resultado1 = Math.sqrt(Math.pow(Cateto11, 2) + Math.pow(Cateto21, 2));

                        System.out.println("La hipotenusa del triángulo es " + Resultado1);
                    break;

                    case 2:
                        int Hipotenusa = Integer.parseInt(JOptionPane.showInputDialog("Introduce Hipotenusa"));
                        int Cateto22 = Integer.parseInt(JOptionPane.showInputDialog("Introduce Segundo Cateto"));

                        double ResultadoCateto1 = Math.sqrt(Math.pow(Hipotenusa, 2) - Math.pow(Cateto22, 2));

                        System.out.println("El primer cateto es " + ResultadoCateto1);

                        int Cateto12 = Integer.parseInt(JOptionPane.showInputDialog("Introduce Segundo Cateto"));

                        double ResultadoCateto2 = Math.sqrt(Math.pow(Hipotenusa, 2) - Math.pow(Cateto12, 2));

                        System.out.println("El segundo cateto es " + ResultadoCateto2);
                    break;

                    case 3:
                        int Hipotenusa3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce Hipotenusa"));
                        int Cateto31 = Integer.parseInt(JOptionPane.showInputDialog("Introduce Primer Cateto"));

                        double Cateto33 = Math.sqrt(Math.pow(Hipotenusa3, 2) - Math.pow(Cateto31, 2));

                        System.out.println("La base del triángulo es " + Cateto33);

                        double Area = (Cateto33 * Cateto31)/2;

                        System.out.println("El área del triángulo es " + Area);
                    break;

                    case 4:
                        int Cateto41 = Integer.parseInt(JOptionPane.showInputDialog("Introduce Primer Cateto"));
                        int Cateto42 = Integer.parseInt(JOptionPane.showInputDialog("Introduce Segundo Cateto"));

                        double Area2 = (Cateto41 * Cateto42)/2;

                        System.out.println("El área del triángulo es " + Area2);
                    break;
                }
            break;

            case 2:
        }
    }
}
