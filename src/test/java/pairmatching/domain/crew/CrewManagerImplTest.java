package pairmatching.domain.crew;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CrewManagerImplTest {

    private static final CrewManager crewManager = new CrewManagerImpl();

    @Test
    @DisplayName("변환된 파일 데이터로 백엔드 크루원 리스트를 만든다.")
    void makeBackendCrewMembersTest() {
        //given
        List<String> convertedFile = List.of("수환", "백호", "치수");

        //when
        BackendCrewMembers backendCrewMembers = crewManager.makeBackendCrewMembers(convertedFile);

        //then
        assertThat(backendCrewMembers.getBackendCrewMembers().size()).isEqualTo(3);

        for (Member backendCrewMember : backendCrewMembers.getBackendCrewMembers()) {
            assertThat(convertedFile).contains(backendCrewMember.getMemberName());
            assertThat(backendCrewMember.getCourse()).isEqualTo(Course.BACKEND);
        }
    }

}
