package pairmatching.domain.crew;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrontendCrewMembers {

    private final List<Crew> frontendCrews;

    public FrontendCrewMembers(List<Crew> frontendCrews) {
        this.frontendCrews = new ArrayList<>(frontendCrews);
    }

    public List<Crew> getFrontendCrews() {
        return Collections.unmodifiableList(frontendCrews);
    }

}
