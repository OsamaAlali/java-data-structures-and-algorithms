/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
//    @Test void appHasAGreeting() {
//        App classUnderTest = new App();
//        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
//    }
    @Test void tree(){
BinarySearch bts=new BinarySearch();
String out="BinarySearch{root=null}";
assertEquals(out,bts.toString());

Node n=new Node(6);

bts.add(3,n);
String  out1 ="BinarySearch{root=null}";
assertNotEquals(out,bts.toString());


    }

    // code 18
    @Test void max(){
        BinarySearch bts=new BinarySearch();

        bts.add(6,bts.root);
        bts.add(3,bts.root);
        bts.add(1,bts.root);
        bts.add(10,bts.root);
        bts.add(15,bts.root);
        bts.add(9,bts.root);

        assertEquals(15,bts.maxValue(bts.root));
        assertNotEquals(9 ,bts.maxValue(bts.root));
    }
}
