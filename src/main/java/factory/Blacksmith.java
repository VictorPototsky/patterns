package factory;

public interface Blacksmith {

    // Кузнецы куют (луки не в счет :))! КУЙ С НИМИ!!!
    default Equipment createEquipment(EquipmentType type) {
        return null;
    }
}
