package Moves.StatusMove;
import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {
    public ThunderWave(double pow, double acc) {
        super(Type.ELECTRIC, pow, acc );
    }
    private boolean flag;
    @Override
    protected void applyOppEffects(Pokemon p ) {
        Effect e = new Effect().condition(Status.PARALYZE);
        p.addEffect(e);
        Effect k = new Effect();
        k.attack(0.25);
        k.stat(Stat.SPEED, (int)p.getStat(Stat.SPEED) / 2);
        p.addEffect(k);

    }

    public String describe() {
        return "используeт Thunder Wave";

    }

}
