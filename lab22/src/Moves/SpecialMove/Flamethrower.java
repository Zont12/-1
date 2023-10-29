package Moves.SpecialMove;

import ru.ifmo.se.pokemon.*;

public class Flamethrower extends SpecialMove {
    public Flamethrower(double pow, double acc ) {
        super(Type.FIRE , pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.1).condition(Status.BURN);
        p.addEffect(e);
    }
    @Override
    public String describe() {
        return "используeт Flamethrower  ";

    }
}
