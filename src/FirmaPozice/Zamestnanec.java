package FirmaPozice;

public class Zamestnanec {
    private String jmeno;
    private String prijmeni;
    private String pozice;
    private int plat;

    public Zamestnanec(String jmeno, String prijmeni, String pozice, int plat) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.pozice = pozice;
        this.plat = plat;
    }

    public void vypisInfo(){
        System.out.println("Jmeno: " + jmeno);
        System.out.println("Prijmeni: " + prijmeni);
        System.out.println("Pozice: " + pozice);
        System.out.println("Plat: " + plat);
    }

    public String getJmeno() {
        return jmeno;
    }
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    public String getPrijmeni() {
        return prijmeni;
    }
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }
    public String getPozice() {
        return pozice;
    }
    public void setPozice(String pozice) {
        this.pozice = pozice;
    }
    public int getPlat() {
        return plat;
    }
    public void setPlat(int plat) {
        this.plat = plat;
    }
}
