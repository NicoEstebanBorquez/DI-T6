package modelo;

public class Alumno implements Comparable<Alumno>{ 

    private String DNI;
    private String modulo;
    private Double nota;
    private String provincia;

    public Alumno() {
    }

    public Alumno(String DNI, String modulo, Double nota, String provincia) {
        this.DNI = DNI;
        this.modulo = modulo;
        this.nota = nota;
        this.provincia = provincia;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    
    @Override
    public int compareTo(Alumno a) {
        return modulo.compareTo(a.getModulo());
    }
    
}
