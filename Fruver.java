//  ELIANA CASTAÑO MORENO (A00414943)

// **ANALISIS DEL PROBLEMA **

/* DESCRIPCION:
La calculadora del fruver deberá pedirle al usuario la cantidad a comprar de cada producto (manzanas y bananos) 
y basado en ello deberá calcular el subtotal de cada producto, encontrar el subtotal de la compra(subtotal 
manzanas + subtotal bananos), aplicar un descuento del 10% y calcular el total final. 
Por último deberá mostrar los resultados detallados.

INPUTS: 2
1. int cantidad_Manzanas 
2. int cantidad_Bananos 
Ambos inputs son ingresados por el usuario 

OUTPUTS: 5 una por cada operación (subtotales manzanas y bananos:2   , subtotal compra , descuento y total final)

EJEMPLO:

cantidad_Manzanas = 2
cantidad_Bananos = 5

Subtotal Manzanas = 2000
Subtotal Bananos = 4000

Total compra = 6000

Descuento = 600

Total Final =  5400

*/

import java.util.Scanner;

public class Fruver{

    public static void main(String[] args){

        final double PRECIO_MANZANA = 1000;
        final double PRECIO_BANANO = 800;
        
        Scanner input = new Scanner(System.in);

        System.out.println("¡Bienvenid@ a la Calculadora del Fruver!");
        System.out.println("Ingrese la cantidad de manzanas que ha comprado: ");
        int cantidad_Manzanas = input.nextInt();
        input.nextLine();

        System.out.println("Ingrese la cantidad de bananos que ha comprado: ");
        int cantidad_Bananos = input.nextInt();
        input.nextLine();

        /* Operaciones */
        double subtotal_Manzanas = subManzanas(cantidad_Manzanas, PRECIO_MANZANA);
        double subtotal_Bananos = subBananos(cantidad_Bananos, PRECIO_BANANO);
        double total_Subtotal = totalizar_Subtotal(subtotal_Manzanas, subtotal_Bananos);
        double descuento = calcular_Descuento(total_Subtotal);
        double total_Final = totalizar_Final(total_Subtotal,descuento);

        /*Salidas */
        System.out.println("Subtotal Manzanas = " + subtotal_Manzanas);
        System.out.println("Subtotal Bananos = " + subtotal_Bananos);
        System.out.println("Total Subtotal = " + total_Subtotal);
        System.out.println("Descuento aplicado = " + descuento);
        System.out.println("TOTAL FINAL: " + total_Final);
    }
    
    public static double subManzanas(int manzanas, double precio){
        double subtotal_Manzanas = manzanas * precio;
        return subtotal_Manzanas;
    }
    
    public static double subBananos(int bananos, double precio){
        double subtotal_Bananos = bananos * precio;
        return subtotal_Bananos;
    }
    public static double totalizar_Subtotal(double precioManzana, double precioBanano){
        double total_Subtotal = precioManzana + precioBanano;
        return total_Subtotal;
    }
    public static double calcular_Descuento(double subtotal){
        double descuento = subtotal * 0.1;
        return descuento;
    }
    public static double totalizar_Final(double subtotal, double descuento){
        double total_Final = subtotal - descuento;
        return total_Final;
    }
}