package uaslp.objetos.parcial1.time;

public class Cliente extends Persona{
    private String telefonoDeContacto;

    //mostrar();
    public void setTelefonoDeContacto(String telefonoDeContacto){
        this.telefonoDeContacto = telefonoDeContacto;
    }
    public String  getTelefonoDeContacto(){
        return telefonoDeContacto;
    }
}