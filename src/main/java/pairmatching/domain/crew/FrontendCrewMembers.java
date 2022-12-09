package pairmatching.domain.crew;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrontendCrewMembers {

    private final List<Member> frontendCrewMembers;

    public FrontendCrewMembers(List<Member> frontendCrewMembers) {
        this.frontendCrewMembers = new ArrayList<>(frontendCrewMembers);
    }

    public List<Member> getFrontendCrewMembers() {
        return Collections.unmodifiableList(frontendCrewMembers);
    }

}
