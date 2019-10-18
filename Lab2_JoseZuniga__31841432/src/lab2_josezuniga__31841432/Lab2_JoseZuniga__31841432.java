package lab2_josezuniga__31841432;

import java.util.ArrayList;
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
    
    
}
