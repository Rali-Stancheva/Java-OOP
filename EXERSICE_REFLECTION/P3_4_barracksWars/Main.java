package OOP.EXERSICE_REFLECTION.P3_4_barracksWars;

import OOP.EXERSICE_REFLECTION.P3_4_barracksWars.interfaces.Repository;
import OOP.EXERSICE_REFLECTION.P3_4_barracksWars.interfaces.Runnable;
import OOP.EXERSICE_REFLECTION.P3_4_barracksWars.interfaces.UnitFactory;
import OOP.EXERSICE_REFLECTION.P3_4_barracksWars.core.Engine;
import OOP.EXERSICE_REFLECTION.P3_4_barracksWars.core.factories.UnitFactoryImpl;
import OOP.EXERSICE_REFLECTION.P3_4_barracksWars.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
