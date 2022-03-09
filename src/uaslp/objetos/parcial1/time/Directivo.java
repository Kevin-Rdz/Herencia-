package uaslp.objetos.parcial1.time;

public class Directivo extends Empleado{
    private String categoria;

    //mostrar();
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getCategoria(){
        return categoria;
    }
}