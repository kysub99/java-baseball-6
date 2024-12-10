package baseball.model;

import org.assertj.core.internal.Integers;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Integer> numbers = new ArrayList<>();

    public Player(List<Integer> numbers){
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
