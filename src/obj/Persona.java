package obj;

public class Persona {
    
    private int id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private TipoPersona tipoPersona;

    public Persona(int id, String nombre, String apellidoPaterno, String apellidoMaterno, int edad, TipoPersona tipoPersona) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.tipoPersona=tipoPersona;
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Get the value of edad
     *
     * @return the value of edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Set the value of edad
     *
     * @param edad new value of edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }


    /**
     * Get the value of apellidoMaterno
     *
     * @return the value of apellidoMaterno
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Set the value of apellidoMaterno
     *
     * @param apellidoMaterno new value of apellidoMaterno
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Get the value of apellidoPaterno
     *
     * @return the value of apellidoPaterno
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Set the value of apellidoPaterno
     *
     * @param apellidoPaterno new value of apellidoPaterno
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public TipoPersona getTipoPersona(){
        return tipoPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", edad=" + edad + ", tipoPersona=" + tipoPersona + '}';
    }
    
    public enum TipoPersona{Alumno, Profesor, Administrativo};
}
