public class SensorTemperatura extends Sensor {

    public SensorTemperatura(String id, String ubicacion, boolean activo, double medicion) {
        super(id, ubicacion, activo, medicion); // Hereda los atributos del padre
    }

    @Override
    public void evaluarMedicion() {
        double temp = getMedicion();
        System.out.print("Sensor Temp ["+ getId() +  " en " + getUbicacion() + "] -> " + temp + " °C: ");
        if (temp < 18) {
            System.out.println("Temperatura baja");
        } else if (temp <= 30) {
            System.out.println("Temperatura adecuada");
        } else {
            System.out.println("Temperatura alta");
        }
    }
}