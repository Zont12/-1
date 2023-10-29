package Moves.PhysicalMove;
import ru.ifmo.se.pokemon.*;

public class Bite extends PhysicalMove {
    public Bite(double pow, double acc) {
        super(Type.DARK, pow, acc );
    }
    private boolean flag = false ;
    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        super.applyOppDamage(p,damage);
        if (Math.random() <= 0.3) {
            flag = true;
            Effect.flinch(p);

        }
    }
    @Override
    public String describe() {
        return "используeт атаку Bite";

    }

}
