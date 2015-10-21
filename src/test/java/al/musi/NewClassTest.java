package al.musi;

import java.util.HashMap;
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
    
    protected HashMap<String, Integer> testCases;

    
    public NewClassTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        testCases = new HashMap<>();
        testCases.put("Alive is awesome", 3);
        testCases.put("Alive is", 2);
        testCases.put("Alive ", 1);
        testCases.put(" Alive", 1);
        testCases.put(" Alive ", 1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of countWords method, of class NewClass.
     */
    @Test
    public void testCountWords() {
        System.out.println("countWords");
        //String str = "";
        NewClass instance = new NewClass();
        
        testCases.entrySet().stream().forEach((entry) -> {
            System.out.println(entry.getKey() + ":" + entry.getValue());
            int result = instance.countWords(entry.getKey());
            int expResult = entry.getValue();
            assertEquals(expResult, result);
        });
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of wordcount method, of class NewClass.
     */
    @Test
    public void testWordcount() {
        System.out.println("wordcount");
        NewClass instance = new NewClass();
        
        testCases.entrySet().stream().forEach((entry) -> {
            System.out.println(entry.getKey() + ":" + entry.getValue());
            
            int result = instance.countWords(entry.getKey());
            int expResult = entry.getValue();
            
            System.out.println(expResult + ":" + result + " |");
            assertEquals(expResult, result);
        });
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
