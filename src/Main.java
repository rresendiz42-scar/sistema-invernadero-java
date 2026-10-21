void main() {
    System.out.println("Sistema de invernadero inteligente");
}
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Invernadero Inteligente ---");

        // 1. Crear una colección (arreglo) utilizando el tipo de la superclase (Sensor)
        // Aquí aplicamos polimorfismo: una referencia de tipo Sensor apunta a objetos de sus subclases
        Sensor[] sensores = new Sensor[3];

        sensores[0] = new SensorTemperatura("ST-01", "Zona Norte", true, 34.5); // Temperatura alta
        sensores[1] = new SensorHumedad("SH-02", "Zona Central", true, 55.0);    // Humedad ambiental adecuada
        sensores[2] = new SensorHumedadSuelo("SS-03", "Zona Sur", true, 22.1);   // Humedad del suelo baja

        System.out.println("\n--- Procesamiento polimórfico de sensores ---");

        // 2. Recorrer la colección y ejecutar el método sobrescrito (Enlace dinámico)
        // Java determina en tiempo de ejecución qué método evaluarMedicion() debe llamar
        for (Sensor sensor : sensores) {
            sensor.evaluarMedicion();
        }
    }
}
