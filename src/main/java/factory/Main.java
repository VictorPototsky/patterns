package factory;

import static factory.HeroType.ARCHER;
import static factory.HeroType.DWARF;

public class Main {

    public static void main(String[] args) {
        HeroFactory army = new HeroFactory();
        Hero knight = army.createHero(HeroType.KNIGHT);
        Hero archer = army.createHero(ARCHER);

        knight.buyEquipment(EquipmentType.SWORD);
        archer.buyEquipment(EquipmentType.BOW);

        knight.doAction(1, DWARF);
    }
}
