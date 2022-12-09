package pairmatching.domain.crew;

import java.util.List;
import java.util.stream.Collectors;

public class CrewManagerImpl implements CrewManager{

    @Override
    public BackendCrews makeBackendCrews(List<String> convertedFile) {
        List<Crew> backendCrews = convertedFile.stream()
                .map(name -> new Crew(Course.BACKEND, name))
                .collect(Collectors.toList());

        return new BackendCrews(backendCrews);
    }

    @Override
    public FrontendCrewMembers makeFrontendCrews(List<String> convertedFile) {
        List<Crew> frontendCrews = convertedFile.stream()
                .map(name -> new Crew(Course.FRONTEND, name))
                .collect(Collectors.toList());

        return new FrontendCrewMembers(frontendCrews);
    }
}
