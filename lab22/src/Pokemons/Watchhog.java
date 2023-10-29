package Pokemons;
import Moves.PhysicalMove.Crunch;
import Moves.SpecialMove.Flamethrower;
import Moves.StatusMove.NastyPlot;
import Moves.StatusMove.SandAttack;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Watchhog extends Pokemon {
    public Watchhog(String name , int level) {
        super(name,level);
        super.setStats(60,85,69,60,69,77);
        super.setType(Type.NORMAL);
        Crunch Crunch = new Crunch(80,100);
        SandAttack SandAttack = new SandAttack(0,100);
        NastyPlot NastyPlot = new NastyPlot(0,0);
        Flamethrower FlameThrower = new Flamethrower(80,100);
        setMove(Crunch,SandAttack,NastyPlot);
    }
}
