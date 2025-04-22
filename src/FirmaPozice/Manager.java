package FirmaPozice;

public class Manager extends Zamestnanec {
    private int pocet;

    public Manager(int pocet, String jmeno, String prijmeni, String pozice, int plat) {
        super(jmeno, prijmeni, pozice, plat);
        this.pocet = pocet;
    }

    public void vypisInfo(){
        System.out.println("Jmeno: " + getJmeno());
        System.out.println("Prijmeni: " + getPrijmeni());
        System.out.println("Pozice: " + getPozice());
        System.out.println("Plat: " + getPlat());
        System.out.println("Počet řízených zaměstnanců: " + pocet);
    }

    public int getPocet() {
        return pocet;
    }
    public void setPocet(int pocet) {
        this.pocet = pocet;
    }
}
