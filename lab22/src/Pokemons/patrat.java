package Pokemons;

import Moves.PhysicalMove.Crunch;
import Moves.StatusMove.NastyPlot;
import Moves.StatusMove.SandAttack;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class patrat extends Pokemon {
    public patrat(String name , int level) {
        super(name,level);
        super.setStats(45,55,39,35, 39,42);
        super.setType(Type.NORMAL);
        Crunch  Crunch = new Crunch(80,100);
        SandAttack SandAttack = new SandAttack(0,100);
        NastyPlot NastyPlot = new NastyPlot(0,0);
        setMove(Crunch,SandAttack,NastyPlot);
    }
}
