package Moves.PhysicalMove;
import ru.ifmo.se.pokemon.*;

public class DoubleHit extends PhysicalMove {

    public DoubleHit(double power, double acc) {
        super(Type.NORMAL, power, acc);
    }



    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return super.calcCriticalHit(att, def);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);
        super.applyOppDamage(def, damage);
    }

    @Override
    protected String describe() {
        return "использует Double Hit";
    }

}