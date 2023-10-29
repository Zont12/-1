package Moves.PhysicalMove;
import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    public StoneEdge(double pow, double acc) {
        super(Type.ROCK, pow, acc );
    }
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return 3.0 * super.calcCriticalHit(att, def);
    }
    @Override
    public String describe() {
        return "используeт атаку Stone Edge";

    }

}
