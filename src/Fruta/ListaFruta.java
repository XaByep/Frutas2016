package Fruta;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 * Created by JAVI on 17/10/2016.
 */
public class ListaFruta {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //Comprobamos con Array
        FrutaProceso fp = new FrutaProceso();
        fp.conectar();
        String[] frutas = fp.listaFrutaArray();
        for (String string : frutas) {
            System.out.println(string);
        }

        //Comprobamos Vector
        Vector<Fruta> frutaVector = fp.listaFrutaVector();
        for (Fruta fruta : frutaVector) {
            System.out.println(fruta);
        }

        //Comprobamos ArrayLista
        ArrayList<Fruta> frutaArrayList=fp.listaFrutaArrayList();
        for (Fruta fruta : frutaVector) {
            System.out.println(fruta);
        }

        //Comprobamos el Map
        Map<Integer, String> listaFruta = new HashMap<Integer, String>();
        listaFruta=fp.listaMapeo();
        //Una manera de mostrarlo
        for (Integer key:listaFruta.keySet()) {
            System.out.println(listaFruta.get(key));
        }
        //Otra manera de mostrarlo
        for(java.util.Map.Entry<Integer,String> entry:listaFruta.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

    }
}
