/**
 * Created by Леночка on 10.09.2016.
 */
import org.junit.Assert;
import org.junit.Test;

public class GetCountTest {
    @Test
    public void numberExists(){
        int[] array = {2, 4, 5, 6, 2, 4, 3, 9, 9, 2};
        int value = 9;
        Assert.assertNotEquals(0, GetCountTask.getCount(array,value));
    }

    @Test
    public void numberDoesNotExist(){
        int[] array = {2, 4, 5, 6, 2, 4, 3, 9, 9, 2};
        int value = 7;
        Assert.assertEquals(0, GetCountTask.getCount(array,value));
    }

    @Test
    public void numberExistsOneTimeOnly(){
        int[] array = {2, 4, 5, 6, 2, 4, 3, 9, 9, 2};
        int value = 5;
        Assert.assertEquals(1, GetCountTask.getCount(array,value));
    }

    @Test
    public void numberExistsNTimes(){
        int[] array = {2, 4, 5, 6, 2, 4, 3, 9, 9, 2};
        int value = 9;
        int count = 2;
        Assert.assertEquals(count, GetCountTask.getCount(array,value));
    }
}


