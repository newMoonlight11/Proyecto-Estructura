/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.io.*;
public class Libros implements Serializable {
    private String titulo;
    private int año;
    private int paginas;
    private int leidas;

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * @return the paginas
     */
    public int getPaginas() {
        return paginas;
    }

    /**
     * @param paginas the paginas to set
     */
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public int getLeidas(){
        return leidas;
    }
    public void setLeidas(int leidas){
        this.leidas=leidas;
    }
    
    @Override
    public String toString() {
        return "Libro: " + " " + titulo + " //" + "Fecha de lanzamiento: " + año +" //" +" Número de paginas = " + paginas;
    }

    public Libros(String titulo, Integer año, Integer paginas, Integer leidas) {
        this.titulo = titulo;
        this.año = año;
        this.paginas = paginas;
        this.leidas= leidas;
    }

}