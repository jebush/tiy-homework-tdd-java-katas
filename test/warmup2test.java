import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by rush on 8/24/16.
 */

//@RunWith(JUnitParamsRunner.class)
public class warmup2test {

    @Test
  //  @Parameterized.Parameters(method = "adultValues")
    public void personIsAdult(int age, boolean valid) throws Exception {
 //       assertEquals(valid, new Person(age).isAdult());
    }

    private Object[] adultValues() {
        return new Object[]{
                new Object[]{13, false},
                new Object[]{17, false},
                new Object[]{18, true},
                new Object[]{22, true}
        };
    }
    @Test
    public void stringTimesTest(){
        //arrange

        //act

        //assert
       // assertThat();
    }

}
