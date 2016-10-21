package AccesoBBDD; /**
 * Created by JAVI on 14/10/2016.
 */
import java.sql.*;

public class AccesoBD {
    private static AccesoBD miConexion = null;
    private Connection conexion = null;
    private String driver = null;
    private String dbName = null;
    private String user = null;
    private String password = null;

    synchronized public static AccesoBD getMiConexion() {
        if (miConexion == null)
            miConexion = new AccesoBD();
        return miConexion;
    }

    synchronized public void conectar(String driver, String dbName, String user, String password)
            throws SQLException, ClassNotFoundException {
        if (conexion != null)
            if (!this.driver.equals(driver) || !this.dbName.equals(dbName)
                    || (this.user != null && !this.user.equals(user))
                    || (this.password != null && !this.password.equals(password))) {
                conexion.close();
            } else {
                return;
            }

        //Conexión Nueva
        //Cargar el driver
        Class.forName(driver);

        if(user==null||password==null) {
            conexion = (Connection) DriverManager.getConnection(dbName);
        }else {
            conexion=(Connection) DriverManager.getConnection(dbName,user,password);
        }
        System.out.println("Estas conectado a BD "+dbName);
        this.driver=driver;
        this.dbName=dbName;
        this.user=user;
        this.password=password;

    }//conectar

    //Cerramos conexión
    synchronized public void cerrar() throws SQLException{
        if(conexion!=null)conexion.close();
    }//Cerramos conexion

    //Para ejecutar sentencias Select
    synchronized public ResultSet executeQuery(String sqlSentence) throws SQLException{
        if(conexion==null)return null;
        Statement sentence=(Statement) conexion.createStatement();
        return ((Statement) sentence).executeQuery(sqlSentence);
    }
    //Para ejecutar sentencias update, delete e insert
    synchronized public int executeUpdate(String sqlSentence) throws SQLException{
        if(conexion==null)return -1;
        Statement sentence=(Statement) conexion.createStatement();
        return ((Statement) sentence).executeUpdate(sqlSentence);
    }
}//AccesoBBDD.AccesoBD

