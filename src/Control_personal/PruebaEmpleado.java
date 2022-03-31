
package Control_personal;

public class PruebaEmpleado {
    public static void main(String[] args) {
       Empleado emp=new Empleado();
       emp.getSueldo_base();
       emp.getNombre();
       emp.getDireccion();
       emp.getEdad();
       
       System.out.println("Ingrese nombre del empleado:");
       System.out.println("Ingrese la direccion del empleado:");
       System.out.println("Ingrese edad del empleado:");
       System.out.println("Ingrese sueldo del empleado:");
       System.out.println("El sueldo total es:" +PruebaEmpleado.calcularSueldo(sueldo,AFP,ISR,ISSS,descuentos));
       
    }
    
    
    
    public static double calcularSueldo(double sueldo, double AFP, double ISR, double ISSS,double descuentos){
      double descuento;
      double descuento_total;
      descuentos= sueldo+ ISSS + AFP + ISR;
      descuento_total=sueldo-ISSS-AFP-ISR;
      return descuento_total;
   }
}
