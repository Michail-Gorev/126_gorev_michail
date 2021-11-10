package task;

public enum Race {
    Orc(6, 12, 2),
    Elf(2, 9, 9),
    Dwarf(6, 10, 4),
    Halfling(1, 8, 11),
    Human(6, 7, 7);

    private int strength;
    private int hp;
    private int dexterity;

    Race(int strength, int hp, int dexterity) {
        this.strength = strength;
        this.hp = hp;
        this.dexterity = dexterity;
    }

    public int strength() {
        return strength;
    }

    public int health() {
        return hp;
    }

    public int dexterity() {
        return dexterity;
    }
}
