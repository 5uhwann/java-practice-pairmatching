package pairmatching.domain.pair;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;
import pairmatching.domain.crew.Course;
import pairmatching.domain.crew.Crew;
import pairmatching.domain.pair.preinformation.Level;
import pairmatching.domain.pair.preinformation.Mission;

class PairMatcherImplTest {

    private static final PairMatcher pairMatcher = new PairMatcherImpl();

    @Test
    void pairMatchTest_짝수() {
        //given
        String matchingInformationInput = "백엔드, 레벨1, 자동차경주";
        Crew crewA = new Crew(Course.BACKEND, "A");
        Crew crewB = new Crew(Course.BACKEND, "B");
        Crew crewC = new Crew(Course.BACKEND, "C");
        Crew crewD = new Crew(Course.BACKEND, "D");
        List<Crew> crews = List.of(crewA, crewB, crewC, crewD);

        //when
        Pairs pairs = pairMatcher.pairMatch(matchingInformationInput, crews);

        //then
        assertThat(pairs.getPairs().size()).isEqualTo(crews.size() / 2);
        for (Pair pair : pairs.getPairs()) {
            assertThat(pair.getLevel()).isEqualTo(Level.LEVEL_1);
            assertThat(pair.getMission()).isEqualTo(Mission.RACING);
            assertThat(pair.getMemberCrew().size()).isEqualTo(2);
        }

    }

    @Test
    void pairMatchTest_홀수() {
        //given
        String matchingInformationInput = "백엔드, 레벨2, 자동차경주";
        Crew crewA = new Crew(Course.BACKEND, "A");
        Crew crewB = new Crew(Course.BACKEND, "B");
        Crew crewC = new Crew(Course.BACKEND, "C");
        Crew crewD = new Crew(Course.BACKEND, "D");
        Crew crewE = new Crew(Course.BACKEND, "E");
        List<Crew> crews = List.of(crewA, crewB, crewC, crewD, crewE);

        //when
        Pairs pairs = pairMatcher.pairMatch(matchingInformationInput, crews);

        //then
        assertThat(pairs.getPairs().size()).isEqualTo((crews.size() - 1) / 2);
        for (Pair pair : pairs.getPairs()) {
            assertThat(pair.getLevel()).isEqualTo(Level.LEVEL_2);
            assertThat(pair.getMission()).isEqualTo(Mission.RACING);
        }
        Pair lastPair = pairs.getPairs().get(pairs.getPairs().size() - 1);
        assertThat(lastPair.getMemberCrew().size()).isEqualTo(3);
    }

}
