public class Gobernador {
    private String nombre;
    private int telefono;
    private String correo;
    private String partidoPolitico;
    
    public Gobernador(String nombre, int telefono, String correo, String partidoPolitico) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.partidoPolitico = partidoPolitico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }
    
    
}
