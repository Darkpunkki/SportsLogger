import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SportsLoggerTest {

    private SportsLogger logger;

    @BeforeEach
    void setUp() {
        logger = new SportsLogger();
    }

    @Test
    void testLogActivity() {
        logger.logActivity("Running", 30, "Monday");
        assertEquals(1, logger.activities.size(), "Activity should be logged");
        assertEquals("Running", logger.activities.get(0).sportName, "Sport name should be Running");
        assertEquals(30, logger.activities.get(0).duration, "Duration should be 30 minutes");
        assertEquals("Monday", logger.activities.get(0).day, "Day should be Monday");
    }

    @Test
    void testViewActivitiesWithNoLoggedActivity() {
        logger.viewActivities();
        assertTrue(logger.activities.isEmpty(), "There should be no activities logged");
    }

    @Test
    void testCalculateTotalTimeWithNoActivities() {
        int totalTime = logger.calculateTotalTime();
        assertEquals(0, totalTime, "Total time should be 0 if no activities are logged");
    }

    @Test
    void testCalculateTotalTimeWithMultipleActivities() {
        logger.logActivity("Running", 30, "Monday");
        logger.logActivity("Swimming", 45, "Tuesday");
        logger.logActivity("Cycling", 60, "Wednesday");

        int totalTime = logger.calculateTotalTime();
        assertEquals(135, totalTime, "Total time should be the sum of all activities' durations");
    }

    @Test
    void testLogMultipleActivities() {
        logger.logActivity("Running", 30, "Monday");
        logger.logActivity("Swimming", 45, "Tuesday");

        assertEquals(2, logger.activities.size(), "There should be two activities logged");
    }
}
