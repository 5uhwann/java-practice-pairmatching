package pairmatching.utils;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FileConverterTest {

    @Test
    @DisplayName("파일 컨버터는 파일 데이터를 읽어 List<String>의 형태로 반환한다.")
    void convertFileTest() throws IOException {
        //given //when
        List<String> convertedFile = FileConverter.convertFile(
                "/Users/5uhwann/study/Java/pairmatching/src/main/resources/backend-crew.md");

        //then
        assertThat(convertedFile).contains("백호");
        assertThat(convertedFile.size()).isEqualTo(20);

    }

}
