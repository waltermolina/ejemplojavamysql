/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Walter
 */
public class PruebaDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Person> listado = new ArrayList<>();

        try {
            // ConexionDB myconexion = new ConexionDB("jdbc:mysql://localhost:3306/ntbr", "walter", "1234");

            /*
                Username: aAmmbFODPF
                Database name: aAmmbFODPF
                Password: BOwcRFIcnJ
                Server: remotemysql.com
                Port: 3306
             */
            ConexionDB myconexion = new ConexionDB("jdbc:mysql://localhost:3306/ntbr", "root", "1234");

            Connection c = myconexion.connect();

            Statement s = c.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet resultados
            ResultSet resultados = s.executeQuery("SELECT p.* FROM person p");

            // Se recorre el ResultSet, mostrando por pantalla los resultados.
            while (resultados.next()) {
                Person a = new Person(
                        resultados.getString("firstname"),
                        resultados.getString("middlename"),
                        resultados.getString("lastname"),
                        resultados.getInt("gender"),
                        resultados.getString("idtype"),
                        resultados.getString("idnumber"),
                        resultados.getString("email")
                );
                
                listado.add(a);

                /*
                System.out.print(
                        "ID: " + resultados.getInt("id"));
                System.out.println(
                        " - " + resultados.getString("nombre")
                        + " " + resultados.getString("apellido"));
                 */
            }
        /*
            PreparedStatement stmt = c.prepareStatement(
                    "select * from alumnomateria, materia\n"
                    + "where alumnomateria.alumno_id = ?\n"
                    + "and alumnomateria.materia_id = materia.id;"
            );
            stmt.setInt(1, listado.get(0).getId());//1 specifies the first parameter in the query
        */          
            
        } catch (SQLException ex) {
            //Logger.getLogger(PruebaDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error!!!  " + ex);
        }

        /*
        System.out.println(
                        "Person: " +
                        listado.get(0).getFirstname() +
                        " " +
                        listado.get(0).getLastname()
        );
        System.out.println("Person: " + listado.get(1).getFirstname() + " " + listado.get(1).getLastname());
        
        */
        
        // Recorro Arraylist listado
        for (int i = 0; i < listado.size(); i++) {
          System.out.println(listado.get(i).getFirstname());
        }
        
    }

}

/*

try { 
    //subirme a un banquito para cambiar un foco
} catch (CaidaException ex){
    //poner almohadon en el piso
} catch (FocoNoExistenteException ex){
    //cancelar todo
} catch (ElectrocutionException ex){
    //llamar al medico
} finally {
    // tomar una cerveza
}

*/