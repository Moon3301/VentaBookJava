/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API_REST;

import Modelo.Categoria;
import Modelo.Libro;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Alumno
 */
@Path("api")
public class GenericResource {

    @Context
    private UriInfo context;
    Categoria cat = new Categoria(1,"Fantasia");
    
    static final ArrayList<Libro> listaLibro = new ArrayList<>();
    
    Libro lib = new Libro(1,"Harry Potter 1", "Harry.jpg","Salamandra",20,19990,cat);
    Libro lib2 = new Libro(2,"Harry Potter 2", "Harry2.jpg","Salamandra",30,39990,cat);
    
    
    

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
        
        listaLibro.add(lib);
        listaLibro.add(lib2);
        
    }

    /**
     * Retrieves representation of an instance of API_REST.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("listar")
    @Produces("application/json")
    public ArrayList<Libro> getLibrosJson() {
        //TODO return proper representation object
        
        
        return listaLibro;
        
        
    }
    
    @POST
    @Path("guardar")
    @Produces("application/json")
    @Consumes("application/json")
    public ArrayList<Libro> guardar(Libro lib){
        
        listaLibro.add(lib);
        
        
        return listaLibro;
        
    }
    
    @POST
    @Path("buscar/{id}")
    @Produces("application/json")
    public Libro buscar(@PathParam("id") String id){
        
        Libro lib = new Libro();
        
        for(Libro l: listaLibro){
            if(l.getId() == Integer.parseInt(id)){
                lib.setId(l.getId());
                lib.setNombre(l.getNombre());
                lib.setImagen(l.getImagen());
                lib.setPrecio(l.getPrecio());
                lib.setStock(l.getStock());
                lib.setEditorial(l.getEditorial());
                lib.setCat(l.getCat());
            }
        }
        
        
        
        return lib;
        
    }
    

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Path("actualizar/{id}")
    @Produces("application/json")
    @Consumes("application/json")
    
    public ArrayList putJsonActualizar(Libro lib) {
        
        for(Libro l: listaLibro){
            
            if(l.getId() == lib.getId()){
               
               l.setNombre(lib.getNombre());
               l.setPrecio(lib.getPrecio());
               l.setStock(lib.getStock());
               l.setEditorial(lib.getEditorial());
               l.setImagen(lib.getImagen());
               
 
            }
 
        }
        
        return listaLibro;

    }
}
