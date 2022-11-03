package factory;

public class Bow implements Equipment {
    @Override
    public void manufacture() {
        System.out.println("Лук изготовлен ...");
    }

    @Override
    public void prepareToUse() {
        System.out.println("Тетива лука натянута.Лук готов к бою ...");
    }
}
