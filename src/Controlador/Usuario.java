package Controlador;

public class Usuario {
    
    private int id;
    private String nombre;
    private String usuario;
    private String password;
    private String email;
    
    public Usuario(String n, String u, String p, String e) {
        this.nombre = n;
        this.usuario = u;
        this.password = p;
        this.email = e;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Usuario() {
        this.nombre = null;
        this.usuario = null;
        this.password = null;
        this.email = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return usuario;
    }

    public void setUser(String user) {
        this.usuario = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nNick: " + usuario + "\nContraseña: " + password
                + "\nCorreo Electronico: " + email + "\n";
    }

}
