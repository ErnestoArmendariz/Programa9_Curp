/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa9_curp;

/**
 *
 * @author ernes
 */
public class Programa9_Curp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DATOS DATOS = new DATOS();
        DATOS curp1 = new DATOS ("Ernesto", "Estanislao", "Armendariz", "H", "2001", "10", "31", "Mexico");
        
        curp1.getResultado();
        System.out.println(curp1.getResultado());
        
    }
    
}
