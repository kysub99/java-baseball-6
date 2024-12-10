package baseball.controller;

import baseball.model.Computer;
import baseball.model.Player;
import baseball.service.GameService;
import baseball.view.InputView;

import java.util.List;

public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    public void run(){
        String input = InputView.getNumber();
        List<Integer> playerNumber = gameService.parseIntList(input);
        Computer computer = new Computer();
        Player player = new Player(playerNumber);

    }
}
