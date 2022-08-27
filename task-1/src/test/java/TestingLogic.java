import org.junit.Assert;
import org.junit.Test;

import static ru.smirnov.Main.*;

public class TestingLogic {
    @Test
    public void TestingLogicFromAverageMethod(){
        int[][] array = {{13,6},{33,76}};
        Assert.assertEquals(32,average(array),0);
    }
    @Test
    public void TestingLogicFromMaxNumberMethod(){
        int[][] array = {{13,6},{33,76}};
        Assert.assertEquals(76,maxNumber(array),0);
    }
    @Test
    public void TestingLogicFromMinNumberMethod(){
        int[][] array = {{13,6},{33,76}};
        Assert.assertEquals(6,minNumber(array),0);
    }
}

