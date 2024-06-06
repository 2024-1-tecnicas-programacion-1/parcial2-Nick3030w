package parcial2;
/**
 * 
 * @author Nick3030w
 * clase automovil que hereda las variables de la clase vehiculo
 * Complejidad: 0(1) complejidad constante.
 */
public class Automovil extends Vehiculo {
    private int numeroPuertas;
    private TipoCombustible tipoCombustible;
    public Automovil(String marca, String modelo,int año, int numeroPuertas, TipoCombustible tipoCombustible){
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }
    /**
     * Metodo sobreescrito imprimir informacion
     * Complejidad: 0(1) complejidad constante.
     * @return 
     */
    @Override    
    public String imprimirInformacion(){
        String info = marca + " " + modelo + " " + año + ", " + numeroPuertas + " puertas, combustión a " + tipoCombustible;
    return info;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
}
