/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan30.cakep;

import java.util.Scanner;

/*
Nama  : Cessario Sheva Lakita Purwa Adidjaya
Kelas : IF-2
Nim   : 10117063
Deskripsi  Program : Menampilkan Kerjaan 
 */
public class PBO210117063Latihan30Cakep {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static void main(String[] args) {
        String jwb;
        Scanner scanner = new Scanner(System.in);
        
        
        
        System.out.print(ANSI_RED+"KAMU "+ANSI_RESET);
        System.out.print(ANSI_GREEN+"NGERJAIN SENDIRI "+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"LATIHAN 17 SAMPE "+ANSI_RESET);
        System.out.print(ANSI_BLUE+"LATIHAN 30 INI? "+ANSI_RESET+"\n");
        System.out.print(ANSI_BLUE+"JAWAB (Da/Net) : "+ANSI_RESET);
        jwb = scanner.nextLine();
        
        if (jwb.equals("Da")){
            System.out.println(ANSI_RED+"\nGood Job "+ANSI_RESET+"."+ANSI_PURPLE
                    +"otchlichnaya rabota \n"+ANSI_RESET);
        }else{
            System.out.println(ANSI_RED+"\nTeu Nanaon cuy "+"."+ANSI_RESET);
            System.out.println(ANSI_CYAN+"Nu Penting Mah Apal Konsepna Jang!! "
                    +ANSI_RESET);
            System.out.println(ANSI_BLACK+"sokhranit'kod rabotayet chuvak "
                    +ANSI_RESET);
            
        }
        
    }
    
}
