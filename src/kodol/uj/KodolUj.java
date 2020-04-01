/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodol.uj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Set jobetuk = new HashSet();
        for (char i = 'A'; i <= 'Z'; i++) {
            jobetuk.add(i);
        }
        
        /*nyilt = nyilt.replace('Á', 'A');
        nyilt = nyilt.replace('Ö', 'O');
        nyilt = nyilt.replace('Ő', 'O');
        nyilt = nyilt.replace('Ó', 'O');
        nyilt = nyilt.replace('É', 'E');
        nyilt = nyilt.replace('Í', 'I');
        nyilt = nyilt.replace('Ü', 'U');
        nyilt = nyilt.replace('Ű', 'U');
        nyilt = nyilt.replace('Ú', 'U');
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
        //3. feladat
        System.out.println(nyilt);
        //4. feladat
        System.out.println("Kérem edjon meg egy max. 5 karakter hosszúságú, a kódolás feltételeinek megfelelő kulcsszót!");
        String kulcsszo = sc.nextLine();
        kulcsszo = kulcsszo.toUpperCase();
        //5. feladat
        String kulcsszöveg = kulcsszo;
        for (int i = 0; i < 200; i++) {
            if (kulcsszöveg.length() == nyilt.length()) {
                break;
            } else {
                if (kulcsszöveg.length() > nyilt.length()) {
                    for (int j = 0; j < 5; j++) {
                        if (kulcsszöveg.length() == nyilt.length()) {
                            break;
                        } else {
                            kulcsszöveg = kulcsszöveg.substring(0, kulcsszöveg.length() - 1);
                        }
                    }
                } else {
                    kulcsszöveg = kulcsszöveg.concat(kulcsszo);
                }
            }
        }
        System.out.println(kulcsszöveg);
        //6. feladat
        try {
            FileReader buta = new FileReader("vtabla.dat");
            BufferedReader okos = new BufferedReader(buta);
            char[][] tabla = new char[26][26];
            for (int i = 0; i < 26; i++) {
                String nyers = okos.readLine();
                for (int j = 0; j < 26; j++) {
                    tabla[i][j] = nyers.charAt(j);
                }
            }
            
            Integer sor = 0;
            Integer oszlop = 0;
            Integer sorba=0;
            char[] kodolt=new char[nyilt.length()];
            for (int y = 0; y < 26; y++) {
                for (int i = 0; i < 26; i++) {
                    if (nyilt.charAt(sorba) == tabla[i][0]) {
                        sor = i;
                    }
                    if (kulcsszöveg.charAt(sorba) == tabla[0][i]) {
                        oszlop = i;
                    }
                }
                sorba++;
                kodolt[y]=tabla[sor][oszlop];
            }
            for (int i = 0; i < 26; i++) {
                System.out.print(kodolt[i]);
            }
            FileWriter buta2=new FileWriter("kodolt.dat");
            PrintWriter okos2=new PrintWriter(buta2);
            for (int i = 0; i < 26; i++) {
                okos2.print(kodolt[i]);
            }
            okos2.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("Nem található a file!");
        } catch (IOException ex) {
            System.out.println("Hiba az olvasásánál!");
        }*/

    }

}
