package Model.Publicacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Conexion;


public class PublicacionDao {
     Connection bas;
    PreparedStatement bs;
    ResultSet jan;
    String sql=null;
    int x;
    public int crearP (PublicacionVo crear) throws SQLException{ 
        sql="insert into publicacion (idPublicacion, nombreUsua, descripcion) values(null, ?, ?)";
        try {
            bas=Conexion.conectar();
            bs=bas.prepareStatement(sql);
            bs.setString(1, crear.getNombreUsua());
            bs.setString(2, crear.getDescripcion());
            
            System.out.println("Funcionamiento correcto en el dao de publicacion");
        } catch (Exception e) {
            System.out.println("Error en el Dao de publicacion" + e.getMessage().toString());
            
            
        }
        finally{bas.close();}
        return x;

    } 



    public void elminar(int idPublicacion)throws SQLException {
        sql="delete from publicacion where idPublicacion="+idPublicacion;

        try {
            bas=Conexion.conectar();
            bs=bas.prepareStatement(sql);
            bs.executeUpdate();
            bs.close();
            System.out.println("Se elimino correctamente");

        } catch (Exception e) {
            System.out.println("Error al eliminar"+e.getMessage().toString());
        }

        finally{
            bas.close();
        }
        
    }



    public void actualuizar(int idPublicacion, String nombreUsua, String descripcion ) throws SQLException {
        sql="UPDATE `publicacion` SET `nombreUsua`='"+nombreUsua+"',`descripcion`='"+descripcion+"' WHERE idPublicacion="+idPublicacion;

        try {
            bas=Conexion.conectar();
            bs=bas.prepareStatement(sql);
            bs.executeUpdate();
            bs.close();
            System.out.println("Se actualizo correctamente");

        } catch (Exception e) {
            System.out.println("Error al actualizar"+e.getMessage().toString());
        }

        finally{
            bas.close();
        }

        
    }
}
