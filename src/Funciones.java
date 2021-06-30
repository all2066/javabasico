import java.security.PublicKey;

public class Funciones {
    double quantity = 0;
    String currency = "MXN";

    public static void main(String[] args) {
        double y = 3;
        // Area de un circulo
        // pi* r2
        double area = circleArea(y);
        System.out.println(area);

        // Area de una esfera
        // 4*PI*r2
        double areaSphera = sphereArea(y);
        System.out.println(areaSphera);

        // Volumen de yba esfera
        //(4/3)*pi*r3
        double volume = volumeSphere(y);
        System.out.println(volume);

        System.out.println("PESOS A DOLARES: " + convertToDolar(200, "MXN"));

    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return Math.PI*4*Math.pow(r,2);
    }

    public static double volumeSphere(double r){
        return (4/3)*Math.PI*Math.pow(r,3);
    }
    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dolares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de Moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en Dolares
     * */
    public static double convertToDolar(double quantity, String currency){
        //MXN COP
        switch(currency){
            case "MXN":
                quantity *= 0.052;
                break;
            case "COP":
                quantity *= 0.00031;
                break;
        }
        return quantity;
    }
}
