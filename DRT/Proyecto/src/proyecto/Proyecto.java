/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Proyecto {

    public static ArrayList<Libros> libros = new ArrayList<Libros>();

    public static Libros libro;

    public static String fichero = "Biblioteca.dat";

    public static void main(String[] args) {
        libros = cargarLibros();
        int opcion = 0;
        DRT w = new DRT();
        w.setSize(800, 600);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setVisible(true);
        w.setLocationRelativeTo(null);

    }

    public static void crear() {
        String titulo;
        int año;
        int paginas;
        int leidas;
        titulo = JOptionPane.showInputDialog("Ingresa el título del libro: ");
        paginas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de páginas del libro: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la fecha de publicación del libro: "));
        leidas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de páginas que haz leido: "));
        libro = new Libros(titulo, año, paginas, leidas);
        //añadir el producto a la colección
        libros.add(libro);
    }

    public static String listar() {
        String texto = "";
        // clase, producto, colección
        for (Libros libro : libros) {
            texto += "\n" + "[Meta " + (libros.indexOf(libro) + 1) + "] \n" + libro + "\nTe faltan " + (libro.getPaginas() - libro.getLeidas()) + " páginas.";
        }
        JOptionPane.showMessageDialog(null, texto);
        return texto;

    }

    public static ArrayList<Libros> cargarLibros() {
        ArrayList<Libros> libros = new ArrayList<Libros>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
            Object aux = ois.readObject();
            while (aux != null) {
                if (aux instanceof Libros) {
                    libros.add((Libros) aux);
                }
                aux = ois.readObject();

            }
            ois.close();
        } catch (FileNotFoundException e) {
            try {
                File archivo = new File(fichero);
                archivo.createNewFile();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        } catch (Exception e) {

        }
        return libros;
    }

    public static void guardaLibros() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
            for (Libros libro : libros) {
                oos.writeObject(libro);
            }
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void eliminarLibro() {
        int indice = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el índice de la meta a eliminar: " + listar()));
        libros.remove(indice - 1);
        JOptionPane.showMessageDialog(null, "El libro ha sido eliminado.\n");
    }

    public static void editarLibro() {
        int indice = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el índice de la meta a editar: " + listar()));
        libro = libros.get(indice - 1);
        libro.setTitulo(JOptionPane.showInputDialog("Ingresa el nombre del producto: "));
        libro.setAño(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el áño de publicación : ")));
        libro.setPaginas(Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de paginas del libro: ")));
        libro.setLeidas(Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de paginas que has leido: ")));

        JOptionPane.showMessageDialog(null, "La meta ha sido editada.\n" + libro + "Te faltan " + (libro.getPaginas() - libro.getLeidas()) + " páginas. Animo!!!");
    }
}
