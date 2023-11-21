package beginner.belajarspringlogging;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@Slf4j
@TestPropertySource("classpath:application-first.properties")
public class LoggingTest {

    @Test
    void testLongLogging() {
        for (int i = 0; i < 100_000; i++) {
            log.warn("Hello World");
        }
    }

    @Test
    void testLog() {
        log.info("Hello World");
        log.warn("Hello Spring");
        log.error("Belajar Spring Framework");
    }
}
