import org.junit.Test;
import junitparams.Parameters;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import java.util.Arrays;

@RunWith(JUnitParamsRunner.class)

public class warmup2test {

    @Test
    @Parameters
    public void stringTimesTest(String str, int num, String expectedResult){
        //arrange

        //act
        String result = warmup2.stringTimes(str, num);

        //assert
        assertThat(result, is(equalTo(expectedResult)));
    }

    private Object[] parametersForStringTimesTest(){
        return new Object[][]{
                {"Hi", 2, "HiHi"},
                {"Hi", 3, "HiHiHi"},
                {"Hi", 1, "Hi"},
                {"Hi", 0, ""},
                {"Hi", 5, "HiHiHiHiHi"},
                {"Oh Boy!", 2, "Oh Boy!Oh Boy!"},
                {"x", 4, "xxxx"},
                {"", 4,	""},
                {"code", 2,	"codecode"},
                {"code", 3,	"codecodecode"}
        };
    }

    @Test
    @Parameters
    public void frontTimesTest(String str, int num, String expectedResult){
        //arrange

        //act
        String result = warmup2.frontTimes(str, num);

        //assert
        assertThat(result, is(equalTo(expectedResult)));
    }

    private Object[] parametersForFrontTimesTest(){
        return new Object[][]{
                {"Chocolate", 2, "ChoCho"},
                {"Chocolate", 3, "ChoChoCho"},
                {"Abc", 3, "AbcAbcAbc"},
                {"Ab", 4, "AbAbAbAb"},
                {"A", 4, "AAAA"},
                {"", 4, ""},
                {"Abc", 0, ""}
        };
    }

    @Test
    @Parameters
    public void countXXTest(String str, int expectedResult){
        //arrange

        //act
        int result = warmup2.countXX(str);

        //assert
        assertThat(result, is(equalTo(expectedResult)));
    }

    private Object[] parametersForCountXXTest(){
        return new Object[][]{
                {"abcxx", 1},
                {"xxx",	2},
                {"xxxx", 3},
                {"abc",	0},
                {"Hello there",	0},
                {"Hexxo thxxe",	2},
                {"", 0},
                {"Kittens", 0},
                {"Kittensxxx", 2}
        };
    }

    @Test
    @Parameters
    public void doubleXTest(String str, boolean expectedResult){
        //arrange

        //act
        boolean result = warmup2.doubleX(str);

        //assert
        assertThat(result, is(equalTo(expectedResult)));
    }

    private Object[] parametersForDoubleXTest(){
        return new Object[][]{
                {"axxbb", true},
                {"axaxax", false},
                {"xxxxx", true},
                {"xaxxx", false},
                {"aaaax", false},
                {"", false},
                {"abc", false},
                {"x", false},
                {"xx", true},
                {"xax",	false},
                {"xaxx", false}
        };
    }

    @Test
    @Parameters
    public void stringBitsTest(String str, String expectedResult){
        //arrange

        //act
        String result = warmup2.stringBits(str);

        //assert
        assertThat(result, is(equalTo(expectedResult)));
    }

    private Object[] parametersForStringBitsTest(){
        return new Object[][]{
                {"Hello", "Hlo"},
                {"Hi", "H"},
                {"Heeololeo", "Hello"},
                {"HiHiHi", "HHH"},
                {"", ""},
                {"Greetings", "Getns"},
                {"Chocoate", "Coot"},
                {"pi", "p"},
                {"Hello Kitten", "HloKte"},
                {"hxaxpxpxy", "happy"}
        };
    }

    @Test
    @Parameters
    public void stringSplosionTest(String str, String expectedResult){
        //arrange

        //act
        String result = warmup2.stringSplosion(str);

        //assert
        assertThat(result, is(equalTo(expectedResult)));
    }

    private Object[] parametersForStringSplosionTest(){
        return new Object[][]{
                {"Code", "CCoCodCode"},
                {"abc", "aababc"},
                {"ab", "aab"},
                {"x", "x"},
                {"fade", "ffafadfade"},
                {"There", "TThTheTherThere"},
                {"Kitten", "KKiKitKittKitteKitten"},
                {"Bye", "BByBye"},
                {"Good", "GGoGooGood"},
                {"Bad", "BBaBad"}
        };
    }

    @Test
    @Parameters
    public void last2Test(String str, int expectedResult){
        //arrange

        //act
        int result = warmup2.last2(str);

        //assert
        assertThat(result, is(equalTo(expectedResult)));
    }

    private Object[] parametersForLast2Test(){
        return new Object[][]{
                {"hixxhi", 1},
                {"xaxxaxaxx", 1},
                {"axxxaaxx", 2},
                {"xxaxxaxxaxx", 3},
                {"xaxaxaxx", 0},
                {"xxxx", 2},
                {"13121312", 1},
                {"11212", 1},
                {"13121311", 0},
                {"1717171", 2},
                {"hi", 0},
                {"h", 0},
                {"", 0}
        };
    }

    @Test
    @Parameters
    public void arrayCount9Test(int[] nums, int expectedResult){
        //arrange

        //act
        int result = warmup2.arrayCount9(nums);

        //assert
        assertThat(result, is(equalTo(expectedResult)));
    }

    private Object[] parametersForArrayCount9Test(){
        int[] array1 = new int[]{1,2,9};
        int[] array2 = new int[]{1,9,9};
        int[] array3 = new int[]{1,9,9,3,9};
        int[] array4 = new int[]{1,2,3};
        int[] array5 = new int[]{};
        int[] array6 = new int[]{4, 2, 4, 3, 1};
        int[] array7 = new int[]{9, 2, 4, 3, 1};

        return new Object[][]{
            {array1, 1},
            {array2, 2},
            {array3, 3},
            {array4, 0},
            {array5, 0},
            {array6, 0},
            {array7, 1}
        };
    }

    @Test
    @Parameters
    public void arrayFront9Test(int[] nums, boolean expectedResult){
        //arrange

        //act
        boolean result = warmup2.arrayFront9(nums);

        //assert
        assertThat(result, is(equalTo(expectedResult)));
    }

    private Object[] parametersForArrayFront9Test(){
        int[] array1 = new int[]{1,2,9,3,4};
        int[] array2 = new int[]{1,2,3,4,9};
        int[] array3 = new int[]{1,2,3,4,9};
        int[] array4 = new int[]{9,1,2};
        int[] array5 = new int[]{1,9,9};
        int[] array6 = new int[]{1,2,3};
        int[] array7 = new int[]{1,9};
        int[] array8 = new int[]{5,5};
        int[] array9 = new int[]{2};
        int[] array10 = new int[]{9};
        int[] array11 = new int[]{};
        int[] array12 = new int[]{3,9,2,3,3};

        return new Object[][]{
                {array1, true},
                {array2, false},
                {array3, false},
                {array4, true},
                {array5, true},
                {array6, false},
                {array7, true},
                {array8, false},
                {array9, false},
                {array10, true},
                {array11, false},
                {array12, true}
        };
    }

    @Test
    @Parameters
    public void array123Test(int[] nums, boolean expectedResult){
        //arrange

        //act
        boolean result = warmup2.array123(nums);

        //assert
        assertThat(result, is(equalTo(expectedResult)));
    }

    private Object[] parametersForArray123Test(){
        int[] array1 = new int[]{1,2,3,1};
        int[] array2 = new int[]{1,1,2,4,1};
        int[] array3 = new int[]{1,1,2,1,2,3};
        int[] array4 = new int[]{1,2,1,2,1};
        int[] array5 = new int[]{1,2,3,1,2,3};
        int[] array6 = new int[]{1,2,3};
        int[] array7 = new int[]{1,1,1};
        int[] array8 = new int[]{1,2};
        int[] array9 = new int[]{1};
        int[] array10 = new int[]{};

        return new Object[][]{
                {array1, true},
                {array2, false},
                {array3, true},
                {array4, false},
                {array5, true},
                {array6, true},
                {array7, false},
                {array8, false},
                {array9, false},
                {array10, false}
        };
    }

    @Test
    @Parameters
    public void stringMatchTest(String a, String b, int expectedResult){
        //arrange

        //act
        int result = warmup2.stringMatch(a, b);

        //assert
        assertThat(result, is(equalTo(expectedResult)));
    }

    private Object[] parametersForStringMatchTest(){
        return new Object[][]{
                {"xxcaazz", "xxbaaz", 3},
                {"abc", "abc", 2},
                {"abc", "axc", 0},
                {"hello", "he", 1},
                {"he", "hello", 1},
                {"h", "hello", 0},
                {"", "hello", 0},
                {"aabbccdd", "abbbxxd", 1},
                {"aaxxaaxx", "iaxxai", 3},
                {"iaxxai", "aaxxaaxx", 3}
        };
    }

    @Test
    @Parameters
    public void stringTheXTest(String str, String expectedResult){
        //arrange

        //act
        String result = warmup2.stringTheX(str);

        //assert
        assertThat(result, is(equalTo(expectedResult)));
    }

    private Object[] parametersForStringTheXTest(){
        return new Object[][]{
                {"xxHxix", "xHix"},
                {"abxxxcd", "abcd"},
                {"xabxxxcdx", "xabcdx"},
                {"xKittenx", "xKittenx"},
                {"Hello", "Hello"},
                {"xx", "xx"},
                {"x", "x"},
                {"", ""}
        };
    }

    @Test
    @Parameters
    public void altPairsTest(String str, String expectedResult){
        //arrange

        //act
        String result = warmup2.altPairs(str);

        //assert
        assertThat(result, is(equalTo(expectedResult)));
    }

    private Object[] parametersForAltPairsTest(){
        return new Object[][]{
                {"kitten", "kien"},
                {"Chocolate", "Chole"},
                {"CodingHorror", "Congrr"},
                {"yak", "ya"},
                {"ya", "ya"},
                {"y", "y"},
                {"", ""},
                {"ThisThatTheOther", "ThThThth"}
        };
    }

    @Test
    @Parameters
    public void stringYakTest(String str, String expectedResult){
        //arrange

        //act
        String result = warmup2.stringYak(str);

        //assert
        assertThat(result, is(equalTo(expectedResult)));
    }

    private Object[] parametersForStringYakTest(){
        return new Object[][]{
                {"yakpak", "pak"},
                {"pakyak", "pak"},
                {"yak123ya", "123ya"},
                {"yak", ""},
                {"yakxxxyak", "xxx"},
                {"HiyakHi", "HiHi"},
                {"xxxyakyyyakzzz", "xxxyyzzz"}
        };
    }

    @Test
    @Parameters
    public void array667Test(int[] nums, int expectedResult){
        //arrange

        //act
        int result = warmup2.array667(nums);

        //assert
        assertThat(result, is(equalTo(expectedResult)));
    }

    private Object[] parametersForArray667Test(){

        int[] array1 = new int[]{6,6,2};
        int[] array2 = new int[]{6,6,2,6};
        int[] array3 = new int[]{6,7,2,6};
        int[] array4 = new int[]{6,6,2,6,7};
        int[] array5 = new int[]{1,6,3};
        int[] array6 = new int[]{6,1};
        int[] array7 = new int[]{};
        int[] array8 = new int[]{3,6,7,6};
        int[] array9 = new int[]{3,6,6,7};
        int[] array10 = new int[]{6,3,6,6};
        int[] array11 = new int[]{6,7,6,6};
        int[] array12 = new int[]{1,2,3,5,6};
        int[] array13 = new int[]{1,2,3,6,6};

        return new Object[][]{
                {array1, 1},
                {array2, 1},
                {array3, 1},
                {array4, 2},
                {array5, 0},
                {array6, 0},
                {array7, 0},
                {array8, 1},
                {array9, 2},
                {array10, 1},
                {array11, 2},
                {array12, 0},
                {array13, 1}
        };
    }

    @Test
    @Parameters
    public void noTriplesTest(int[] nums, boolean expectedResult){
        //arrange

        //act
        boolean result = warmup2.noTriples(nums);

        //assert
        assertThat(result, is(equalTo(expectedResult)));
    }

    private Object[] parametersForNoTriplesTest(){

        int[] array1 = new int[]{1,2,2,1};
        int[] array2 = new int[]{1,1,2,2,2,1};
        int[] array3 = new int[]{1,1,1,2,2,2,1};
        int[] array4 = new int[]{1,1,2,2,1,2,1};
        int[] array5 = new int[]{1,2,1};
        int[] array6 = new int[]{1,1,1};
        int[] array7 = new int[]{1,1};
        int[] array8 = new int[]{1};
        int[] array9 = new int[]{};


        return new Object[][]{
                {array1, true},
                {array2, false},
                {array3, false},
                {array4, true},
                {array5, true},
                {array6, false},
                {array7, true},
                {array8, true},
                {array9, true},

        };
    }

    @Test
    @Parameters
    public void has271Test(int[] nums, boolean expectedResult){
        //arrange

        //act
        boolean result = warmup2.has271(nums);

        //assert
        assertThat(result, is(equalTo(expectedResult)));
    }

    private Object[] parametersForHas271Test(){

        int[] array1 = new int[]{1,2,7,1};
        int[] array2 = new int[]{1,2,8,1};
        int[] array3 = new int[]{2,7,1};
        int[] array4 = new int[]{3,8,2};
        int[] array5 = new int[]{2,7,3};
        int[] array6 = new int[]{2,7,4};
        int[] array7 = new int[]{2,7,-1};
        int[] array8 = new int[]{2,7,-2};
        int[] array9 = new int[]{4,3,8,0};
        int[] array10 = new int[]{2,7,5,10,4};
        int[] array11 = new int[]{2,7,-2,4,9,3};
        int[] array12 = new int[]{2,7,5,10,1};
        int[] array13 = new int[]{2,7,-2,4,10,2};

        return new Object[][]{
                {array1, true},
                {array2, false},
                {array3, true},
                {array4, true},
                {array5, true},
                {array6, false},
                {array7, true},
                {array8, false},
                {array9, true},
                {array10, true},
                {array11, true},
                {array12, false},
                {array13, false}
        };
    }
}
