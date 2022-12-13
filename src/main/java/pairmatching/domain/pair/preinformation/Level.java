package pairmatching.domain.pair.preinformation;

import static pairmatching.domain.pair.preinformation.Mission.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Level {
    LEVEL_1(List.of(RACING, LOTTO, BASEBALL), "레벨1 :"),
    LEVEL_2(List.of(SHOPPING_BASKET, PAYMENT, SUBWAY), "레벨2 :"),
    LEVEL_3(List.of(), "레벨3 :"),
    LEVEL_4(List.of(REFACTORING, DISTRIBUTION), "레벨4 :"),
    LEVEL_5(List.of(), "레벨5 :"),
    ;

    private final List<Mission> missions;
    private final String korenTag;

    Level(List<Mission> missions, String korenTag) {
        this.missions = missions;
        this.korenTag = korenTag;
    }

    public List<Mission> getMissions() {
        return Collections.unmodifiableList(missions);
    }

    public String getKorenTag() {
        return korenTag;
    }

    public static Level findLevel(String korenTag) {
        return Arrays.stream(Level.values())
                .filter(level -> level.getKorenTag().substring(0, 3).equals(korenTag))
                .findAny()
                .orElseThrow();
    }
}
