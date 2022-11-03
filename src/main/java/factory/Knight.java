package factory;



public class Knight implements Hero{

    public Knight() {
       System.out.println("Очередной рыцарь вступил в войско");
    }

    @Override
    public void doAction(int action, HeroType enemy) {
        String str = "";
        String enemyName = " Противник " + enemy;

        switch (action) {
            case 0 -> str = "бездействует ...";
            case 1 -> str = "атакует ..." + enemyName;
            case 2 -> str = "защищается ..." + enemyName;
        }
        System.out.print(" Рыцарь " + str);

    }

    @Override
    public void buyEquipment(EquipmentType type) {
        System.out.println("Рыцарь покупает " + type);
        Store store  = Store.getInstance();
        store.orderEquipment(HeroType.KNIGHT,EquipmentType.SWORD);

    }
}
