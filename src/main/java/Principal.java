
import parcial2.Vehiculo;
import parcial2.Automovil;
import parcial2.TipoCombustible;
import parcial2.Motocicleta;
import parcial2.TipoMotocicleta;
/**
 * Clase principal se crean los objetos automovil, vehiculo, motocicleta y se imprime la informacion de cada uno
 * Complejidad: 0(1) complejidad constante.
 * @author Nick3030w
 */
public class Principal {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Mercedes AMG", "CLA", 2024);
        Automovil automovil = new Automovil("BMW", "E30 M3", 1990, 2,TipoCombustible.GASOLINA);
        Motocicleta motocicleta = new Motocicleta("BMW", "XFRR", 2020, TipoMotocicleta.DEPORTIVA);
        System.out.println(vehiculo.imprimirInformacion());
        System.out.println(automovil.imprimirInformacion());
        System.out.println(motocicleta.imprimirInformacion());
    }
}
