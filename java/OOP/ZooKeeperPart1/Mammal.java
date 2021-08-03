package OOP.ZooKeeperPart1;

public class Mammal {
    protected int energyLevel = 100;

    public int displayEnergyLevel() {
        return this.energyLevel;
    }

    // GETTER
    public int getEnergyLevel() {
        return this.energyLevel;
    }

    // SETTER
    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
}