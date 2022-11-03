package factory;

// Магаз сделаем Singleton'ом

public class Store implements Blacksmith {
    private static  Store instance;
    private Store() {
    }
public static Store getInstance() {
    if (instance == null) {
       instance = new Store();
    }
    return instance;
}
    public Equipment orderEquipment(HeroType type, EquipmentType kind) {
       // Можно добавить блок проверка доступности покупки снаряжения героем в зависимости от типа героя type. Рыцарь не может купить лук ...
        switch (type) {
            case KNIGHT :
                System.out.println("Обработка доступности покупки данного вида снаряжения для рыцаря");
          /*
          и т.д.
          */

        }
       Equipment equipment = createEquipment(kind);
        equipment.manufacture();
        equipment.prepareToUse();
        System.out.println("Сделка завершена");
       return equipment;

    }

    @Override
    public Equipment createEquipment(EquipmentType type) {
        Equipment item = switch (type) {
            case SWORD -> new Sword();
            case BOW -> new Bow();
            default -> null;
        };
        return item;
    }
}
