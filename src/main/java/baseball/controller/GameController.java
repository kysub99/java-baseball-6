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
        while(true){
            Computer computer = new Computer();
            game(computer);
            try {
                String status = InputView.getStatus();
                if (gameService.exitGame(status, computer)) {
                    break;
                }
            } catch(IllegalArgumentException e){

            }
        }
    }

    public void game(Computer computer){
        while(true){
            String input = InputView.getNumber();
            List<Integer> playerNumber = gameService.parseIntList(input);
            Player player = new Player(playerNumber);
            Result result = gameService.judge(computer, player);
            OutputView.printResult(result);
            if(gameService.isEnd(result)){
                break;
            }
        }
    }
}
