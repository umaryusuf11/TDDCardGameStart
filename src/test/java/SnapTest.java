import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnapTest {

    Snap snap = new Snap();

    @Test
    void isSnapWithSuit() {
        Card c1 = new Card("D3");
        Card c2 = new Card("D4");
        assertTrue(snap.isSnap(c1, c2, true));
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