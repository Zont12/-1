package Pokemons;

import Moves.PhysicalMove.Bite;
import Moves.PhysicalMove.DoubleHit;
import Moves.StatusMove.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Zweilous extends Pokemon {
    public Zweilous(String name ,int level ) {
        super(name, level);
        super.setStats(72,85,70,65,70,58);
        super.setType(Type.DARK , Type.DRAGON);
        Bite Bite = new Bite(60,100);
        ThunderWave ThunderWave = new ThunderWave(0,90);
        DoubleHit DoubleHit = new DoubleHit(35,90);
        setMove(Bite, ThunderWave, DoubleHit);
    }
}
