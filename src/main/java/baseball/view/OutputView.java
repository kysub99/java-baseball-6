package baseball.view;

import baseball.model.Result;

public class OutputView {
    public static void printResult(Result result){
        int strike = result.getStrike();
        int ball = result.getBall();
        if(ball==0 && strike==0){
            System.out.println("낫싱");
            return;
        }
        if(ball>0){
            System.out.print(ball + "볼 ");
        }
        if(strike >0){
            System.out.print(strike + "스트라이크");
        }
        System.out.println();
    }

    public static void gameEnd(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
