package day03;

public class SchoolEquipment {

    private int quantity;
    private String equipmentName;
    private String getEquipmentType;

    public SchoolEquipment(int quantity, String equipmentName, String getEquipmentType) {
        this.quantity = quantity;
        this.equipmentName = equipmentName;
        this.getEquipmentType = getEquipmentType;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public String getGetEquipmentType() {
        return getEquipmentType;
    }
}
