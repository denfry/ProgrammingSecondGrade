package lab1_2;

public class Main {
    public static void main(String[] args) {
        int poz = 10; // количество позиций
        Buildingmaterials[] se = new Buildingmaterials[poz];
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
            System.out.print(i + 1 + ". " + se[i].toString()); // вывод всех позиций
        }
        System.out.println("-абстрактный класс-");
        System.out.println("Самые дорогие товары: ");
        double maxPrice = 0;
        int maxPriceIndex = 0;
        for (int i = 0; i < poz; i++) {
            if (se[i] instanceof Paint) {
                if (se[i].getPrice() > maxPrice) {
                    maxPrice = se[i].getPrice();
                    maxPriceIndex = i;
                }
            }
        }
        System.out.println("в категории красок - " + (maxPriceIndex + 1) + ". " + se[maxPriceIndex].toString());

        double maxPrice2 = 0;
        int maxPriceIndex2 = 0;
        for (int i = 0; i < poz; i++) {
            if (se[i] instanceof Wallpaper) {
                if (se[i].getPrice() > maxPrice2) {
                    maxPrice2 = se[i].getPrice();
                    maxPriceIndex2 = i;
                }
            }
        }
        System.out.println("в категории обоев - " + (maxPriceIndex2 + 1) + ". " + se[maxPriceIndex2].toString());

        System.out.println("Виниловые обои:");
        boolean found = false;
        for (int i = 0; i < poz; i++) {
            if (se[i] instanceof Wallpaper) {
                if (((Wallpaper) se[i]).getKind().equals("виниловые")) {
                    System.out.println(i + 1 + ". " + se[i].toString());
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Нет подходящих обоев.");
        }
    }
}
