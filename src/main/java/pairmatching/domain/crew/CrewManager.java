package pairmatching.domain.crew;

import java.util.List;

public interface CrewManager {

    BackendCrews makeBackendCrews(List<String> convertedFile);

    FrontendCrewMembers makeFrontendCrews(List<String> convertedFile);
}
