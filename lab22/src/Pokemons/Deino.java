package Pokemons;

import Moves.PhysicalMove.Bite;
import Moves.StatusMove.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Deino extends Pokemon {
    public Deino(String name ,int level ) {
        super(name, level);
        super.setStats(52,65,50,45,50,38);
        super.setType(Type.DARK , Type.DRAGON);
        Bite Bite = new Bite(60,100);
        ThunderWave ThunderWave = new ThunderWave(0,90);
        setMove(Bite, ThunderWave);
    }
}
