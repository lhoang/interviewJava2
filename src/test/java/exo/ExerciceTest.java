package exo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class ExerciceTest {

    @Test
    @DisplayName("This is what a test looks like")
    void example() {
        assertThat("hello".length()).isEqualTo(5);
    }

    @Test
    void test1() {
        var input = List.of("50 +", "52 -");


        assertThat("").isEqualTo("51");
    }

    @Test
    void test2() {
        var input = List.of(
                "25 +",
                "35 +",
                "99 -",
                "90 -",
                "38 ="
        );


        assertThat("").isEqualTo("38");
    }

    @Test
    void test3() {
        var input = List.of(
                "37 -",
                "28 +",
                "51 -",
                "62 +",
                "25 -"
        );


        assertThat("").isEqualTo("Impossible");
    }

    @Test
    void test4() {
        var input = List.of(
                "62 -",
                "38 +",
                "72 -",
                "40 -",
                "32 ="
        );


        assertThat("").isEqualTo("Impossible");
    }

    @Test
    void test5() {
        var input = List.of("99 +");


        assertThat("").isEqualTo("100");
    }
}