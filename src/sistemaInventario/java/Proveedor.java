
package sistemaInventario.java;

/**
 *
 * @author Alvaro García <alvarogarcia1010 at github.com>
 */
public class Proveedor {
    
    private int id;
    private String nombre, producto;
    
    public Proveedor() {}
    
    /**
     * Constructor General
     * @param id
     * @param nombre
     * @param producto 
     */
    public Proveedor(int id, String nombre, String producto) 
    {
        this.id = id;
        this.nombre = nombre;
        this.producto = producto; 
   }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getProducto() 
    {
        return producto;
    }

    public void setProducto(String producto) 
    {
        this.producto = producto;
    }
     
}
