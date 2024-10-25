/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battle_ship_game;

/**
 *
 * @author mudra
 */
import java.util.ArrayList;

public class Player {
    private String name;
    private int torpedoes = 45;
    private ArrayList<Ship> ships = new ArrayList<>();
    private ArrayList<Torpedo> firedTorpedoes = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void throwTorpedo(int x, int y) {
        if (torpedoes > 0) {
            Torpedo torpedo = new Torpedo(x, y);
            firedTorpedoes.add(torpedo);
            torpedoes--;
            System.out.println(name + " threw a torpedo at (" + x + ", " + y + ")");
        } else {
            System.out.println(name + " has no more torpedoes.");
        }
    }

    public void addShip(Ship ship) {
        if (ships.size() < 6) {
            ships.add(ship);
        } else {
            System.out.println("Cannot add more than 6 ships.");
        }
    }

    public void listShips() {
        for (Ship ship : ships) {
            System.out.println("Ship size: " + ship.getSize());
        }
    }
}

