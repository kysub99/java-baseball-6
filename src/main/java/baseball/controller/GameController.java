package baseball.controller;

import baseball.model.Computer;
import baseball.model.Player;
import baseball.model.Result;
import baseball.service.GameService;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.List;

public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    public void run(){
        Computer computer = new Computer();
        while(true) {
            String input = InputView.getNumber();
            List<Integer> playerNumber = gameService.parseIntList(input);
            Player player = new Player(playerNumber);
            Result result = gameService.judge(computer, player);
            OutputView.printResult(result);
        }
    }
}
