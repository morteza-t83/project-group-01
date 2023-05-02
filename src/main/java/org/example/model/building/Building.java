package org.example.model.building;

import org.example.model.Empire;
import org.example.model.building.enums.BuildingName;

public class Building {
    protected Empire empire;
    protected int beginX;
    protected int endX;
    protected int beginY;
    protected int endY;
    private final BuildingName buildingName;

    public Building (Empire empire, int x1, int x2, int y1, int y2, BuildingName buildingName) {
        this.empire = empire;
        this.beginX = x1;
        this.endX = x2;
        this.beginY = y1;
        this.endY = y2;
        this.buildingName = buildingName;
    }

    public BuildingName getBuildingName() {
        return buildingName;
    }

    public int getBeginX() {
        return beginX;
    }

    public int getEndX() {
        return endX;
    }

    public int getBeginY() {
        return beginY;
    }

    public int getEndY() {
        return endY;
    }

    public Empire getEmpire() {
        return empire;
    }
}
