package pairmatching.domain.pair;

import static pairmatching.domain.pair.preinformation.Level.*;
import static pairmatching.domain.pair.preinformation.Mission.*;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import pairmatching.domain.crew.Crew;

public class PairMatcherImpl implements PairMatcher {

    @Override
    public Pairs pairMatch(String matchingInformationInput, List<Crew> crews) {
        String[] matchingInformation = matchingInformationInput
                .replaceAll(" ", "")
                .split(",");
        List<Crew> shuffledCrews = Randoms.shuffle(crews);
        return new Pairs(makePairs(matchingInformation, shuffledCrews));
    }

    private List<Pair> makePairs(String[] matchingInformation, List<Crew> shuffledCrews) {
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < shuffledCrews.size(); i += 2) {
            if (i + 2 == shuffledCrews.size() - 1) {
                pairs.add(new Pair(findLevel(matchingInformation[1]), findMission(matchingInformation[2]),
                        List.of(shuffledCrews.get(i), shuffledCrews.get(i + 1), shuffledCrews.get(i + 2))));
                return pairs;
            }
            pairs.add(new Pair(findLevel(matchingInformation[1]), findMission(matchingInformation[2]),
                    List.of(shuffledCrews.get(i), shuffledCrews.get(i + 1))));
        }
        return pairs;
    }
}
