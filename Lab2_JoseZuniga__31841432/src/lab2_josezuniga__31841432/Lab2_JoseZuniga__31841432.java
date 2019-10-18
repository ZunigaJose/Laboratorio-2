package lab2_josezuniga__31841432;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Lab2_JoseZuniga__31841432 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Universidad> lista = new ArrayList<>();
        
        int op = 15;
        boolean ingresado = false;
        while (op != 9) {
            op = menu();
            switch (op) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.print("Ingrese su nombre de usuario: ");
                    String user = leer.nextLine();
                    System.out.print("Ingrese su Contraseña: ");
                    String pass = leer.nextLine();
                    if (user.equals("leobanegas") && pass.equals("99")) {
                        System.out.println("\nIngresado Correctamente!");
                        ingresado = true;
                    } else {
                        System.out.println("Error! ingreso incorrecto!!!");
                    }
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                    
                    break;
            }
        }
    }
    
    public static int menu() {
        System.out.print("1. Crear Universidades\n"
                + "2. Eliminar Universidades\n"
                + "3. Log In\n"
                + "4. Ascender Universidad\n"
                + "5. Listar Universidades y su Sucursal\n"
                + "6. Modificar Universidad\n"
                + "7. Descender Universidad\n"
                + "8. RANDOM\n"
                + "9. Salir: ");
        int op = leer.nextInt();
        leer.nextLine();
        if (op < 1 || op > 9) {
            return menu();
        }
        return op;
    }
    
    public static Universidad crear(ArrayList<Universidad> list) throws ParseException{
        System.out.print("Ingrese el nombre de la institucion: ");
        String nombre = leer.nextLine();
        System.out.print("Ingrese la sucursal: ");
        String sucursal = leer.nextLine();
        if (nombreEncontrado(list, nombre, sucursal)) {
            System.out.print("\nNo pueden haber dos universidades con el mismo nombre y misma sucursal!!\n");
            return new Universidad("Borrame", "Borrame", "Borrame", "Borrame", new Date(), 0, 0, 0);
        }
        System.out.print("Ingrese el nombre del rector: ");
        String nomRector = leer.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("yyyy");
        Date year = df.parse(ingresoYear());
        System.out.print("Ingrese el numero de estudiantes: ");
        int numEstudiantes = leer.nextInt();
        leer.nextLine();
        System.out.print("Ingrese el numero de maestros:");
        int numMaestros = leer.nextInt();
        leer.nextLine();
        char op = subMenuNiveles();
        if (op == 'c') {
            if (nacionalYa(list)) {
                while (op == 'c') {
                    System.out.println("Ya exixste una Universidad Nacional, vuelva a intentar: ");
                    op = leer.nextLine().toLowerCase().charAt(0);
                }
            }
        }
        int costo = 0;
        String nivel = "";
        switch (op) {
            case 'a':
                costo = 0;
                nivel = "Publica";
                break;
            case 'b':
                costo = 200;
                nivel = "Publica Prestigiosa";
                break;    
            case 'c':
                costo = 500;
                nivel = "Nacional";
                break;
            case 'd':
                costo = 6000;
                nivel = "Privada";
                break;
            case 'e':
                costo = 12000;
                nivel = "Privada Prestigiosa";
                break;
        }
        return new Universidad(nombre, nomRector, sucursal, nivel, year, numMaestros, numEstudiantes, costo);
    }
    
    public static boolean nombreEncontrado(ArrayList<Universidad> list, String Nombre, String Sucursal){
        for (Universidad u : list) {
            if (u.getNombre().toLowerCase().equals(Nombre.toLowerCase())
            && u.getSucursal().toLowerCase().equals(Sucursal.toLowerCase())) {
                return true;
            } 
        }
        return false;
    }
    
    public static boolean nacionalYa(ArrayList<Universidad> list){
        for (Universidad u : list) {
            if (u.getNivel().equals("Nacional")) {
                return true;
            }
            return false;
        }
    }
    
    public static char subMenuNiveles(){
        System.out.print("Seleccione el nivel\n"
                + "a. Publica\n"
                + "b.Publica Prestigiosa\n"
                + "c. Nacional\n"
                + "d. Privada\n"
                + "e. Privada Prestigiosa: ");
        char op = leer.nextLine().toLowerCase().charAt(0);
        if (op > 'e' || op < 'a') {
            System.out.println("Opcion Incorrecta!");
            return subMenuNiveles();
        }
        return op;
    }
    
    public static String ingresoYear(){
        System.out.print("Ingrese el año de creacion (Ej: 1984)");
        return leer.nextLine();
    }
    
}
