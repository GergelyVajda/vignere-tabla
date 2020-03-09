/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodol.uj;

import java.util.Scanner;

/**
 *
 * @author gvajd
 */
public class KodolUj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in,"windows-1252");
        String nyilt;
        System.out.println("Kérem adjon meg egy maximum 255 karakter hosszúságú szöveget!");
        nyilt=sc.nextLine();
        nyilt=nyilt.toUpperCase();
        char[] betuk=new char[nyilt.length()];
        System.out.println(nyilt);
        betuk=nyilt.toCharArray();
        System.out.println(nyilt);
        /*for (int i = 0; i < 255; i++) {
            if (nyilt.charAt(i)) {
                
            }
        }*/
      
    }
    
}
