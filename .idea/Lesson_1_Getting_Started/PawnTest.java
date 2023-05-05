package Lesson_1_Getting_Started;

import static org.junit.jupiter.api.Assertions.*;

public class PawnTest extends junit.framework.TestCase {
    public void testCreate() {
        final String a2PawnColor = "white";
        Pawn a2Pawn = new Pawn(a2PawnColor);
        assertEquals(a2PawnColor, a2Pawn.getColor());

        final String a7PawnColor = "black";
        Pawn a7Pawn = new Pawn(a7PawnColor);
        assertEquals(a7PawnColor, a7Pawn.getColor());

        assertEquals(a2PawnColor, a2Pawn.getColor());

    }
}