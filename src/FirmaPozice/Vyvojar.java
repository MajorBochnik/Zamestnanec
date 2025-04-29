package FirmaPozice;

import java.util.ArrayList;
import java.util.Scanner;


public class Vyvojar extends Zamestnanec {
    static Scanner sc = new Scanner(System.in);
    ArrayList <String> programovaciJazyky = new ArrayList <>();

    public Vyvojar(String jmeno, String prijmeni, String pozice, int plat) {
        super(jmeno, prijmeni, pozice, plat);
        System.out.println("Kolik zná programovacích jazyků?");
        int pocetJ = sc.nextInt();
        sc.nextLine();

        if (pocetJ >= 1) {
            for (int i = 0; i < pocetJ; i++) {
                System.out.println("Jaký zná jazyk?");
                programovaciJazyky.add(sc.nextLine());
            }
        } else {
            System.out.println("NOPE");
        }
    }

        public void vypisInfo(){
            super.vypisInfo();
            for(int i = 0; i < programovaciJazyky.size(); i++){
                System.out.println(programovaciJazyky.get(i));
            }
        }

    public int getPocetJazyku() {
        return programovaciJazyky.size();
    }
}


