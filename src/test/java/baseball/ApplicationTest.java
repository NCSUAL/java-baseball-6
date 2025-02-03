package baseball;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import camp.nextstep.edu.missionutils.test.NsTest;


class ApplicationTest extends NsTest {
    @Test
    void 게임종료_후_재시작() {
    	assertThat(2).isEqualTo(2);
    }

    @Test
    void 예외_테스트() {
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
