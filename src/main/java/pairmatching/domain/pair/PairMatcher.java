package pairmatching.domain.pair;

import java.util.List;
import pairmatching.domain.crew.Crew;

public interface PairMatcher {

    Pairs pairMatch(String matchingInformationInput, List<Crew> crews);

}
