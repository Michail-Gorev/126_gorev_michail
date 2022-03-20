package task;

public class Infantryman extends BattleUnitBase {

    public Infantryman(String name, int maxHealth, int baseStrength, int maxArmor) {
        super(name, maxHealth, baseStrength, maxArmor);
    }

    @Override
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam) {
    }

    @Override
    public void attack(BattleUnit other) {
        if (other.armor() > 0) {
            other.takeDamage(strength() / 2);
            other.damageArmor(strength() / 4);
        }
        else {
            other.takeDamage(strength());
        }
    }
}