package flower_store;

import java.util.List;
import java.util.Scanner;

public class Store {

    private List<FlowerBucket> storage;
    private List<String> storage_labels;
    private List<Flower> storage_flowers;

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FlowerPack fP1 = new FlowerPack(new Chamomile(), 32);
        FlowerPack fp2 = new FlowerPack(new Rose(), 7);
        FlowerBucket bouq1 = new FlowerBucket();
        bouq1.add(fP1);
        bouq1.add(fp2);
        FlowerPack fp3 = new FlowerPack(new Tulip(), 11);
        FlowerBucket bouq2 = new FlowerBucket();
        bouq2.add(fp3);
        FlowerPack fP4 = new FlowerPack(new Rose(), 1);
        FlowerBucket bouq3 = new FlowerBucket();
        bouq3.add(fP4);
        Store myStore = new Store();
        myStore.addBuket(bouq1);
        myStore.addBuket(bouq2);
        myStore.addBuket(bouq3);

    }

    private void addBuket(FlowerBucket bouquet) {
        storage.add(bouquet);
        if (!storage_labels.contains(bouquet.getLabel())) {
            storage_labels.add(bouquet.getLabel());
        }
        for (Flower flower: bouquet.getFlowers()) {
            if (!storage_flowers.contains(flower))
            storage_flowers.add(flower);
        }
    }

    public void search() {
        System.out.println("Вас вітає флористичний магазин \"Бу́кет\"");
            if (!storage.isEmpty()) {
                System.out.println("Сьогодні серед опцій знаходяться такі категорії:");
                storage_labels.forEach(System.out::print);
                System.out.println("То що паноньки бажають? (Введіть цифру)");
                String labl = scanner.next();
                boolean guess = true;
                while (guess) {
                    if ("123".contains(labl)) {
                        for (int i = 0; i < storage_labels.size(); i++) {
                            if (!storage_labels.get(i).contains(labl)) {
                                if (i == storage_labels.size() - 1) {
                                    System.out.println("Ви точно щось попутали. Спробуйте знову: ");
                                    break;
                                }
                            }
                            else {
                                System.out.println("Сьогодні вам пощастило. Ви можете вибрати серед:");
                                int n = 1;
                                for (FlowerBucket bouquet : storage) {

                                    if (bouquet.getLabel().contains(labl))
                                        System.out.println(n + ". " + bouquet);
                                }
                                int buk = Integer.valueOf(scanner.next());
                                while ( buk > 0 && buk < n) {
                                    System.out.println("Супер! Вітаю з вибором! Оплатіть будь ласка на карту");
                                    System.out.println("0992456355899877");
                                    System.out.println("Дякую, бувай");
                            }
                        }
                    }
                        guess = false;
                        break;
                    }
                    System.out.println("Знову це. Ви не чітко прочитали умову. Try again");
                }
            }
            else { System.out.println("Схоже вам не пощастило, ми вже зачиняємося, побачимося завтра!"); }
    }
}
