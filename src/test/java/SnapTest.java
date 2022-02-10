import org.junit.jupiter.api.Test;

import java.util.concurrent.CancellationException;

import static org.junit.jupiter.api.Assertions.*;

class SnapTest {

    Snap snap = new Snap();

    @Test
    void isSnapWithSuit() {
        assertTrue(snap.isSnap(new Card("D3"), new Card("D4"), true));
    }

    @Test
    void isNotSnapWithRankAndSnapSuitOn() {

    }


    @Test
    void isSnapRank() {

    }

    @Test
    void isNotSnapWithSuitAndSnapSuitOff() {

    }
}