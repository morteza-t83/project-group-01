package org.example.view.mainMenu.gameMenu;

import org.example.controller.mainMenuController.gameMenuController.CreateMapMenuController;
import org.example.model.Map;
import org.example.view.enums.Outputs;
import org.example.view.enums.commands.GameMenuCommands.CreateMapMenuCommands;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;

public class CreateMapMenu {

    public static Map gameMap;
    public Map run(Scanner scanner) {
        setGameMapSize(scanner);
        while (true) {
            String command = scanner.nextLine();
            Matcher matcher;
            if ((matcher = CreateMapMenuCommands.getMatcher
                    (command, CreateMapMenuCommands.SET_TEXTURE_FOR_A_TILE)) != null)
                setTextureForATileChecker(matcher);
            else if ((matcher = CreateMapMenuCommands.getMatcher
                    (command, CreateMapMenuCommands.SET_TEXTURE_FOR_A_RECTANGLE)) != null)
                setTextureForARectangleChecker(matcher);
            else if ((matcher = CreateMapMenuCommands.getMatcher(command, CreateMapMenuCommands.CLEAR)) != null)
                clearChecker(matcher);
            else if ((matcher = CreateMapMenuCommands.getMatcher(command, CreateMapMenuCommands.DROP_ROCK)) != null)
                dropRockChecker(matcher);
            else if ((matcher = CreateMapMenuCommands.getMatcher(command, CreateMapMenuCommands.DROP_TREE)) != null)
                dropTreeChecker(matcher);
            else if ((matcher = CreateMapMenuCommands.getMatcher(command, CreateMapMenuCommands.DROP_BUILDING)) != null)
                dropBuildingChecker(matcher);
            else if ((matcher = CreateMapMenuCommands.getMatcher(command, CreateMapMenuCommands.DROP_UNIT)) != null)
                dropUnitChecker(matcher);
            else if (command.equals("finish")) return gameMap;
            else System.out.println("invalid command!");
        }
    }

    public void setGameMapSize(Scanner scanner){
        while (true){
            System.out.println("please enter size for map\n" +
                    "1. 200 * 200\n" +
                    "2. 400 * 400");
            switch (scanner.nextLine()){
                case "1":
                    gameMap = new Map(200);
                    System.out.println("Size of map is 200 * 200");
                    return;
                case "2":
                    gameMap = new Map(400);
                    System.out.println("Size of map is 400 * 400");
                    return;
                default:
                    System.out.println("Invalid size");
            }
        }
    }

    public void setTextureForATileChecker(Matcher matcher) {
        int xOfMap = Integer.parseInt(matcher.group("xOfMap"));
        int yOfMap = Integer.parseInt(matcher.group("yOfMap"));
        String type = matcher.group("type");
        Outputs outputs = new CreateMapMenuController().setTextureForATile
                (gameMap.getTileWhitXAndY(xOfMap,yOfMap), type);
        System.out.println(outputs.toString());
    }

    public void setTextureForARectangleChecker(Matcher matcher) {
        int x1OfMap = Integer.parseInt(matcher.group("x1OfMap"));
        int y1OfMap = Integer.parseInt(matcher.group("y1OfMap"));
        int x2OfMap = Integer.parseInt(matcher.group("x2OfMap"));
        int y2OfMap = Integer.parseInt(matcher.group("y2OfMap"));
        String type = matcher.group("type");
        Outputs outputs = new CreateMapMenuController().setTextureForARectangle
                (x1OfMap, y1OfMap, x2OfMap, y2OfMap, type);
        System.out.println(outputs.toString());
    }

    public void clearChecker(Matcher matcher) {

    }

    public void dropRockChecker(Matcher matcher) {

    }

    public void dropTreeChecker(Matcher matcher) {

    }

    public void dropBuildingChecker(Matcher matcher) {

    }

    public void dropUnitChecker(Matcher matcher) {

    }

}
