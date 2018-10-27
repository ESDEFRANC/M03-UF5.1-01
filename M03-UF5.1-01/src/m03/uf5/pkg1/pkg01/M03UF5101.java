package m03.uf5.pkg1.pkg01;

import java.io.BufferedReader;
import static java.io.FileDescriptor.in;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Boolean.compare;
import static java.lang.System.in;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import static java.util.Objects.compare;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;
import static java.util.Spliterators.iterator;
import static java.util.Spliterators.iterator;
import java.util.TreeSet;
import static javafx.scene.input.KeyCode.T;
import m03.uf5.pkg1.pkg01.Empleado;

/**
 *
 * @author usuario
 */
public class M03UF5101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException, IOException {
        FileReader fr = new FileReader("empleados.dat");
        BufferedReader br = new BufferedReader(fr);
        //ArrayList empleado = new ArrayList();

        Queue<Empleado> empleados = leerDocumento(br);
        int dias = 1;
        
        
        
            while(!empleados.isEmpty()) {
                Empleado e = empleados.poll();
                System.out.println(" Nombre : " + e.getNombre() + ", apellido: " + e.getApellido() + "Mes: " + dias++);
            }
             
             
        
       

            
            //System.out.println(emp.getFecha());
        

            

    }

    public static Queue<Empleado> leerDocumento(BufferedReader br) throws ParseException, IOException {
        String cadena = null;
        Queue<Empleado> empleados = new PriorityQueue<Empleado>(12, new Comparator<Empleado>() {
            @Override
            public int compare(Empleado t, Empleado t1) {

                if (t.getFecha().after(t1.getFecha())) {
                    
                    return 1;
                } else if (t.getFecha().before(t1.getFecha())) {
                    return -1;

                } else {
                    return 0;
                }

            }
        });
        while ((cadena = br.readLine()) != null) {
            String[] parts = cadena.split("/");
            Empleado e = createEmployee(parts);
            empleados.offer(e);

        }
        System.out.println("Documento creado y cargado");
        return empleados;
    }

    private static Empleado createEmployee(String[] data) throws ParseException {
        Date fecha;
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");

        fecha = formatoDelTexto.parse(data[3]);

        return new Empleado(data[0], data[1], data[2], fecha);

    }

}
