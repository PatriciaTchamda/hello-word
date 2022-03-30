import org.junit.AfterClass;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculatorUnderTest;

    @BeforeEach
    public void initCalculator() {
        System.out.println("Appel avant chaque test");
        calculatorUnderTest = new Calculator();
    }

    @Test
    public void testAddTwoPositiveNumbers() {
        // Arrange
        int a = 2;
        int b = 3;

        // Act
        int somme = calculatorUnderTest.somme(a, b);

        // Assert
        assertEquals(5, somme);
    }

    @AfterEach
    public void undefCalculator() {
        System.out.println("Appel après chaque test");
        calculatorUnderTest = null;
    }



    @Test
    public void testAssertions() {
        //test data
        String str1 = new String ("abc");
        String str2 = new String ("abc");
        String str3 = null;
        String str4 = "abc";
        String str5 = "abc";

        int val1 = 5;
        int val2 = 6;

        String[] expectedArray = {"one", "two", "three"};
        String[] resultArray =  {"one", "two", "three"};

        //Check that two objects are equal
        assertEquals(str1, str2);

        //Check that a condition is true
        assertTrue (val1 < val2);

        //Check that a condition is false
        assertFalse(val1 > val2);

        //Check that an object isn't null
        assertNotNull(str1);

        //Check that an object is null
        assertNull(str3);

        //Check if two object references point to the same object
        assertSame(str4,str5);

        //Check if two object references not point to the same object
        assertNotSame(str1,str3);

        //Check whether two arrays are equal to each other.
        assertArrayEquals(expectedArray, resultArray);
    }


    @Test
    @DisplayName("Addition de deux nombre")
    void somme() {
        assertEquals(4, Calculator.somme(2, 2));
    }

    @Test
    @DisplayName("multiplication de deux nombre")
    void multi() {
        assertAll(
                () -> assertEquals(4, Calculator.Multi(2, 2)),
                () -> assertEquals(-4, Calculator.Multi(2, -2)),
                () -> assertEquals(4, Calculator.Multi(-2, -2)),
                () -> assertEquals(0, Calculator.Multi(1, 0))
        );
    }

    @AfterAll
    static public void fin(){
        System.out.println("fin de tous les test");
    }

    @BeforeAll
    static public void debut(){
        System.out.println("debut de tous les testw");
    }


}