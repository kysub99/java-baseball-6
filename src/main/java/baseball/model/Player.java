package baseball.model;

import org.assertj.core.internal.Integers;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Integer> numbers = new ArrayList<>();

    Player(List<Integer> numbers){
        this.numbers = numbers;
    }
}
