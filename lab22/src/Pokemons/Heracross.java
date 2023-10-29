package Pokemons;

import Moves.PhysicalMove.HornAttack;
import Moves.PhysicalMove.Megahorn;
import Moves.PhysicalMove.StoneEdge;
import Moves.StatusMove.SwordsDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Heracross extends Pokemon {
    public Heracross(String name, int level) {
        super(name, level);
        super.setStats(80,125,75,40,95,85);
        super.setType(Type.BUG , Type.FIGHTING);
        Megahorn Megahorn = new Megahorn(120,85);
        HornAttack HornAttack = new HornAttack(65,100);
        SwordsDance SwordsDance = new SwordsDance(0,0);
        StoneEdge StoneEdge = new StoneEdge(100,80);
        setMove(Megahorn, HornAttack, SwordsDance, StoneEdge);

    }
}
