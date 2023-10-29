package Moves.StatusMove;
import ru.ifmo.se.pokemon.*;

public class ScaryFace extends StatusMove {
    public ScaryFace(double pow, double acc) {
        super(Type.NORMAL, pow, acc );
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.SPEED, -2);
        p.addEffect(e);
    }
    @Override
    public String describe() {
        return "используeт ScaryFace";

    }

}
