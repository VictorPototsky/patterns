package factory;

// Фабрика по созданию воинов!!!

public class HeroFactory {
    public Hero createHero(HeroType type){
        Hero hero = switch (type) {
            case KNIGHT -> new Knight();
            case ARCHER -> new Archer();
            default -> null;
        };


        return hero;
    }

}
