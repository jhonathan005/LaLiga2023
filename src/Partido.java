import java.util.ArrayList;

public class Partido {
    private String codigoUnicoPartido;
    private String fechaPartido;
    private String equipoLocal;
    private String equipoVisitante;
    private ArrayList <Equipo> equipos;

    public String getCodigoUnicoPartido() {
        return codigoUnicoPartido;
    }

    public void setCodigoUnicoPartido(String codigoUnicoPartido) {
        this.codigoUnicoPartido = codigoUnicoPartido;
    }

    public String getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(String fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
}
