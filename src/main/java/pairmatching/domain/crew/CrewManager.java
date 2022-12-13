package pairmatching.domain.crew;

import java.util.List;

public interface CrewManager {

    BackendCrews makeBackendCrews(List<String> convertedFile);

    FrontendCrews makeFrontendCrews(List<String> convertedFile);
}
