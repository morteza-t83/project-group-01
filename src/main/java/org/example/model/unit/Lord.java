package org.example.model.unit;

import org.example.model.Empire;
import org.example.model.User;
import org.example.model.building.Tile;
import org.example.model.unit.enums.MilitaryUnitName;

public class Lord extends MilitaryUnit {
    public Lord(Tile position, Empire empire, MilitaryUnitName militaryUnitName) {
        super(position, empire, militaryUnitName);
    }


//    @Override
//    protected void finalize() throws Throwable {
//
//        //TODO ending game
//    }
}
