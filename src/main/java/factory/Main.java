package factory;

import static factory.HeroType.ARCHER;
import static factory.HeroType.DWARF;

public class Main {

    public static void main(String[] args) {
        HeroFactory army = new HeroFactory();
        Hero knight = army.createHero(HeroType.KNIGHT);
        Hero archer = army.createHero(ARCHER);
        Store store  = Store.getInstance();

        knight.buyEquipment(EquipmentType.SWORD);
        store.orderEquipment(HeroType.KNIGHT,EquipmentType.SWORD);

        knight.doAction(1, DWARF);
    }
}
