package lab2_josezuniga__31841432;

import java.util.Date;

public class Universidad {
    private String nombre, nomRector, sucursal, nivel;
    private Date year;
    private int numMaestros, numEstudiantes, costo;

    public Universidad() {
    }

    public Universidad(String nombre, String nomRector, String sucursal, String nivel, Date year, int numMaestros, int numEstudiantes, int costo) {
        this.nombre = nombre;
        this.nomRector = nomRector;
        this.sucursal = sucursal;
        this.nivel = nivel;
        this.year = year;
        this.numMaestros = numMaestros;
        this.numEstudiantes = numEstudiantes;
        this.costo = costo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNomRector(String nomRector) {
        this.nomRector = nomRector;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public void setNumMaestros(int numMaestros) {
        this.numMaestros = numMaestros;
    }

    public void setNumEstudiantes(int numEstudiantes) {
        this.numEstudiantes = numEstudiantes;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNomRector() {
        return nomRector;
    }

    public String getSucursal() {
        return sucursal;
    }

    public String getNivel() {
        return nivel;
    }

    public Date getYear() {
        return year;
    }

    public int getNumMaestros() {
        return numMaestros;
    }

    public int getNumEstudiantes() {
        return numEstudiantes;
    }

    public int getCosto() {
        return costo;
    }
       
}
