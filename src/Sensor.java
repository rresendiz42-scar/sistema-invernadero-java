public class Sensor {
    private String id;
    private String ubicacion;
    private boolean activo;
    private double medicion;
    public Sensor(String id, String ubicacion, boolean activo, double medicion) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.activo = activo;
        this.medicion = medicion;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public double getMedicion() {
        return medicion;
    }

    public void setMedicion(double medicion) {
        this.medicion = medicion;
    }

    public void evaluarMedicion() {
        System.out.println("Evaluando medicion generica...");
    }
}