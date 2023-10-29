package Pokemons;

import Moves.PhysicalMove.Bite;
import Moves.PhysicalMove.DoubleHit;
import Moves.StatusMove.ScaryFace;
import Moves.StatusMove.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Hydreigon extends Pokemon {
    public Hydreigon(String name ,int level ) {
        super(name, level);
        super.setStats(92,105,90,125,90,98);
        super.setType(Type.DARK , Type.DRAGON);
        Bite Bite = new Bite(60,100);
        ThunderWave ThunderWave = new ThunderWave(0,90);
        DoubleHit DoubleHit = new DoubleHit(35,90);
        ScaryFace ScaryFace = new ScaryFace(0,100);
        setMove(Bite, ThunderWave, DoubleHit,ScaryFace);
    }
}
