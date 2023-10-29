package Moves.PhysicalMove;
import ru.ifmo.se.pokemon.*;

public class HornAttack extends PhysicalMove {
    public HornAttack(double pow, double acc) {
        super(Type.NORMAL, pow, acc );
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        super.applyOppDamage(p,damage);
    }
    @Override
    public String describe() {
        return "используeт атаку HornAttack";

    }

}
