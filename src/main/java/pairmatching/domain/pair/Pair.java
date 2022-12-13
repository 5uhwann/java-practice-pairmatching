package pairmatching.domain.pair;

import java.util.ArrayList;
import java.util.List;
import pairmatching.domain.crew.Crew;
import pairmatching.domain.pair.preinformation.Level;
import pairmatching.domain.pair.preinformation.Mission;

public class Pair {

    private final Level level;
    private final Mission mission;
    private final List<Crew> memberCrew;

    public Pair(Level level, Mission mission, List<Crew> memberCrew) {
        this.level = level;
        this.mission = mission;
        this.memberCrew = memberCrew;
    }

    public Level getLevel() {
        return level;
    }

    public Mission getMission() {
        return mission;
    }

    public List<Crew> getMemberCrew() {
        return new ArrayList<>(memberCrew);
    }
}
