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
        Scanner sc = new Scanner(System.in, "windows-1252");
        String nyilt;
        System.out.println("Kérem adjon meg egy maximum 255 karakter hosszúságú szöveget!");
        nyilt = sc.nextLine();
        nyilt = nyilt.toUpperCase();
        nyilt = nyilt.replace('Á', 'A');
        nyilt = nyilt.replace('Ö', 'O');
        nyilt = nyilt.replace('Ő', 'O');
        nyilt = nyilt.replace('Ó', 'O');
        nyilt = nyilt.replace('É', 'E');
        nyilt = nyilt.replace('Í', 'I');
        nyilt = nyilt.replace('Ü', 'U');
        nyilt = nyilt.replace('Ű', 'U');
        nyilt = nyilt.replace(" ", "");
        nyilt = nyilt.replace(".", "");
        nyilt = nyilt.replace(",", "");
        nyilt = nyilt.replace(";", "");
        nyilt = nyilt.replace("-", "");
        nyilt = nyilt.replace("!", "");
        nyilt = nyilt.replace("?", "");
        nyilt = nyilt.replace("(", "");
        nyilt = nyilt.replace(")", "");
        nyilt = nyilt.replace("0", "");
        nyilt = nyilt.replace("1", "");
        nyilt = nyilt.replace("2", "");
        nyilt = nyilt.replace("3", "");
        nyilt = nyilt.replace("4", "");
        nyilt = nyilt.replace("5", "");
        nyilt = nyilt.replace("6", "");
        nyilt = nyilt.replace("7", "");
        nyilt = nyilt.replace("8", "");
        nyilt = nyilt.replace("9", "");
        System.out.println(nyilt);
        System.out.println("Kérem edjon meg egy max. 5 karakter hosszúságú, a kódolás feltételeinek megfelelő kulcsszót!");
        String kulcsszo=sc.nextLine();
        kulcsszo=kulcsszo.toUpperCase();
        String kulcsszöveg=kulcsszo;
        for (int i = 0; i < 200; i++) {
            if (kulcsszöveg.length()==nyilt.length()) {
                break;
            }else{
                if (kulcsszöveg.length()>nyilt.length()) {
                    for (int j = 0; j < 5; j++) {
                        if (kulcsszöveg.length()==nyilt.length()) {
                            break;
                        }else{
                        kulcsszöveg=kulcsszöveg.substring(0,kulcsszöveg.length()-1);
                        }
                    }
                }else{
                kulcsszöveg=kulcsszöveg.concat(kulcsszo);
                }
            }
        }
        System.out.println(kulcsszöveg);
        
        

    }

}
