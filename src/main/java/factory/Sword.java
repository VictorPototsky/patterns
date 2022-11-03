package factory;

public class Sword implements Equipment {
    @Override
    public void manufacture() {
        System.out.println("Меч выкован ...");
    }

    @Override
    public void prepareToUse() {
        System.out.println("Меч заточен и готов к бою...");

    }
}
