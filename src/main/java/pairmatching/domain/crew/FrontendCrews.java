package pairmatching.domain.crew;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrontendCrews {

    private final List<Crew> frontendCrews;

    public FrontendCrews(List<Crew> frontendCrews) {
        this.frontendCrews = new ArrayList<>(frontendCrews);
    }

    public List<Crew> getFrontendCrews() {
        return Collections.unmodifiableList(frontendCrews);
    }
}
