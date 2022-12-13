package pairmatching.domain.pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pairs {

    private final List<Pair> pairs;


    public Pairs(List<Pair> pairs) {
        this.pairs = new ArrayList<>(pairs);
    }

    public List<Pair> getPairs() {
        return Collections.unmodifiableList(pairs);
    }
}
