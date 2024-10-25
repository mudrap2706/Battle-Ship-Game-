/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battle_ship_game;

/**
 *
 * @author mudra
 */
public class Round {
    private Player currentPlayer;

    public Round(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public void playRound() {
        System.out.println(currentPlayer.getName() + " is playing this round.");
    }
}
