package FirmaPozice;

public class Tester extends Zamestnanec{
    private int pocetChyb = 0;

    public Tester(int pocetChyb, String jmeno, String prijmeni, String pozice, int plat){
        super(jmeno, prijmeni, pozice, plat);
    }

    public int naselJsemNovouChybu(){
        pocetChyb++;
        return pocetChyb;
    }

    @Override
    public void vypisInfo(){
        super.vypisInfo();
        System.out.println("Počet chyb: " + pocetChyb);
    }


    public int getPocetChyb() {
        return pocetChyb;
    }
}
