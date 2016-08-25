import org.junit.Test;
import java.util.HashMap;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * Created by rush on 8/24/16.
 */
public class Map1Test {
    //MapBully Tests
    @Test
     /**
      *Tests that b takes from a when a has a value
      */
    public void bTakesAWhenItHasAValue() {
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "candy");
        map.put("b", "dirt");
        //Act
        Map1.mapBully(map);
        //Assert
        assertThat(map.get("a"), is(equalTo("")));
        assertThat(map.get("b"), is(equalTo("candy")));
    }

    @Test
    /**
     *Tests that b Even When Not Present takes from a when a has a value
     */
    public void bEvenWhenNotPresentTakesAWhenItHasAValue() {
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "candy");
        //Act
        Map1.mapBully(map);
        //Assert
        assertThat(map.get("a"), is(equalTo("")));
        assertThat(map.get("b"), is(equalTo("candy")));
    }

    @Test
    /**
     *Tests that b takes from a when a has a value And Leaves Other Value Alone
     */
    public void bTakesAWhenItHasAValueAndLeavesOtherValueAlone() {
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "candy");
        map.put("b", "dirt");
        map.put("c", "meh");
        //Act
        Map1.mapBully(map);
        //Assert
        assertThat(map.get("a"), is(equalTo("")));
        assertThat(map.get("b"), is(equalTo("candy")));
        assertThat(map.get("c"), is(equalTo("meh")));
    }

    @Test
    /**
     *Tests that b stays the same when there is no others
     */
    public void bStaysTheSameWhenAIsNotPresent() {
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("b", "carrot");

        //Act
        Map1.mapBully(map);
        //Assert
        assertThat(map.get("b"), is(equalTo("carrot")));

    }

    @Test
    /**
     *Tests When b is not present nothing will happen
     */
    public void cOrAnyOtherThatIsNotB() {
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("c", "meh");

        //Act
        Map1.mapBully(map);
        //Assert
        assertThat(map.get("c"), is(equalTo("meh")));

    }

    @Test
    /**
     *Tests When b is not present but a is, b will take A
     */
    public void bSneaksInToGetA() {
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("c", "meh");
        map.put("a", "sparkle");

        //Act
        Map1.mapBully(map);
        //Assert
        assertThat(map.get("a"), is(equalTo("")));
        assertThat(map.get("b"), is(equalTo("sparkle")));
        assertThat(map.get("c"), is(equalTo("meh")));

    }

    //
    //These are MapShare Test
    //
    @Test
    /**
     *
     */
    public void takeAAndTransferToBAndDropC(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("b", "bbb");
        map.put("c", "ccc");
        map.put("a", "aaa");
        //Act
        Map1.mapShare(map);
        //Assert
        assertThat(map.get("a"), is(equalTo("aaa")));
        assertThat(map.get("b"), is(equalTo("aaa")));
        assertThat(map.get("c"), is(equalTo(null)));
    }

    @Test
    /**
     *
     */
    public void bIsHereDropC(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("b", "xyz");
        map.put("c", "ccc");
        //Act
        Map1.mapShare(map);
        //Assert
        assertThat(map.get("b"), is(equalTo("xyz")));
        assertThat(map.get("c"), is(equalTo(null)));
    }

    @Test
    /**
     *
     */
    public void bIsNotHereButCreateITAndSetToAAndDropC(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("d", "hi");
        map.put("c", "meh");
        map.put("a", "aaa");
        //Act
        Map1.mapShare(map);
        //Assert
        assertThat(map.get("a"), is(equalTo("aaa")));
        assertThat(map.get("b"), is(equalTo("aaa")));
        assertThat(map.get("c"), is(equalTo(null)));
        assertThat(map.get("d"), is(equalTo("hi")));
    }

    @Test
    /**
     *
     */
    public void aEqualToBDropC(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("b", "1234");
        map.put("c", "yo");
        map.put("a", "xyz");
        map.put("z", "zzz");
        //Act
        Map1.mapShare(map);
        //Assert
        assertThat(map.get("a"), is(equalTo("xyz")));
        assertThat(map.get("b"), is(equalTo("xyz")));
        assertThat(map.get("c"), is(equalTo(null)));
        assertThat(map.get("z"), is(equalTo("zzz")));
    }

    @Test
    /**
     *
     */
    public void bCreatedToMatchADropCLeaveOthers(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("d", "ddd");
        map.put("e", "everything");
        map.put("b", "1234");
        map.put("c", "yo");
        map.put("a", "xyz");
        //Act
        Map1.mapShare(map);
        //Assert
        assertThat(map.get("a"), is(equalTo("xyz")));
        assertThat(map.get("b"), is(equalTo("xyz")));
        assertThat(map.get("c"), is(equalTo(null)));
        assertThat(map.get("d"), is(equalTo("ddd")));
        assertThat(map.get("e"), is(equalTo("everything")));
    }

    //
    //MapAB
    //
    @Test
    /**
     *
     */
    public void connectAAndB(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");

        //Act
        Map1.mapAB(map);
        //Assert
        assertThat(map.get("a"), is(equalTo("Hi")));
        assertThat(map.get("b"), is(equalTo("There")));
        assertThat(map.get("ab"), is(equalTo("HiThere")));

    }

    @Test
    /**
     *
     */
    public void onlyAPresentReturnIt(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "Hi");


        //Act
        Map1.mapAB(map);
        //Assert
        assertThat(map.get("a"), is(equalTo("Hi")));

    }

    @Test
    /**
     *
     */
    public void onlyBPresentReturnIt(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("b", "There");

        //Act
        Map1.mapAB(map);
        //Assert

        assertThat(map.get("b"), is(equalTo("There")));

    }

    @Test
    /**
     *
     */
    public void onlyCDoesNotMatterItWillBeReturned(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("c", "meh");

        //Act
        Map1.mapAB(map);
        //Assert
        assertThat(map.get("c"), is(equalTo("meh")));

    }



    @Test
    /**
     *
     */
    public void manyKeysHereButWillReturnAAndBAsAB(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "ccc");
        map.put("ab", "nope");

        //Act
        Map1.mapAB(map);
        //Assert
        assertThat(map.get("a"), is(equalTo("aaa")));
        assertThat(map.get("b"), is(equalTo("bbb")));
        assertThat(map.get("c"), is(equalTo("ccc")));
        assertThat(map.get("ab"), is(equalTo("aaabbb")));

    }

    @Test
    /**
     *
     */
    public void ABPresentButAIsNotSoReturnAllAsInput(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("b", "bbb");
        map.put("c", "ccc");
        map.put("ab", "nope");

        //Act
        Map1.mapAB(map);
        //Assert
        assertThat(map.get("b"), is(equalTo("bbb")));
        assertThat(map.get("c"), is(equalTo("ccc")));
        assertThat(map.get("ab"), is(equalTo("nope")));

    }


    //
    //topping1
    //
    @Test
    /**
     *
     */
    public void iceCreamNeedsItCherryLikeBreadNeedsButter(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("ice cream", "peanuts");


        //Act
        Map1.topping1(map);
        //Assert
        assertThat(map.get("ice cream"), is(equalTo("cherry")));
        assertThat(map.get("bread"), is(equalTo("butter")));


    }

    @Test
    /**
     *
     */
    public void nothingInHashMapReturnBreadButter(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();

        //Act
        Map1.topping1(map);
        //Assert
        assertThat(map.get("bread"), is(equalTo("butter")));

    }

    @Test
    /**
     *
     */
    public void hasValueButNotIceCreamSoJustPutBreadButterPlusExisting(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("pancakes", "syrup");

        //Act
        Map1.topping1(map);
        //Assert
        assertThat(map.get("bread"), is(equalTo("butter")));
        assertThat(map.get("pancakes"), is(equalTo("syrup")));

    }

    @Test
    /**
     *Tdfa
     */
    public void thisChangesIceCreamAndBread(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("ice cream", "strawberries");
        map.put("bread", "dirt");

        //Act
        Map1.topping1(map);
        //Assert
        assertThat(map.get("bread"), is(equalTo("butter")));
        assertThat(map.get("ice cream"), is(equalTo("cherry")));

    }

    @Test
    /**
     *Tdfa
     */
    public void thisHasIceCreamandBreadToChange(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("ice cream", "strawberries");
        map.put("bread", "jam");
        map.put("salad", "oil");

        //Act
        Map1.topping1(map);
        //Assert
        assertThat(map.get("bread"), is(equalTo("butter")));
        assertThat(map.get("ice cream"), is(equalTo("cherry")));
        assertThat(map.get("salad"), is(equalTo("oil")));

    }

    //
    //Topping2
    //
    @Test
    /**
     *
     */
    public void iceCreamPresentYogurtWillAppear(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("ice cream", "cherry");

        //Act
        Map1.topping2(map);
        //Assert
        assertThat(map.get("yogurt"), is(equalTo("cherry")));
        assertThat(map.get("ice cream"), is(equalTo("cherry")));

    }

    @Test
    /**
     *
     */
    public void iceCreamPresentYogurtWillAppearSpinachChangedToNuts(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("ice cream", "cherry");
        map.put("spinach", "dirt");

        //Act
        Map1.topping2(map);
        //Assert
        assertThat(map.get("yogurt"), is(equalTo("cherry")));
        assertThat(map.get("ice cream"), is(equalTo("cherry")));
        assertThat(map.get("spinach"), is(equalTo("nuts")));

    }

    @Test
    /**
     *
     */
    public void yogurtPresentOnlyStaysSame(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("yogurt", "salt");


        //Act
        Map1.topping2(map);
        //Assert
        assertThat(map.get("yogurt"), is(equalTo("salt")));

    }

    @Test
    /**
     *
     */
    public void yogurtPresentBreadPresentStaysSame(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("yogurt", "salt");
        map.put("bread", "butter");


        //Act
        Map1.topping2(map);
        //Assert
        assertThat(map.get("yogurt"), is(equalTo("salt")));
        assertThat(map.get("bread"), is(equalTo("butter")));

    }

    @Test
    /**
     *
     */
    public void nothingPresent(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();


        //Act
        Map1.topping2(map);
        //Assert
        assertThat(map.get(""), is(nullValue()));

    }

    @Test
    /**
     *
     */
    public void iceCreamHerePlusSaladYogurtWillAppear(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("ice cream", "air");
        map.put("salad", "oil");


        //Act
        Map1.topping2(map);
        //Assert
        assertThat(map.get("yogurt"), is(equalTo("air")));
        assertThat(map.get("ice cream"), is(equalTo("air")));
        assertThat(map.get("salad"), is(equalTo("oil")));

    }

    //
    //Topping3
    //

    @Test
    /**
     *
     */
    public void potatoHereFriesComesIn(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("potato", "ketchup");

        //Act
        Map1.topping3(map);
        //Assert
        assertThat(map.get("potato"), is(equalTo("ketchup")));
        assertThat(map.get("fries"), is(equalTo("ketchup")));

    }

    @Test
    /**
     *
     */
    public void potatoHereFriesComesInTakesButterToo(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("potato", "butter");

        //Act
        Map1.topping3(map);
        //Assert
        assertThat(map.get("potato"), is(equalTo("butter")));
        assertThat(map.get("fries"), is(equalTo("butter")));

    }

    @Test
    /**
     *
     */
    public void potatoHereFriesComesInSaladHereSpinachComesIn(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("potato", "ketchup");
        map.put("salad", "oil");

        //Act
        Map1.topping3(map);
        //Assert
        assertThat(map.get("potato"), is(equalTo("ketchup")));
        assertThat(map.get("fries"), is(equalTo("ketchup")));
        assertThat(map.get("salad"), is(equalTo("oil")));
        assertThat(map.get("spinach"), is(equalTo("oil")));

    }

    @Test
    /**
     *
     */
    public void potatoHereFriesComesInSaladHereSpinachComesInPlusToast(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("potato", "ketchup");
        map.put("salad", "oil");
        map.put("toast", "butter");

        //Act
        Map1.topping3(map);
        //Assert
        assertThat(map.get("potato"), is(equalTo("ketchup")));
        assertThat(map.get("fries"), is(equalTo("ketchup")));
        assertThat(map.get("salad"), is(equalTo("oil")));
        assertThat(map.get("spinach"), is(equalTo("oil")));
        assertThat(map.get("toast"), is(equalTo("butter")));

    }

    @Test
    /**
     *
     */
    public void nothingToShow(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();

        //Act
        Map1.topping3(map);
        //Assert
        assertThat(map, is(map));


    }

    @Test
    /**
     *
     */
    public void SaladHereSpinachComesInPlusFries(){
        //Arrange
        HashMap<String, String> map = new HashMap<>();
        map.put("salad", "pepper");
        map.put("fries", "salt");

        //Act
        Map1.topping3(map);
        //Assert
        assertThat(map.get("fries"), is(equalTo("salt")));
        assertThat(map.get("salad"), is(equalTo("pepper")));
        assertThat(map.get("spinach"), is(equalTo("pepper")));

    }









}
