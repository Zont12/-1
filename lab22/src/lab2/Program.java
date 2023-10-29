package lab2;

import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Program {
// https://pokemondb.net/pokedex/heracross
// https://pokemondb.net/pokedex/patrat
// https://pokemondb.net/pokedex/watchog
// https://pokemondb.net/pokedex/deino
// https://pokemondb.net/pokedex/zweilous
// https://pokemondb.net/pokedex/hydreigon

    public static void main(String[] args) {
        Battle b = new Battle();
        Heracross p1 = new Heracross("apple", 1);
        patrat p2 = new patrat("orange", 1);
        Watchhog p3 = new Watchhog("qiwi", 1);
        Deino p4 = new Deino("banan",1);
        Zweilous p5 = new Zweilous("grape",1);
        Hydreigon p6 = new Hydreigon("peach",1);


        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();

    }

}