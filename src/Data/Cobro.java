package Data;
import Interfaces.*;

//TODO una clase que tome el array de hora del objeto en que entro y le
//reste la hora en que sale y que haga un cálculo de:
//1 dia = 24 horas; 1 hora = 60 minutos
//Si combro x la hora, cobro x los 60 minutos

public class Cobro {
    private float total;
    private int totaI;
    private int totaS;
    
    public float diferenciaYTotal(Cliente cl){
        for (Cliente cls0 : IngSal.cls0) {
            if (cls0 == cl) {
                int d = cl.getHora()[0];
                int h = cl.getHora()[1];
                int m = cl.getHora()[2];
                int t = d*24 + h;
                int to = t*60 + m;
                
                int p = Integer.parseInt(IngSal.txbPrecio.getText());
                int pr = p / 60;
                
                totaI = to * pr;
            }
        }
        for (Cliente cls5 : IngSal.cls5) {
            if (cls5 == cl) {
                int d = cl.getHora()[0];
                int h = cl.getHora()[1];
                int m = cl.getHora()[2];
                int t = d*24 + h;
                int to = t*60 + m;
                
                int p = Integer.parseInt(IngSal.txbPrecio.getText());
                int pr = p / 60;
                
                totaI = to * pr;
            }
        }
        for (Cliente cls10 : IngSal.cls10) {
            if (cls10 == cl) {
                int d = cl.getHora()[0];
                int h = cl.getHora()[1];
                int m = cl.getHora()[2];
                int t = d*24 + h;
                int to = t*60 + m;
                
                int p = Integer.parseInt(IngSal.txbPrecio.getText());
                int pr = p / 60;
                
                totaI = to * pr;
            }
        }
        
//______________________________________________________________________________
        
        for (Cliente cls0 : IngSal.cls0) {
            if (cls0 == cl) {
                int d = Integer.parseInt(Reloj.dia);
                int h = Integer.parseInt(Reloj.hora);
                int m = Integer.parseInt(Reloj.minutos);
                int t = d*24 + h;
                int to = t*60 + m;
                
                int p = Integer.parseInt(IngSal.txbPrecio.getText());
                int pr = p / 60;
                
                totaS = to * pr;
            }
        }
        for (Cliente cls5 : IngSal.cls5) {
            if (cls5 == cl) {
                int d = Integer.parseInt(Reloj.dia);
                int h = Integer.parseInt(Reloj.hora);
                int m = Integer.parseInt(Reloj.minutos);
                int t = d*24 + h;
                int to = t*60 + m;
                
                int p = Integer.parseInt(IngSal.txbPrecio.getText());
                int pr = p / 60;
                
                totaS = to * pr;
            }
        }
        for (Cliente cls10 : IngSal.cls10) {
            if (cls10 == cl) {
                int d = Integer.parseInt(Reloj.dia);
                int h = Integer.parseInt(Reloj.hora);
                int m = Integer.parseInt(Reloj.minutos);
                int t = d*24 + h;
                int to = t*60 + m;
                
                int p = Integer.parseInt(IngSal.txbPrecio.getText());
                int pr = p / 60;
                
                totaS = to * pr;
            }
        }
        
//______________________________________________________________________________
        
        total = totaS - totaI;
        
        System.out.println(totaI +" "+ totaS +" "+ total);
        
        return totaS - totaI;
    }

    public void setAdios(Cliente cli){
        Adios.lblDNIAdios.setText("" + cli.getDNI());
        Adios.lblPatAdios.setText("" + cli.getPatente());
        Adios.lblIngAdios.setText(cli.getHora()[1] + ":" + cli.getHora()[2]
                                    + ":" + cli.getHora()[3]);
        Adios.lblSalAdios.setText(Reloj.hora + ":" + Reloj.minutos + ":"
                                    + Reloj.segundos);
        Adios.lblTotalAdios.setText("" + total);
    }
}