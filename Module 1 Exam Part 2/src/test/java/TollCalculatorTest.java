import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TollCalculatorTest {

    private final TollCalculator calculator = new TollCalculator();

    // TCI-01: Negative weight
    @Test
    void testNegativeWeight() {
        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.calculateDiscount(-1, false, false)
        );
    }

    // TCI-02: Weight exactly 0
    @Test
    void testZeroWeight() {
        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.calculateDiscount(0, false, false)
        );
    }

    // TCI-03: Minimum valid weight
    @Test
    void testMinimumValidWeight() {
        assertEquals(
                0.0,
                calculator.calculateDiscount(0.1, false, false)
        );
    }

    // TCI-04: Tier 1 maximum boundary
    @Test
    void testTier1MaximumWeight() {
        assertEquals(
                0.0,
                calculator.calculateDiscount(1200, true, true)
        );
    }

    // TCI-05: Just above Tier 1
    @Test
    void testJustAboveTier1() {
        assertEquals(
                0.0,
                calculator.calculateDiscount(1200.1, false, false)
        );
    }

    // TCI-06: Tier 2, neither EV nor carpool
    @Test
    void testTier2NeitherEVNorCarpool() {
        assertEquals(
                0.0,
                calculator.calculateDiscount(2000, false, false)
        );
    }

    // TCI-07: Tier 2, EV only
    @Test
    void testTier2EVOnly() {
        assertEquals(
                0.10,
                calculator.calculateDiscount(2000, true, false)
        );
    }

    // TCI-08: Tier 2, carpool only
    @Test
    void testTier2CarpoolOnly() {
        assertEquals(
                0.10,
                calculator.calculateDiscount(2000, false, true)
        );
    }

    // TCI-09: Tier 2, EV and carpool
    @Test
    void testTier2EVAndCarpool() {
        assertEquals(
                0.15,
                calculator.calculateDiscount(2000, true, true)
        );
    }

    // TCI-10: Tier 2 maximum boundary
    @Test
    void testTier2MaximumWeight() {
        assertEquals(
                0.15,
                calculator.calculateDiscount(3500, true, true)
        );
    }

    // TCI-11: Just above Tier 2
    @Test
    void testJustAboveTier2() {
        assertEquals(
                0.05,
                calculator.calculateDiscount(3500.1, false, false)
        );
    }

    // TCI-12: Tier 3, neither EV nor carpool
    @Test
    void testTier3NeitherEVNorCarpool() {
        assertEquals(
                0.05,
                calculator.calculateDiscount(4000, false, false)
        );
    }

    // TCI-13: Tier 3, EV only
    @Test
    void testTier3EVOnly() {
        assertEquals(
                0.05,
                calculator.calculateDiscount(4000, true, false)
        );
    }

    // TCI-14: Tier 3, carpool only
    @Test
    void testTier3CarpoolOnly() {
        assertEquals(
                0.05,
                calculator.calculateDiscount(4000, false, true)
        );
    }

    // TCI-15: Tier 3, EV and carpool
    @Test
    void testTier3EVAndCarpool() {
        assertEquals(
                0.25,
                calculator.calculateDiscount(4000, true, true)
        );
    }
}