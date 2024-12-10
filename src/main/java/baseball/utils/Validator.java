package baseball.utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validator {
    public static void validateInput(String input){
        if(input==null || input.trim().isEmpty()){
            throw new IllegalArgumentException("입력값이 비어있습니다.");
        }
        if(!input.matches("\\d+")){
            throw new IllegalArgumentException("입력값은 숫자만 가능합니다.");
        }
        if(input.length()!=3){
            throw new IllegalArgumentException("3자리의 수를 입력해주세요.");
        }
    }

    public static void validateUnique(List<Integer> numbers){
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        if(uniqueNumbers.size() != numbers.size()){
            throw new IllegalArgumentException("중복된 숫자는 입력할 수 없습니다.");
        }
    }
}
