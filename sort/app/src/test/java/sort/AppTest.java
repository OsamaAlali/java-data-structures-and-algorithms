/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
//    @Test void appHasAGreeting() {
//        App classUnderTest = new App();
//        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
//    }

    @Test void sort(){
        int []arr={5,4,1};
        int []out={1,4,5};
        assertArrayEquals(out,App.sort(arr));
    }
}