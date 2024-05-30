
/**
 * Write a description of class Date here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Date {
    String dia;
    String mes;
    String año;

    public Date() {
    }

    public Date(String dia, String mes, String año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public String getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public String getAño() {
        return año;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setAño(String año) {
        this.año = año;
    }
     public String obtenerFecha() {
        String informacion;
        informacion = dia + ", " + mes + ", " + año;
        return informacion;
    }
}

