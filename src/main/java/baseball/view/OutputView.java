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
            System.out.println(ball + "볼 ");
        }
        if(strike >0){
            System.out.println(strike + "스트라이크");
        }
    }
}
