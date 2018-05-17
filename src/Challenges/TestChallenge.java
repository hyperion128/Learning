/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

/**
 *
 * @author gustavo.armando
 */
public final class TestChallenge {
    public static void testMyClass(String input, String output){
        if (input.equals(output))System.out.println("Prueba Exitosa, para la entrada ingresada el resultado fue: \""+output+"\" como era esperado.");
        else System.out.println("Prueba Fallida, la aplicacion produjo: \""+input+"\" en lugar de: \""+output+"\"");
    }
    public static void testMyClass(int input, int output){
        if (input==output)System.out.println("Prueba Exitosa, para la entrada ingresada el resultado fue: \""+output+"\" como era esperado.");
        else System.out.println("Prueba Fallida, la aplicacion produjo: \""+input+"\" en lugar de: \""+output+"\"");
    }
}
