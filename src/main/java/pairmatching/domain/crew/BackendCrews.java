package pairmatching.domain.crew;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BackendCrews {

    private final List<Crew> backendCrews;

    public BackendCrews(List<Crew> backendCrews) {
        this.backendCrews = new ArrayList<>(backendCrews);
    }

    public List<Crew> getBackendCrews() {
        return Collections.unmodifiableList(backendCrews);
    }
}
