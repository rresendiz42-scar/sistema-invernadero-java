public class SistemaRiego {
    private boolean activo;

    public SistemaRiego() {
        this.activo = false; // Por defecto inicia inactivo
    }

    public void activar() {
        this.activo = true;
        System.out.println("Sistema de Riego -> ¡ACTIVADO! Suministrando agua.");
    }

    public void desactivar() {
        this.activo = false;
        System.out.println("Sistema de Riego -> INACTIVO. Suministro de agua detenido.");
    }

    public boolean isActivo() {
        return activo;
    }

    public void consultarEstado() {
        if (activo) {
            System.out.println("Estado del Riego: ACTIVO");
        } else {
            System.out.println("Estado del Riego: INACTIVO");
        }
    }
}