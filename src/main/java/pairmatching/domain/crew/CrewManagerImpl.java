package pairmatching.domain.crew;

import java.util.List;
import java.util.stream.Collectors;

public class CrewManagerImpl implements CrewManager{

    @Override
    public BackendCrewMembers makeBackendCrewMembers(List<String> convertedFile) {
        List<Member> backendCrewMembers = convertedFile.stream()
                .map(name -> new Member(Course.BACKEND, name))
                .collect(Collectors.toList());

        return new BackendCrewMembers(backendCrewMembers);
    }

    @Override
    public FrontendCrewMembers makeFrontendCrewMembers(List<String> convertedFile) {
        List<Member> frontendCrewMembers = convertedFile.stream()
                .map(name -> new Member(Course.FRONTEND, name))
                .collect(Collectors.toList());

        return new FrontendCrewMembers(frontendCrewMembers);
    }
}
