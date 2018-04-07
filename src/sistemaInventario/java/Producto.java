
package sistemaInventario.java;

/**
 * @author Alvaro García <alvarogarcia1010 at github.com>
 */

public class Producto 
{
    private String nombre,categoria, proveedor;
    private int id, cantExistencia;
    private double precioVenta, precioCompra;
    private boolean estado;

    public Producto() {}
    
    /**
     * Constructor Completo
     *
     * @param nombre
     * @param categoria
     * @param estado
     * @param proveedor
     * @param id
     * @param cantExistencia
     * @param precioVenta
     * @param precioCompra 
     */

    public Producto(String nombre, String categoria, boolean estado, String proveedor, int id, int cantExistencia, double precioVenta, double precioCompra) 
    {
        this.nombre = nombre;
        this.categoria = categoria;
        this.estado = estado;
        this.proveedor = proveedor;
        this.id = id;
        this.cantExistencia = cantExistencia;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getCategoria() 
    {
        return categoria;
    }

    public void setCategoria(String categoria) 
    {
        this.categoria = categoria;
    }

    public boolean getEstado() 
    {
        return estado;
    }

    public void setEstado(boolean estado) 
    {
        this.estado = estado;
    }

    public String getProveedor() 
    {
        return proveedor;
    }

    public void setProveedor(String proveedor) 
    {
        this.proveedor = proveedor;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public int getCantExistencia() 
    {
        return cantExistencia;
    }

    public void setCantExistencia(int cantExistencia) 
    {
        this.cantExistencia = cantExistencia;
    }
    
    public double getPrecioVenta()
    {
        return precioVenta;
    }
    
    public void setPrecioVenta(double precioVenta)
    {
        this.precioVenta = precioVenta;
    }
    
    public double getPrecioCompra()
    {
        return precioCompra;
    }
    
    public void setPrecioCompra(double precioCompra)
    {
        this.precioCompra = precioCompra;
    }
    
}
