package obj;


public class PersonalAdministrativo extends Persona{
    
    private final String cargo ;

    public PersonalAdministrativo(String cargo, int id, String nombre, String apellidoPaterno, String apellidoMaterno, int edad, TipoPersona tipoPersona) {
        super(id, nombre, apellidoPaterno, apellidoMaterno, edad, tipoPersona);
        this.cargo = cargo;
    }

    /**
     * Get the value of cargo
     *
     * @return the value of cargo
     */
    public String getCargo() {
        return cargo;
    }

    public static class Alumno extends Persona {

        private final int creditosAcumulados;
        private final int materiasInscritas;

        /**
         * Get the value of materiasInscritas
         *
         * @return the value of materiasInscritas
         */
        public int getMateriasInscritas() {
            return materiasInscritas;
        }

        public Alumno(int creditosAcumulados, int materiasInscritas, int id, String nombre, String apellidoPaterno, String apellidoMaterno, int edad, TipoPersona tipoPersona) {
            super(id, nombre, apellidoPaterno, apellidoMaterno, edad, tipoPersona);
            this.creditosAcumulados = creditosAcumulados;
            this.materiasInscritas = materiasInscritas;
        }

        /**
         * Get the value of creaditosAcumulados
         *
         * @return the value of creaditosAcumulados
         */
        public int getCreaditosAcumulados() {
            return creditosAcumulados;
        }

        @Override
        public String toString() {
            return super.toString() + " Alumno{" + "creditosAcumulados=" + creditosAcumulados + '}';
        }
    }

   

}
