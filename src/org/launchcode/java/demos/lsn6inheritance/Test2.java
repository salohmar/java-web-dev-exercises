package org.launchcode.java.demos.lsn6inheritance;

import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;
import org.launchcode.java.demos.lsn6inheritance.Cat;
import org.launchcode.java.demos.lsn6inheritance.Main;
import static org.junit.Assert.*;

public class Test2 {

    @Test
    public void inheritsInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }
}
