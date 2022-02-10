import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SevensTest {

    Sevens sevens = new Sevens();
    Hand[] sevensTableHands = sevens.createSevensTableHands();

    @Test
    void createSevensTableHands(){
        assertEquals(4 , sevensTableHands.length);
    }

    @Test
    void playToSevenHandCanPlaySevenToEmptyHand(){
        assertTrue(sevens.playToSevenHand(new Card("H7"), new Hand(),false));
    }

    @Test
    void playToSevenHandCanNotPlaySevenToHandWithCards(){
        assertTrue(sevens.playToSevenHand(new Card("H7"), new Hand("H2,H3"),false));
    }

    @Test
    void playToSevenHandSevenToEmptyHand(){
        fail("Not yet implemented"); //Remove
    }

    @Test
    void canPlayToSevenHandSixWithH7Hand(){
        fail("Not yet implemented"); //Remove
    }

    @Test
    void canNotPlayToSevenHandFiveWithH7Hand(){
        fail("Not yet implemented"); //Remove
    }

    @Test
    void playToSevenHandSixWithH7Hand(){
        fail("Not yet implemented"); //Remove
    }

    @Test
    void canPlayToSevenHandEightWithH7Hand(){
        fail("Not yet implemented"); //Remove
    }

    @Test
    void canNotPlayToSevenHandNineWithH7Hand(){
        fail("Not yet implemented"); //Remove
    }

    @Test
    void playToSevenHandEightWithH7Hand(){
        fail("Not yet implemented"); //Remove
    }

}