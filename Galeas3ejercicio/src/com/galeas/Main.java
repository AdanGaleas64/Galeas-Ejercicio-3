package com.galeas;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList();

        boolean x = true;
        System.out.println("--- Vehiculos -----");
        while (x == true){
            System.out.println("1. Ingresar un vehiculo");
            System.out.println("2. Mostrar vehiculos");
            System.out.println("3. Salir");

            int opcion = LectorDeDatos.solicitarEntero("Ingrese una opcion: ");

            switch (opcion){
                case 1:
                    System.out.println("\t1. Ford");
                    System.out.println("\t2. Toyota");
                    System.out.println("\t3. Honda");
                    System.out.println("\t4. Nissan");
                    int marca = LectorDeDatos.solicitarEntero("Que maraca desea ingresar?:");
                    System.out.println("Color del vehiculo:");
                    String color = lector.nextLine();
                    int year = LectorDeDatos.solicitarEntero("Año del vehiculo: ");
                    double precio = LectorDeDatos.solicitarEntero("Precio del vehiculo: ");

                    if (marca == 1){
                        Ford nuevoVehiculo = new Ford();
                        nuevoVehiculo.color = color;
                        nuevoVehiculo.year = year;
                        nuevoVehiculo.precio = precio;
                        vehiculos.add(nuevoVehiculo);
                        System.out.println("Vehiculo Ford ingresado exitosamente");
                    } else if(marca == 2){
                        Toyota nuevoVehiculo = new Toyota();
                        nuevoVehiculo.color = color;
                        nuevoVehiculo.year = year;
                        nuevoVehiculo.precio = precio;
                        vehiculos.add(nuevoVehiculo);
                        System.out.println("Vehiculo Toyota ingresado exitosamente");
                    } else if (marca == 3){
                        Honda nuevoVehiculo = new Honda();
                        nuevoVehiculo.color = color;
                        nuevoVehiculo.year = year;
                        nuevoVehiculo.precio = precio;
                        vehiculos.add(nuevoVehiculo);
                        System.out.println("Vehiculo Honda ingresado exitosamente");
                    } else if (marca == 4){
                        Nissan nuevoVehiculo = new Nissan();
                        nuevoVehiculo.color = color;
                        nuevoVehiculo.year = year;
                        nuevoVehiculo.precio = precio;
                        vehiculos.add(nuevoVehiculo);
                        System.out.println("Vehiculo Nissan ingresado exitosamente");
                    } else {
                        System.out.println("NO EXISTE");
                    }
                    break;
                case 2:
                    if (vehiculos.isEmpty()) {
                        System.out.println("--- Ningun vehiculo ingresado ---");
                    } else {
                        System.out.println("--- Vehiculos vigentes ---");
                    }
                    for (Vehiculo c : vehiculos){
                        if (c instanceof Toyota) {
                            System.out.println("Marca: Toyota");
                            System.out.println("Color: " + c.color);
                            System.out.println("Año: " + c.year);
                            System.out.println("Precio: Lps. " + c.precio + "\n");
                        } else if (c instanceof  Nissan) {
                            System.out.println("Marca: Nissan");
                            System.out.println("Color: " + c.color);
                            System.out.println("Año: " + c.year);
                            System.out.println("Precio: Lps. " + c.precio + "\n");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Adios");
                    x = false;
                    break;

                default:
                    System.out.println("No Permitido");
            }
        }
    }
}
