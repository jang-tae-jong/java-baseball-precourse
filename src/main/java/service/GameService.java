package service;

import domain.Game;
import domain.Player;
import utils.RandomNumber;

public class GameService {
    Game game;
    Player player = new Player();

    public void setGame(int numberSize, int startNumber, int endNumber){
        RandomNumber randomNumber = new RandomNumber(numberSize,startNumber,endNumber);
        this.game = new Game(randomNumber.getRandomNumber());
    }

}
