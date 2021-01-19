import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;

class ExerciceTest {

    @Test
    @DisplayName("This is what a test looks like")
    void example() {
        assertThat("hello".length()).isEqualTo(5);
    }
}