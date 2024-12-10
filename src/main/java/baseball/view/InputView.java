package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String getNumber(){
        System.out.println("숫자를 입력해주세요 : ");
        String input = Console.readLine();
        if(input==null || input.trim().isEmpty()){
            throw new IllegalArgumentException("입력값이 비어있습니다.");
        }
        if(!input.matches("\\d+")){
            throw new IllegalArgumentException("입력값은 숫자만 가능합니다.");
        }
        return input;
    }
}
