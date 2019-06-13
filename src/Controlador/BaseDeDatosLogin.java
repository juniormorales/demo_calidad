
package Controlador;

public class BaseDeDatosLogin {
    private Usuario lista[] = new Usuario[100];

    public BaseDeDatosLogin() {
        this.lista[0] = new Usuario("Ricardo", "a", "a", "ricardo@hotmail.com");
        this.lista[1] = new Usuario("Flor Brenda", "brendaf", "123456", "brenda@hotmail.com");
    }

    public boolean AñadirUsuario(Usuario u) {
        boolean correcto = false;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null) {
                
                lista[i] = u;
                correcto = true;
                break;
            }
        }
        return correcto;
    }

    public boolean EncontrarUsuario(Usuario u) {
        boolean encontrado = false;
        for (int i = 0; i < lista.length && lista[i]!=null; i++) {
            if (lista[i] == u) {
                encontrado = true;
                break;
            }
        }
        return encontrado;
    }

    public boolean EncontrarUsuario(String u, String p) {
        boolean encontrado = false;
        for (int i = 0; i < lista.length && lista[i]!=null; i++) {
            if (lista[i].getUser().compareToIgnoreCase(u) == 0
                    && lista[i].getPassword().compareTo(p) == 0) {
                encontrado = true;
                break;
            }
        }
        return encontrado;

    }

    public Usuario ObtenerUsuario(String u, String p) {
        Usuario user = new Usuario();
        for (int i = 0; i < lista.length && lista[i]!=null; i++) {
            if (lista[i].getUser().compareToIgnoreCase(u) == 0
                    && lista[i].getPassword().compareToIgnoreCase(p) == 0) {
                user = lista[i];
                break;
            }
        }
        return user;
    }
}
