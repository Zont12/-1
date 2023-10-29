package Moves.StatusMove;
import ru.ifmo.se.pokemon.*;

public class SandAttack extends StatusMove {
    public SandAttack(double pow, double acc) {
        super(Type.GROUND, pow, acc );
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.ACCURACY, -1);
        p.addEffect(e);
    }

    @Override
    public String describe() {
        return "используeт Sand Attack";

    }

}
