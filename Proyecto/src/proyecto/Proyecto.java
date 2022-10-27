/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

 

public class Proyecto {
    
    public static void main(String[] args) {
        try{

            ObjectOutputStream objout = new ObjectOutputStream(new FileOutputStream ("p royecto.txt"));
            Libros e1 = new Libros();     
            String titulo=JOptionPane.showInputDialog("Ingresa el título del libro");
            e1.setTitulo(titulo);
            String fecha=JOptionPane.showInputDialog("Ingresa el año de publicación");
            int año=Integer.parseInt(fecha);
            e1.setAño(año);
            String paginas=JOptionPane.showInputDialog("Ingresa el número de páginas");
            int pag=Integer.parseInt(paginas);
            e1.setPaginas(pag);
            objout.writeObject(e1);
            ObjectInputStream objin=new ObjectInputStream (new FileInputStream("p royecto.txt"));
            Libros e2=(Libros) objin.readObject();
            System.out.println( "Titulo: "+e2.getTitulo()+ "\n" +"Fecha de Publicación: "+ e2.getAño()+"\n"+"No. de Paginas: "+e2.getPaginas());
            
         
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
