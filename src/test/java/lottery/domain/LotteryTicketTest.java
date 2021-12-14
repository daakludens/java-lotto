package lottery.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LotteryTicketTest {

    @ParameterizedTest
    @CsvSource(value = {"1:2:3:4:5:6"}, delimiter = ':')
    void validGeneration(final int num1, final int num2, final int num3, final int num4, final int num5, final int num6) {
        assertThat(LotteryTicket.of(Arrays.asList(num1, num2, num3, num4, num5, num6)))
            .isEqualTo(LotteryTicket.of(Arrays.asList(num6, num5, num4, num3, num2, num1)));
    }

    @ParameterizedTest
    @CsvSource(value = {"2:2:3:4:5:6"}, delimiter = ':')
    @DisplayName("중복 번호 생성 실패 테스트")
    void duplicatedNumber(final int num1, final int num2, final int num3, final int num4, final int num5, final int num6) {
        assertThatIllegalArgumentException()
            .isThrownBy(() -> LotteryTicket.of(Arrays.asList(num1, num2, num3, num4, num5, num6)));

    }
}