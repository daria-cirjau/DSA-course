import com.example.ContainsDuplicate;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContainsDuplicateTest {
    @Test
    public void testEmptyArray() {
        ContainsDuplicate containsDuplicateObj = new ContainsDuplicate();
        int[] array = {};
        assertFalse(containsDuplicateObj.containsDuplicate(array));
    }
    @Test
    public void testOneElementArray() {
        ContainsDuplicate containsDuplicateObj = new ContainsDuplicate();
        int[] array = {1};
        assertFalse(containsDuplicateObj.containsDuplicate(array));
    }

    @Test
    public void testOnlyOneDuplicate() {
        ContainsDuplicate containsDuplicateObj = new ContainsDuplicate();
        int[] array = {1, 2, 3, 4, 1};
        assertTrue(containsDuplicateObj.containsDuplicate(array));
    }
    @Test
    public void testMultipleDuplicate() {
        ContainsDuplicate containsDuplicateObj = new ContainsDuplicate();
        int[] array = {1, 2, 3, 4, 1, 4};
        assertTrue(containsDuplicateObj.containsDuplicate(array));
    }
}
