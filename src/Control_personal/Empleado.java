
package Control_personal;

 class Empleado {
    
     String nombre,Direccion,area;
     int codigo_empleado,edad;
     
   
     double sueldo_base;
     double descuentos,ISSS,AFP,ISR;
     
     public Empleado(String nombre,String area,int codigo_empleado, int edad,double sueldo_base)
     {
         this.nombre=nombre;
         this.Direccion=Direccion;
         this.area=area;
         this.codigo_empleado=codigo_empleado;
         this.edad=edad;
         this.sueldo_base=sueldo_base;
     }

    Empleado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(int codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }
     
      public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
     
}
