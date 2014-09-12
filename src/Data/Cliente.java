package Data;

public class Cliente {
    private String patente;
    private String tipoV;
    private int DNI;
    private int tipo;
    private int prioridad;
    private int[] hora = {0,0,0,0};
    
//______________________________________________________________________________

    public Cliente(String patente, int DNI, int tipo, int[] hora) {
        this.patente = patente;
        this.DNI = DNI;
        this.tipo = tipo;
        this.hora = hora;
    }
    
    public int tipoPrioridad(){
        switch(tipo){
            case 1:
                prioridad = 0;
                tipoV = "Auto";
                break;
            case 2:
                prioridad = 0;
                tipoV = "Taxi/Remis";
                break;
            case 3:
                prioridad = 0;
                tipoV = "Camioneta";
                break;
            case 4:
                prioridad = 10;
                tipoV = "Ambulancia";
                break;
            case 5:
                prioridad = 5;
                tipoV = "Móvil policial";
                break;
            case 6:
                prioridad = 5;
                tipoV = "Grua";
                break;
            case 7:
                prioridad = 10;
                tipoV = "Bombero";
                break;
            default:
                System.out.println("Error");
                break;
        }
        return prioridad;
    }  
    
//______________________________________________________________________________
    public int getDNI() {
        return DNI;
    }
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public int getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    public String getTipoV() {
        return tipoV;
    }
    public void setTipoV(String tipoV) {
        this.tipoV = tipoV;
    }
    public int[] getHora() {
        return hora;
    }
    public void setHora(int[] hora) {
        this.hora = hora;
    }
}
