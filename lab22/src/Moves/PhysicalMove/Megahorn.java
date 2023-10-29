package Moves.PhysicalMove;
import ru.ifmo.se.pokemon.*;

public class Megahorn extends PhysicalMove {
    public Megahorn(double pow, double acc) {
        super(Type.BUG, pow, acc );
    }
    @Override
    public String describe() {
        return "используeт атаку Megahorn";

    }

}
