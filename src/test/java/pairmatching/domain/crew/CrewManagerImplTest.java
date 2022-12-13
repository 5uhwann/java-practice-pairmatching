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
        BackendCrews backendCrews = crewManager.makeBackendCrews(convertedFile);

        //then
        assertThat(backendCrews.getBackendCrews().size()).isEqualTo(3);

        for (Crew backendCrewCrew : backendCrews.getBackendCrews()) {
            assertThat(convertedFile).contains(backendCrewCrew.getCrewName());
            assertThat(backendCrewCrew.getCourse()).isEqualTo(Course.BACKEND);
        }
    }

    @Test
    @DisplayName("변환된 파일 데이터로 프론트엔드 크루원 리스트를 만든다.")
    void makeFrontendCrewMembersTest() {
        //given
        List<String> convertedFile = List.of("수환", "백호", "치수");

        //when
        FrontendCrews frontendCrews = crewManager.makeFrontendCrews(convertedFile);

        //then
        assertThat(frontendCrews.getFrontendCrews().size()).isEqualTo(3);

        for (Crew frontendCrew : frontendCrews.getFrontendCrews()) {
            assertThat(convertedFile).contains(frontendCrew.getCrewName());
            assertThat(frontendCrew.getCourse()).isEqualTo(Course.FRONTEND);
        }
    }

}
