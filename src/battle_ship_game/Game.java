/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battle_ship_game;

import java.util.ArrayList;
import java.util.Date;

public class Game {
    private Date startTime;
    private Date endTime;
    private String gameType; // "Human vs Computer" or "Human vs Human"
    private ArrayList<Player> players = new ArrayList<>();
    private ArrayList<Round> rounds = new ArrayList<>();

    public Game(String gameType) {
        this.gameType = gameType;
        this.startTime = new Date();
    }

    public void start() {
        System.out.println("Game started");
    }

    public void end() {
        this.endTime = new Date();
        System.out.println("Game ended");
    }

    public void addPlayer(Player player) {
        if (players.size() < 2) {
            players.add(player);
        } else {
            System.out.println("Cannot add more than 2 players.");
        }
    }

    public void listPlayers() {
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }
}
