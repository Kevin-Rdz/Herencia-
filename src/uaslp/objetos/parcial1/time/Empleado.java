package uaslp.objetos.parcial1.time;

public class Empleado extends Persona{
    private double sueldoBruto;

   // mostrar();

    //calcularSalarioNeto();

   public void setSueldoBruto( double sueldoBruto ){
       this.sueldoBruto = sueldoBruto;
   }

   public double getSueldoBruto(){
       return sueldoBruto;
   }
}
