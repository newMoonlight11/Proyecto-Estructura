package design;

public class books {

    private String titulo;
    private int año;
    private int paginas;
    
    public books (String titulo, int año, int paginas){
        this.titulo = titulo;
        this.año = año;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getAño() {
        return año;
    }


    public void setAño(int año) {
        this.año = año;
    }


    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    @Override
    public String toString() {
        return this.titulo;
    }
}
