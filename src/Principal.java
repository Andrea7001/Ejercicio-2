import  java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while(continuar){
            System.out.println("Ingrese los datos del empleado:");
            System.out.println("ID: ");
            int id = scanner.nextInt();
            System.out.println("Nombre: ");
            String nombre = scanner.next();
            System.out.println("Apellido: ");
            String apellido = scanner.next();
            System.out.println("Departamento: ");
            String departamento = scanner.next();
            System.out.println("Salario: ");
            double salario = scanner.nextDouble();

            Empleado empleado = new Empleado(id, nombre, apellido, departamento, salario);
            empleados.add(empleado);

            System.out.print("Desea continuar registrando empleados? (s/n): ");
            String repuesta = scanner.next();
            continuar = repuesta.equalsIgnoreCase("s");
        }
        System.out.println("Empleados registrados: ");
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) {
        Empleado empleado = iterator.next();
        System.out.println(empleado.toString());
        }
    }
}

