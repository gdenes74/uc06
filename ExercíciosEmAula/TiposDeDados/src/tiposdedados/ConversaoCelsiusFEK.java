
package tiposdedados;

public class ConversaoCelsiusFEK {
    public static void main(String[] args) {
        float celsius = 20, farenheit, kelvin;
        
        farenheit = celsius * 1.8f + 32;
        kelvin = celsius + 273.15f;
        System.out.println(celsius + "°C correspondem a " + farenheit + "F e " + kelvin + "K.");
        
    }
    
}
