package pairmatching.domain.crew;

import java.util.List;

public interface CrewManager {

    BackendCrewMembers makeBackendCrewMembers(List<String> convertedFile);

}
