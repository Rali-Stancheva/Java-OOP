package OOP.EXERSICE_REFLECTION.P3_4_barracksWars.models.units;

public class Gunner extends AbstractUnit{
    private static final int HORSEMAN_HEALTH = 20;
    private static final int HORSEMAN_DAMAGE = 20;

    protected Gunner() {
        super(HORSEMAN_HEALTH, HORSEMAN_DAMAGE);
    }
}
