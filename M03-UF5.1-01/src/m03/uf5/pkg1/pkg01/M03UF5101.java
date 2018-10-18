package m03.uf5.pkg1.pkg01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.Queue;
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
        FileReader fr = new FileReader ("empleados.dat");
        BufferedReader br = new BufferedReader(fr);
        String[] empleados = new String[11];
            
        
        
        System.out.println(leerDocumento(br));
        
        createEmployee(empleados);
        
        

    }

    public static Queue<Empleado> leerDocumento(BufferedReader br) throws ParseException, IOException {
       String cadena=null;
        Queue<Empleado> empleados = new PriorityQueue<>();
       while((cadena = br.readLine())!= null){
       String[] parts = cadena.split("/");
           createEmployee(parts);
         System.out.println(createEmployee(parts));
       Empleado e = createEmployee(parts);
      
       }
        return empleados;
    }
    
    private static Empleado createEmployee(String[] data) throws ParseException{
       Date fecha;
       SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
       
       fecha = formatoDelTexto.parse(data[3]);
        //System.out.println(fecha);
       
       return new Empleado(data[0],data[1],data[2],fecha);
    }
    
}