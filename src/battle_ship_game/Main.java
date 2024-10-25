/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battle_ship_game;

/**
 *
 * @author mudra
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game("Human vs Computer");

        HumanPlayer player1 = new HumanPlayer("Mudra");
        ComputerPlayer player2 = new ComputerPlayer();

        game.addPlayer(player1);
        game.addPlayer(player2);

        // Create ships
        Ship ship1 = new Ship(3, 5);
        player1.addShip(ship1);

        // Throw torpedoes
        player1.throwTorpedo(2, 3);
        player2.throwTorpedo(5, 6);

        // Play a round
        Round round1 = new Round(player1);
        round1.playRound();

        // End game
        game.end();
    }
}

