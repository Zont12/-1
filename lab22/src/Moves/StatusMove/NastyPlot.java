package Moves.StatusMove;
import ru.ifmo.se.pokemon.*;

public class NastyPlot extends StatusMove {
    public NastyPlot(double pow, double acc) {
        super(Type.DARK, pow, acc );
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, +2);
        p.addEffect(e);
    }
    @Override
    public String describe() {
        return "используeт Nasty Plot ";

    }

}
