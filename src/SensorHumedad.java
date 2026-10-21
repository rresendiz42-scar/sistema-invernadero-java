public class SensorHumedad extends Sensor {

    public SensorHumedad(String id, String ubicacion, boolean activo, double medicion) {
        super(id, ubicacion, activo, medicion);
    }

    @Override
    public void evaluarMedicion() {
        double hum = getMedicion();
        System.out.print("Sensor Hum. Ambiental [" + getId() + " en " + getUbicacion() + "] -> " + hum + "%: ");
        if (hum < 40) {
            System.out.println("Humedad ambiental baja");
        } else if (hum <= 70) {
            System.out.println("Humedad ambiental adecuada");
        } else {
            System.out.println("Humedad ambiental alta");
        }
    }
}