package Moves.StatusMove;
import ru.ifmo.se.pokemon.*;

public class SwordsDance extends StatusMove {
    public SwordsDance(double pow, double acc) {
        super(Type.GROUND, pow, acc );
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.ATTACK, +2);
        p.addEffect(e);
    }
    @Override
    public String describe() {
        return "используeт Swords Dance";

    }

}
