package tp7lp1;


import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import tp7lp1.vistas.MenuPrincipal;

public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    private Set<Materia> materias = new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;

        agregarAListaAlumnos(this);
    }
 
    public void agregarAListaAlumnos(Alumno alumno){
            if (MenuPrincipal.getListaAlumnos().add(alumno)){
            JOptionPane.showMessageDialog(null, "El Alumno se agregó correctamente.");
            }else{
            JOptionPane.showMessageDialog(null, "El Legajo del Alumno ya está registrado. No se pudo Agregar.");
            };
            };
    
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMateria(Materia materia) {
        if (cantidadMaterias()<3){
            if(materias.add(materia)){
                    JOptionPane.showMessageDialog(null, "El Alumno se inscribió correctamente en la Materia.");
            }else{
                    JOptionPane.showMessageDialog(null, "El Alumno ya estaba inscripto en esta Materia. No se puede volver a Inscribir.");
            }
        }else{
                JOptionPane.showMessageDialog(null, "El Alumno está inscripto en 3 materias. No se pudo Inscribir.");
        };
        
        
    }

    public int cantidadMaterias() {
        return materias.size();
    }

    @Override
    public String toString() {
        return apellido + ", " + nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }

}
