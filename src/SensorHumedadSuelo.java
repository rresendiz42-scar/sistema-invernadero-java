public class SensorHumedadSuelo extends Sensor {

    public SensorHumedadSuelo(String id, String ubicacion, boolean activo, double medicion) {
        super(id, ubicacion, activo, medicion);
    }

    @Override
    public void evaluarMedicion() {
        double humSuelo = getMedicion();
        System.out.print("Sensor Hum. Suelo [" + getId() + " en " + getUbicacion() + "] -> " + humSuelo + "%: ");
        if (humSuelo < 30) {
            System.out.println("Humedad del suelo baja (Requiere riego)");
        } else if (humSuelo <= 70) {
            System.out.println("Humedad del suelo adecuada");
        } else {
            System.out.println("Humedad del suelo alta");
        }
    }
}