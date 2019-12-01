package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class JumpGameTest {

    @Test
    public void canJump() {
        assertTrue(JumpGame.canJump(new int[]{2,3,1,1,4}));
        assertFalse(JumpGame.canJump(new int[]{3,2,1,0,4}));
    }
}
