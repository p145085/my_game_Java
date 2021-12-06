package org.Populus.my;
import java.util.Scanner;
import org.Populus.my.Game;

public class ConsoleMenu {
    Scanner scanner = new Scanner(System.in);
    String menuSelection = scanner.next();
    switch (menuSelection){
        case "player_info":
            //System.out.println(player1.playerInfo());
        default:
            System.out.println("Default.");
    }
}
