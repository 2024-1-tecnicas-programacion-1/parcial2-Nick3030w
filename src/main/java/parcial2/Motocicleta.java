package parcial2;
/**
 * 
 * @author Nick3030w
 * clase Motocicleta
 * Complejidad: 0(1) complejidad constante.
 */
public class Motocicleta extends Vehiculo{
    private TipoMotocicleta tipoMotocicleta;

    public Motocicleta(String marca, String modelo, int año,TipoMotocicleta tipoMotocicleta) {
        super(marca, modelo, año);
        this.tipoMotocicleta = tipoMotocicleta;
    }
    @Override
    public String imprimirInformacion(){
    String info = marca + " " + modelo + " " + año + ", tipo de motocicleta: " + tipoMotocicleta;
    return info;
    }

    public TipoMotocicleta getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    public void setTipoMotocicleta(TipoMotocicleta tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }
    
}
