
package practica_semana4;


public class Edificio {
     String nombre,ubicacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantidad_departamento() {
        return cantidad_departamento;
    }

    public void setCantidad_departamento(int cantidad_departamento) {
        this.cantidad_departamento = cantidad_departamento;
    }

    public int getCantidad_pisos() {
        return cantidad_pisos;
    }

    public void setCantidad_pisos(int cantidad_pisos) {
        this.cantidad_pisos = cantidad_pisos;
    }
    int cantidad_departamento,cantidad_pisos;
}
