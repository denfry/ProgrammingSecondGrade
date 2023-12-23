package lab1_2;

public class Main {
    public static void main(String[] args) {
        int poz = 10; // количество позиций
        IBuildingmaterials[] se = new IBuildingmaterials[poz];
        se[0] = new Paint("краска", "kudo", 10000, 9, 3);
        se[1] = new Paint("краска", "startone", 11000, 1, 4);
        se[2] = new Paint("краска", "marshall", 10000, 3, 5);
        se[3] = new Paint("краска", "sitprof", 23000, 4, 6);
        se[4] = new Paint("краска", "kudo", 3000, 1, 10);
        se[5] = new Paint("краска", "artway", 30000, 8, 15);
        se[6] = new Paint("краска", "artway", 20000, 1, 20);
        se[7] = new Wallpaper("обои", "erismann", 7300, 2, "флизелиновые");
        se[8] = new Wallpaper("обои", "elysium", 71000, 1, "бумажные");
        se[9] = new Wallpaper("обои", "victoria", 10000, 2, "виниловые");

        for (int i = 0; i < poz; i++) {
            System.out.print(i + 1 + ". " + se[i].getDescription()); // вывод всех позиций
        }

        System.out.println("-интерфейс-");
        System.out.println("Самые дорогие товары: ");
        double maxprice = 0;
        int ind = 0;
        for (int i = 0; i < poz; i++) {
            if (se[i] instanceof Paint) {
                if (((Paint) se[i]).getPrice() > maxprice) {
                    maxprice = se[i].getPrice();
                    ind = i;
                }
            }
        }
        System.out.println("в категории красок - " + (ind + 1) + "." + se[ind].getDescription());

        double maxprice2 = 0;
        int ind2 = 0;
        for (int i = 0; i < poz; i++) {
            if (se[i] instanceof Wallpaper) {
                if (((Wallpaper) se[i]).getPrice() > maxprice2) {
                    maxprice2 = se[i].getPrice();
                    ind2 = i;
                }
            }
        }
        System.out.println("в категории обоев - " + (ind2 + 1) + "." + se[ind2].getDescription());

        System.out.println("Виниловые обои:");
        for (int i = 0; i < poz; i++) {
            if (se[i] instanceof Wallpaper) {
                if ("виниловые".equals(((Wallpaper) se[i]).getKind())) {
                    System.out.println(i + 1 + "." + se[i].getDescription());
                }
            }
        }
    }
}
