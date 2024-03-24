import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean tiendaAbierta = true;
        boolean inventario = true;
        boolean venta = true;
        boolean ticket = true;
        String opcionTienda;
        String opcionInventario;
        String opcionVenta;
        String opcionTicket;
        do {
            opciones();
            opcionTienda = scan.nextLine();
            switch (opcionTienda){
                case "1":
                    do {
                        System.out.println("-----Menu Inventario-----");
                        inventario();
                        opcionInventario = scan.nextLine();
                        switch (opcionInventario) {
                            case "1":
                                System.out.println("Agregar producto");
                                System.out.println("1. Producto comestible\n2. Producto del hogar\n3. Salir");
                                opcionTienda = scan.nextLine();
                                    switch (opcionTienda){
                                        case "1":
                                            System.out.println("Agrega un producto comestible");
                                            break;
                                        case "2":
                                            System.out.println("Agrega un producto para el hogar.");
                                            break;
                                        case "3":
                                            System.out.println("Saliendo...");
                                            break;
                                    }
                                break;
                            case "2":
                                System.out.println("Eliminar producto");
                                break;
                            case "3":
                                System.out.println("Saliendo del inventario... \n");
                                inventario = false;
                                break;
                            default:
                                System.out.println("Ingrese una opcion valida porfavor.");
                        }
                    }while (inventario);
                    break;
                case "2":
                    do {
                        System.out.println("-----Menu Venta-----");
                        venta();
                        opcionVenta = scan.nextLine();
                        switch (opcionVenta) {
                            case "1":
                                System.out.println("Agrega un producto a vender.");
                                break;
                            case "2":
                                System.out.println("Elimina el producto a vender.");
                                break;
                            case "3":
                                System.out.println("Vende los productos que tienes.");
                                break;
                            case "4":
                                System.out.println("Saliendo de venta... \n");
                                venta = false;
                                break;
                            default:
                                System.out.println("Ingrese una opcion valida porfavor.");
                        }
                    }while (venta);
                    break;
                case "3":
                    do {
                        System.out.println("-----Menu Tickets-----");
                        ticket();
                        opcionTicket = scan.nextLine();
                        switch (opcionTicket){
                            case "1":
                                System.out.println("Mostrar tickets");
                                break;
                            case "2":
                                System.out.println("Buscar ticket especifico");
                                break;
                            case "3":
                                System.out.println("Saliendo de Tickets... \n");
                                ticket = false;
                                break;
                        }
                    }while (ticket);
                    break;
                case "4":
                    System.out.println("Cerrando la tienda...");
                    tiendaAbierta = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida porfavor.");
            }
        }while (tiendaAbierta);
    }
    public static void opciones(){
        System.out.println("------BIENVENIDO-----");
        System.out.println("Que desea hacer?\n");
        System.out.println("|1| Inventario.");
        System.out.println("|2| Venta.");
        System.out.println("|3| Tickets.");
        System.out.println("|4| Cerrar la tienda");
    }
    public static void inventario(){
        System.out.println("|1| Agregar producto.");
        System.out.println("|2| Eliminar producto.");
        System.out.println("|3| Volver al menu principal");
    }
    public static void venta(){
        System.out.println("|1| Agregar producto.");
        System.out.println("|2| Eliminar producto.");
        System.out.println("|3| Hacer venta.");
        System.out.println("|4| Volver al menu principal.");
    }
    public static void ticket(){
        System.out.println("|1| Mostrar los tickets.");
        System.out.println("|2| Buscar ticket especifico.");
        System.out.println("|3| Volver al menu principal.");
    }
}