
package sistemaInventario.java;

/**
 *
 * @author Alvaro García <alvarogarcia1010 at github.com>
 */

public class Usuario {
    
    private String username, password, nombre, apellido, cargo;
    
    public Usuario() {}
    
    /**
     * Constructor General
     * @param username
     * @param password
     * @param nombre
     * @param apellido
     * @param cargo 
     */
    public Usuario(String username, String password, String nombre, String apellido, String cargo)
    {
       this.username = username;
       this.password = password;
       this.nombre = nombre;
       this.apellido = apellido;
       this.cargo = cargo;
    }

    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getApellido() 
    {
        return apellido;
    }

    public void setApellido(String apellido) 
    {
        this.apellido = apellido;
    }

    public String getCargo() 
    {
        return cargo;
    }

    public void setCargo(String cargo) 
    {
        this.cargo = cargo;
    }
    
    
}
