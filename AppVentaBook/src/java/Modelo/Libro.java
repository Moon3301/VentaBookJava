/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alumno
 */
public class Libro {
        
    private int id;
    private String nombre;
    private String imagen;
    private String editorial;
    private int stock;
    private int precio;
    private Categoria cat;

    public Libro() {
    }

    public Libro(int id, String nombre, String imagen, String editorial, int stock, int precio, Categoria cat) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.editorial = editorial;
        this.stock = stock;
        this.precio = precio;
        this.cat = cat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }

   
    
    

}
