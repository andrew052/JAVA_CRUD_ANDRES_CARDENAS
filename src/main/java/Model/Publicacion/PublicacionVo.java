package Model.Publicacion;

public class PublicacionVo {

    private String idPublicacion;
    private String nombreUsua;
    private String descripcion;

    public PublicacionVo() {
    }

    public PublicacionVo(String idPublicacion, String nombreUsua, String descripcion) {
        this.idPublicacion = idPublicacion;
        this.nombreUsua = nombreUsua;
        this.descripcion = descripcion;
    }

    public String getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(String idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getNombreUsua() {
        return nombreUsua;
    }

    public void setNombreUsua(String nombreUsua) {
        this.nombreUsua = nombreUsua;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
}
