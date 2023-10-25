import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> tareas = new ArrayList<>();

        System.out.println("Agrege primer tarea");
        String tarea1 = sc.next();
        tareas.add(tarea1);

        System.out.println("Agrege segunda tarea");
        String tarea2 = sc.next();
        tareas.add(tarea2);
    }
}