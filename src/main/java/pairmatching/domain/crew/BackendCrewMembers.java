package pairmatching.domain.crew;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BackendCrewMembers {

    private final List<Member> backendCrewMembers;

    public BackendCrewMembers(List<Member> backendCrewMembers) {
        validateBackendCrewMembers(backendCrewMembers);
        this.backendCrewMembers = new ArrayList<>(backendCrewMembers);
    }

    public List<Member> getBackendCrewMembers() {
        return Collections.unmodifiableList(backendCrewMembers);
    }

    private void validateBackendCrewMembers(List<Member> backendCrewMembers) {
        List<Member> nonBackendCrewMembers = backendCrewMembers.stream()
                .filter(member -> member.getCourse() != Course.BACKEND)
                .collect(Collectors.toList());

        if (nonBackendCrewMembers.size() > 0) {
            throw new IllegalArgumentException("[ERROR] 백엔드 크루 멤버가 아닌 멤버가 존재합니다.");
        }
    }
}
