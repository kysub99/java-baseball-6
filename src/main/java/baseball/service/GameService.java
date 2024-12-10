package baseball.service;

import baseball.utils.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GameService {
    public List<Integer> parseIntList(String input){
//        List<Integer> numbers = new ArrayList<>();
//        for(int i=0;i<input.length();i++){
//            char c = input.charAt(i);
//            int number = Character.getNumericValue(c);
//            numbers.add(number);
//        }
        // 문자열을 스트림으로 처리
        List<Integer> numbers = input.chars() // 문자열의 각 문자를 IntStream으로 변환
                .mapToObj(Character::getNumericValue) // 각 문자를 숫자로 변환
                .collect(Collectors.toList()); // List<Integer>로 수집
        Validator.validateUnique(numbers);
        return numbers;
    }
}
