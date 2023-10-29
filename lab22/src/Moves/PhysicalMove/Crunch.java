package Moves.PhysicalMove;
import ru.ifmo.se.pokemon.*;

public class Crunch extends PhysicalMove {
    public Crunch(double pow, double acc) {
        super(Type.DARK, pow, acc );
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        super.applyOppDamage(p,damage);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.2).stat(Stat.DEFENSE, -1);
        p.addEffect(e);
    }

    @Override
    public String describe() {
        return "используeт атаку Crunch";

    }

}
