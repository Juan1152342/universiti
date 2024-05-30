
/**
 * Write a description of class ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ayuda {
   
    TipoAyuda tipo;
    Estado estado;
    private Date fechaAsignacion;
    private Date fechaEntrega;

    public Ayuda() {
    }

    public Ayuda(TipoAyuda tipo, Estado estado, Date fechaAsignacion, Date fechaEntrega) {
        this.tipo = tipo;
        this.estado = estado;
        this.fechaAsignacion = fechaAsignacion;
        this.fechaEntrega = fechaEntrega;
    }

    public Ayuda(TipoAyuda tipo, Estado estado) {
        this.tipo = tipo;
        this.estado = estado;
    }
    

    public TipoAyuda getTipo() {
        return tipo;
    }

    public Estado getEstado() {
        return estado;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setTipo(TipoAyuda tipo) {
        this.tipo = tipo;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String imprimirInfoAyudas()
    {
        String informacion;
        informacion = tipo + ", " + estado  + ", " + fechaAsignacion.obtenerFecha() + ", " + fechaEntrega.obtenerFecha()  ;
        return informacion;
    }
   public String imprimirInfoNoAyudas(){
        String informacion;
        informacion = tipo + ", " + estado;
        return informacion;
   }
    public String imprimirAyudas()
    {
        String informacion;
        informacion = tipo + ", " + estado ;
        return informacion;
    }
}

