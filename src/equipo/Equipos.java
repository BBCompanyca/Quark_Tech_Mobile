package equipo;

public class Equipos {

    private int equipoID;
    private String codeEquipo;

    public Equipos(String codeEquipo, int equipoID) {
        this.codeEquipo = codeEquipo;
        this.equipoID = equipoID;
    }

    public String getCodeEquipo() {
        return codeEquipo;
    }

    public void setCodeEquipo(String codeEquipo) {
        this.codeEquipo = codeEquipo;
    }

    public int getEquipoID() {
        return equipoID;
    }

    public void setEquipoID(int equipoID) {
        this.equipoID = equipoID;
    }
}
