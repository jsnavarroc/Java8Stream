package obj;


public class Profesor extends Persona{
    
    private final int antiguedad;
    private final int numeroDeClasesAsignadas;

    public Profesor(int id, int antiguedad, int numeroDeClasesAsignadas, String nombre, String apellidoPaterno, String apellidoMaterno, int edad, TipoPersona tipoPersona) {
        super(id, nombre, apellidoPaterno, apellidoMaterno, edad, tipoPersona);
        this.antiguedad = antiguedad;
        this.numeroDeClasesAsignadas = numeroDeClasesAsignadas;
    }

    /**
     * Get the value of numeroDeClasesAsignadas
     *
     * @return the value of numeroDeClasesAsignadas
     */
    public int getNumeroDeClasesAsignadas() {
        return numeroDeClasesAsignadas;
    }

    /**
     * Get the value of antiguedad
     *
     * @return the value of antiguedad
     */
    public int getAntiguedad() {
        return antiguedad;
    }

}
