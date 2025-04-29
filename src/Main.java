import FirmaPozice.Manager;
import FirmaPozice.Tester;
import FirmaPozice.Vyvojar;
import FirmaPozice.Zamestnanec;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Zamestnanec> zamestnanci = new ArrayList <>();

        Zamestnanec zamestnanec = new Zamestnanec("David", "Šmíd", "Vedoucí", 100000);
        zamestnanec.vypisInfo();
        System.out.println();

        Manager manager = new Manager(5, "Karel", "Hynek", "Manager", 50000);
        manager.vypisInfo();
        System.out.println();

        Vyvojar vyvojar = new Vyvojar("Gargamel", "Modrý", "Vyvojář", 1000);
        vyvojar.vypisInfo();
        System.out.println();

        Tester tester = new Tester(0,"Pavel", "Zemák","Tester",20000);
        tester.vypisInfo();
        System.out.println();
        for (int i = 0; i < 20; i++){
            tester.naselJsemNovouChybu();
        }
        tester.vypisInfo();
        System.out.println();

        boolean cyklus = true;
        while(cyklus) {
            System.out.println("Chceš přidat nějakého zaměstnance?(Ano/Ne)");
            String rozhodnuti = sc.nextLine().toLowerCase();
            if (rozhodnuti.equals("ano")) {
                System.out.println("Jakého zaměstnance chceš přidat? (Tester/Manager/Vyvojar)");
                String rozhodnuti2 = sc.nextLine().toLowerCase();
                switch (rozhodnuti2) {
                    case "tester":
                        System.out.println("Počet chyb?");
                        int pocet = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Jak se jmenuje?");
                        String jmeno = sc.nextLine();
                        System.out.println("Jaké má příjmení?");
                        String prijmeni = sc.nextLine();
                        System.out.println("Jakou má pozici?");
                        String pozice = sc.nextLine();
                        System.out.println("Jaký má plat?");
                        int plat = sc.nextInt();
                        sc.nextLine();
                        zamestnanci.add(new Tester(pocet, jmeno, prijmeni, pozice, plat));
                        break;

                    case "manager":
                        System.out.println("Počet zaměstnanců?");
                        int pocetZamestnancu = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Jak se jmenuje?");
                        String jmenoManager = sc.nextLine();
                        System.out.println("Jaké má příjmení?");
                        String prijmeniManager = sc.nextLine();
                        System.out.println("Jakou má pozici?");
                        String poziceManager = sc.nextLine();
                        System.out.println("Jaký má plat?");
                        int platManager = sc.nextInt();
                        sc.nextLine();
                        zamestnanci.add(new Manager(pocetZamestnancu, jmenoManager, prijmeniManager, poziceManager, platManager));
                        break;

                    case "vyvojar":
                        System.out.println("Jak se jmenuje?");
                        String jmenoVyvojar = sc.nextLine();
                        System.out.println("Jaké má příjmení?");
                        String prijmeniVyvojar = sc.nextLine();
                        System.out.println("Jakou má pozici?");
                        String poziceVyvojar = sc.nextLine();
                        System.out.println("Jaký má plat?");
                        int platVyvojar = sc.nextInt();
                        sc.nextLine();
                        zamestnanci.add(new Vyvojar(jmenoVyvojar, prijmeniVyvojar, poziceVyvojar, platVyvojar));
                        break;

                    default:
                        break;
                }

            } else {
                cyklus = false;
            }
        }

            boolean menu = true;
            while (menu){
                System.out.println("1 --> Počet manažerů");
                System.out.println("2 --> Počet všech zaměstnanců");
                System.out.println("3 --> Testera, který nalezl nejvíce chyb");
                System.out.println("4 --> Vývojáře ovládající největší množství jazyků");
                System.out.println("5 --> Zaměstnance s nejnižším platem");
                System.out.println("6 --> KONEC");
                System.out.println("Jakou akci chceš provést?");
                int decision = sc.nextInt();
                sc.nextLine();

                switch (decision){
                    case 1:
                        int pocetManazeru = 0;
                        for (int i = 0; i < zamestnanci.size(); i++){
                            if (zamestnanci.get(i) instanceof Manager){
                                pocetManazeru++;
                            }
                        }
                        System.out.println("Počet manažerů je: "+pocetManazeru);
                        break;

                    case 2:
                            System.out.println("Počet zaměstnanců je: "+zamestnanci.size());
                        break;

                    case 3:
                            int nejvicChyb = Integer.MIN_VALUE;
                            int index = 0;
                            for (int i = 0; i < zamestnanci.size(); i++){
                                if (zamestnanci.get(i) instanceof Tester){
                                    if (((Tester)zamestnanci.get(i)).getPocetChyb() > nejvicChyb){
                                        nejvicChyb = ((Tester)zamestnanci.get(i)).getPocetChyb();
                                        index = i;
                                    }
                                }
                            }
                            System.out.println("Nejvíc chyb: "+nejvicChyb+", našel: "+zamestnanci.get(index).getJmeno()+" "+zamestnanci.get(index).getPrijmeni());
                        break;

                    case 4:
                            int nejvicJazyku = Integer.MIN_VALUE;
                            int indexJazyku = 0;
                            for (int i = 0; i < zamestnanci.size(); i++){
                                if (zamestnanci.get(i) instanceof Vyvojar){
                                    if (((Vyvojar)zamestnanci.get(i)).getPocetJazyku() > nejvicJazyku){
                                        nejvicJazyku = ((Vyvojar)zamestnanci.get(i)).getPocetJazyku();
                                        indexJazyku = i;
                                    }
                                }
                            }
                            System.out.println("Nejvíc jazyků: "+nejvicJazyku+", umí: "+zamestnanci.get(indexJazyku).getJmeno()+" "+zamestnanci.get(indexJazyku).getPrijmeni());
                        break;

                    case 5:
                        int malyPlat = Integer.MAX_VALUE;
                        int indexPlatu = 0;
                        for (int i = 0; i < zamestnanci.size(); i++){
                            if(zamestnanci.get(i).getPlat() < malyPlat){
                                malyPlat = zamestnanci.get(i).getPlat();
                                indexPlatu = i;
                            }
                        }
                        System.out.println("Nejnižší plat: "+malyPlat+" má zaměstnanec: "+zamestnanci.get(indexPlatu).getJmeno());
                        break;

                    case 6:
                        menu = false;
                        break;

                    default:
                        System.out.println("Jsi úplné banán?");
                        break;
                }
            }



    }
}