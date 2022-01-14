/**
 * Módulo: DI
 * Archivo: Alumno.java
 * Objetivo: Servir de Modelo en la aplicación
 * Equipo/Personas: Nicolás Esteban Bórquez
 */
package modelo;

/**
 * Esta clase es el modelo Alumno utilizado en la aplicación.
 *
 * @author Nicolás Esteban Borquez
 * @version 1.0
 */
public class Alumno implements Comparable<Alumno> {

    /**
     * DNI del alumno
     */
    private String DNI;

    /**
     * Módulo en el que está matriculado.
     */
    private String modulo;

    /**
     * Nota obtenida por el alumno
     */
    private Double nota;

    /**
     * Provincia de residencia del alumno.
     */
    private String provincia;

    /**
     * Constructor sin parámetros.
     */
    public Alumno() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param DNI DNI del alumno
     * @param modulo Módulo en el que está matriculado.
     * @param nota Nota obtenida por el alumno
     * @param provincia Provincia de residencia del alumno.
     */
    public Alumno(String DNI, String modulo, Double nota, String provincia) {
        this.DNI = DNI;
        this.modulo = modulo;
        this.nota = nota;
        this.provincia = provincia;
    }

    /**
     * Método getter de DNI
     *
     * @return Devuelve el DNI del alumno
     */
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * Método getter de Módulo
     *
     * @return Devuelve el módulo en el que el alumno está matriculado
     */
    public String getModulo() {
        return modulo;
    }

    /**
     * Método setter de Módulo
     *
     * @param modulo Módulo que se quiere insertar en el objeto Alumno
     */
    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    /**
     * Método getter de Nota
     *
     * @return Devuelve la nota obtenida por el alumno
     */
    public Double getNota() {
        return nota;
    }

    /**
     * Método setter de Nota
     *
     * @param nota Nota que se quiere insertar en el objeto Alumno
     */
    public void setNota(Double nota) {
        this.nota = nota;
    }

    /**
     * Método getter de Provincia
     *
     * @return Devuelve la provincia de residencia del alumno
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Método setter de provincia
     *
     * @param provincia Provincia que se quiere insertar en el objeto Alumno
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * Método que permite comparar si dos Alumnos son el mismo objeto
     *
     * @param alumno Alumno que se quiere comparar
     * @return Int que indica si la comparación es positiva o negativa
     */
    @Override
    public int compareTo(Alumno alumno) {
        return modulo.compareTo(alumno.getModulo());
    }

}
