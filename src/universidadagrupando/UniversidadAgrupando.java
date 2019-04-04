package universidadagrupando;

import java.util.*;
import obj.*;
import static java.util.stream.Collectors.*;
import java.util.function.*;

public class UniversidadAgrupando {

    public static void main(String[] args) {
            /*int numeroProcesadores = Runtime.getRuntime().availableProcessors();
            System.out.println("numeroProcesadores: "+numeroProcesadores);*/
         
        List<Persona> listaPersonas = Arrays.asList(
                new Alumno(50, 4, 20112154, "Jorge", "Ramirez", "Ortiz", 42, Persona.TipoPersona.Alumno),
                new Alumno(25, 2, 20123265, "Pedro", "Perez", "Lopez", 25, Persona.TipoPersona.Alumno),
                new Alumno(12, 4, 20136598, "Francisco", "Muñoz", "Covarrubias", 20, Persona.TipoPersona.Alumno),
                new Alumno(67, 4, 20108978, "Ricardo", "Madrid", "Ortega", 26, Persona.TipoPersona.Alumno),
                new Alumno(110, 2, 20102165, "Pablo", "Castillo", "Martinez", 36, Persona.TipoPersona.Alumno),
                new Profesor(986521, 10, 3, "Alberto", "Lopez", "Romero", 35, Persona.TipoPersona.Profesor),
                new Profesor(655498, 12, 2, "Rosa", "Perez", "Covarrubias", 50, Persona.TipoPersona.Profesor),
                new Profesor(201548, 20, 2, "Mario", "Castillo", "Mendez", 50, Persona.TipoPersona.Profesor),
                new PersonalAdministrativo("Director", 659874, "Luis", "Rojas", "Inclan", 50, Persona.TipoPersona.Administrativo),
                new PersonalAdministrativo("Asistente", 122356, "Patricia", "Jimenez", "Perez", 30, Persona.TipoPersona.Administrativo),
                new PersonalAdministrativo("Secretaria", 659821, "Martha", "Vega", "Villa", 32, Persona.TipoPersona.Administrativo)
        );    
        

        
        Alumno alumnoA = new Alumno(50, 4, 20112154, "Jorge", "Ramirez", "Ortiz", 42, Persona.TipoPersona.Alumno);
        //Se utiliza la interface Predicate dado que tiene el metodo test el cual nos permite evaluar una condicion 
        Predicate<Alumno> predicadoAlumno = (Alumno varAlumno ) -> varAlumno.getCreaditosAcumulados() > 20;
        boolean resultado = predicadoAlumno.test(alumnoA);
        System.out.println("El valor de resultado es: "+ resultado);//true
        
        List<Alumno> listaAlumnos = Arrays.asList(
       		 new Alumno(50, 4, 20112154, "Jorge", "Ramirez", "Ortiz", 42, Persona.TipoPersona.Alumno),
                new Alumno(25, 2, 20123265, "Pedro", "Perez", "Lopez", 25, Persona.TipoPersona.Alumno),
                new Alumno(12, 4, 20136598, "Francisco", "Muñoz", "Covarrubias", 20, Persona.TipoPersona.Alumno),
                new Alumno(67, 4, 20108978, "Ricardo", "Madrid", "Ortega", 26, Persona.TipoPersona.Alumno),
                new Alumno(110, 2, 20102165, "Pablo", "Castillo", "Martinez", 36, Persona.TipoPersona.Alumno)
                
       );
        
        listaAlumnos.stream().filter(alumno -> alumno.getCreaditosAcumulados() > 20) //Primero filtra los alumnos
        					 .map( alumno -> alumno.getNombre())//.map(Alumno::getNombre)//Segundo de los alumnos filtrados toma el nombre
        					 .forEach(alumno ->  System.out.println(alumno));//.forEach(System.out::println);
        
        List<Alumno> listaAlumnosFiltrada =listaAlumnos.stream()
        											   .filter(alumno -> alumno.getCreaditosAcumulados() > 50)
        											   .collect(toList());// Este permite coleccionar el total de los datos que se filtraron y retornar un array con los objetos. 
        
        System.out.println("Se tienen los alumnos que tiene mayores creditos ");
        listaAlumnosFiltrada.stream().map( alumno -> alumno.getNombre()).forEach(System.out::println);
    }
}
