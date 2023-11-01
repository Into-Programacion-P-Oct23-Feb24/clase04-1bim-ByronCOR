/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo04 {

    public static void main(String[] args) {
        /*
       DIFERECIA ENTRE:
        println: cuando ejecutas permite que las variables a mostra pantalla tenga un salto de linea
        print: permite que la variables a presentar a pantalla salgan todo junto sin salto de linea
         */
        String nombreEstudiante = "René Rolando";
        String apellidoEstudiante = "Elizalde Solano";
        int nacimiento = 1983;
        System.out.println(nombreEstudiante + " ");
        System.out.print(apellidoEstudiante + " ");
        System.out.print(nacimiento + " ");
        System.out.print(nombreEstudiante + " ");
    }
}
