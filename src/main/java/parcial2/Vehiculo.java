package parcial2;
/**
 * 
 * @author Nick3030w
 * clase vehiculo
 * Complejidad: 0(1) complejidad constante.
 */
public class Vehiculo {
    String marca;
    String modelo;
    int año;
    /**
     * Constructor de la clase vehiculo 
     * Complejidad: 0(1) complejidad constante.
     * @param marca
     * @param modelo
     * @param año 
     */
    public Vehiculo(String marca, String modelo,int año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    /**
     * Metodo que imprime la informacion del vehiculo
     * Complejidad: 0(1) complejidad constante.
     * @return 
     */
    public String imprimirInformacion(){
        String info = marca + " " + modelo + " " + año;
    return info;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
}
