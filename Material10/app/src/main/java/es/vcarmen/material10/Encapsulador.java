package es.vcarmen.material10;

/**
 * Created by matinal on 30/11/2017.
 */

public class Encapsulador {
    private int imagen;
    private String titulo;
    private String texto;

    public Encapsulador(int idImagen, String textoTitulo, String textoContenido) {
        this.imagen = idImagen;
        this.titulo = textoTitulo;
        this.texto = textoContenido;
    }

    public int getImagen() {
        return imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTexto() {
        return texto;
    }
}
