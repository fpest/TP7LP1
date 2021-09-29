package tp7lp1;

import javax.swing.JOptionPane;
import tp7lp1.vistas.MenuPrincipal;

public class Materia {

private int idMateria;
private String nombre;
private int anio;

    public Materia(int idMateria, String nombre, int anio) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
        
        agregarAListaMaterias(this);
    }
    
    public void agregarAListaMaterias(Materia materia){
            if (MenuPrincipal.getListaMaterias().add(materia)){
            JOptionPane.showMessageDialog(null, "La Materia se agregó correctamente.");
            }else{
            JOptionPane.showMessageDialog(null, "El código de la Materia ya está registrado. No se pudo Agregar.");
            };
            };

    
    
    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.idMateria;
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
        final Materia other = (Materia) obj;
        if (this.idMateria != other.idMateria) {
            return false;
        }
        return true;
    }


}
