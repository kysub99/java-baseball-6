package baseball.view;

import baseball.utils.Validator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String getNumber(){
        System.out.print("숫자를 입력해주세요 : ");
        String numbers = Console.readLine();
        Validator.validateInput(numbers);
        return numbers;
    }

    public static String getStatus(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String status = Console.readLine();
        return status;
    }
}
