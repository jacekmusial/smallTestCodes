package al.musi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author re
 */
public class NewClassTest {
    
    private class TestCases {
        String str;
        int numberOfWords;

        public TestCases(String str, int numberOfWords ) {
            this.str = str;
            this.numberOfWords = numberOfWords;
        }
        
        public int getKey () {
            return this.numberOfWords;
        }
        
        public String getValue () {
            return this.str;
        }
    }
    
    /**
     * Instance of class with test methods
     */
    public final static NewClass instance = new NewClass();
    
    /**
     * list of objects of TestCases class
     */
    private List<TestCases> testCases;
    
    @BeforeClass
    public static void setUpClass() {}
    
    @AfterClass
    public static void tearDownClass() {}
    
    @Before
    public void setUp() {
        testCases = new ArrayList<>();
        testCases.add(new TestCases("Alive is awesome", 3));
        testCases.add(new TestCases("Alive is", 2));
        testCases.add(new TestCases("Alive ", 1));
        testCases.add(new TestCases(" Alive", 1));
        testCases.add(new TestCases(" Alive ",1));
    }
    
    @After
    public void tearDown() {}

    /**
     * Test of countWords method, of class NewClass.
     */
    @Test
    public void testCountWords() {
        System.out.println("countWords");
        
        testCases.stream().forEach((t) -> {
            System.out.println(t.getKey() + ":" + t.getValue());
            int result = instance.countWords(t.getValue());
            int expResult = t.getKey();
            assertEquals(expResult, result);
        });
    }

    /**
     * Test of wordcount method, of class NewClass.
     */
    @Test
    public void testWordcount() {
        System.out.println("wordcount");
        
        testCases.stream().forEach((t) -> {
            System.out.println(t.getKey() + ":" + t.getValue());
            int result = instance.countWords(t.getValue());
            int expResult = t.getKey();
            System.out.println(expResult + ":" + result + " |");
            assertEquals(expResult, result);
        });
    }
    
    /**
     * Test of bestCountWords method, of class NewClass.
     */
    @Test
    public void testBestCountWords() {
        System.out.println("bestCountWords");
        
        testCases.stream().forEach((t -> {
            int result = instance.bestCountWords(t.getValue());
            int expResult = t.getKey();
            System.out.println("\"" + t.getValue() + "\"" +
                ":" + t.getKey() + " |");
            System.out.println("__________");
            assertEquals(expResult, result);
        }));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class NewClass.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        NewClass.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}