public class Main {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   SISTEMA DE INVERNADERO INTELIGENTE 🌱");
        System.out.println("==============================================");

        // Instanciar el sistema de riego
        SistemaRiego sistemaRiego = new SistemaRiego();

        // Arreglo polimórfico de sensores
        Sensor[] sensores = new Sensor[3];
        sensores[0] = new SensorTemperatura("ST-01", "Zona Norte", true, 32.0);
        sensores[1] = new SensorHumedad("SH-01", "Zona Central", true, 55.0);
        sensores[2] = new SensorHumedadSuelo("SS-01", "Zona Sur", true, 22.0); // Humedad baja (22%)

        System.out.println("\n--- EVALUACIÓN POLIMÓRFICA DE SENSORES ---");
        for (Sensor sensor : sensores) {
            sensor.evaluarMedicion();
        }

        System.out.println("\n--- INTEGRACIÓN Y USO DE INSTANCEOF + CASTING ---");
        for (Sensor sensor : sensores) {
            // Verificar si el sensor es un SensorHumedadSuelo antes de hacer el casting
            if (sensor instanceof SensorHumedadSuelo) {
                // Casting explícito para acceder al método específico que no está en la superclase
                SensorHumedadSuelo sensorSuelo = (SensorHumedadSuelo) sensor;

                System.out.println("Se detectó un Sensor de Humedad del Suelo [" + sensorSuelo.getId() + "]");

                if (sensorSuelo.requiereRiegoUrgente()) {
                    System.out.println("Evaluación: Humedad crítica del suelo detectada (" + sensorSuelo.getMedicion() + "%).");
                    sistemaRiego.activar();
                } else {
                    System.out.println("Evaluación: Humedad del suelo dentro de rango. No se requiere riego.");
                    sistemaRiego.desactivar();
                }
            }
        }

        System.out.println("\n--- ESTADO FINAL DEL SISTEMA ---");
        sistemaRiego.consultarEstado();
        System.out.println("==============================================");
    }
}