package factory;

import static factory.HeroType.ARCHER;

public class Archer implements Hero{
    public Archer() {
        System.out.println("В полку лучников прибыло");
    }

    @Override
    public void doAction(int action, HeroType enemy) {

    }
    @Override
    public void buyEquipment(EquipmentType type) {
        System.out.println("Лучник покупает " + type);
        Store store  = Store.getInstance();
        store.orderEquipment(HeroType.ARCHER,EquipmentType.BOW);
    }
}
