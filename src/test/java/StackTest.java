import junit.framework.TestCase;
import org.stack.Stack;

public class StackTest extends TestCase {

    Stack stack = new Stack(5);

    public void testPush_Value_ValueAddedToStack() {
        String value = "test123";

        stack.push(value);

        var result = stack.pick();
        assertEquals(value, result);
    }

    public void testPick_Value_TopPicked() {
        String value = "top";
        stack.push(value);

        var result = stack.pick();
        assertEquals(result, stack.getTopValue());
    }

    public void testPop_Value_IsRemoved() {
        String str1 = "1";
        String str2 = "2";
        stack.push(str1);
        stack.push(str2);

        stack.pop();

        assertEquals(str1, stack.getTopValue());
    }

    public void testIsFull_Stack_True() {
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");

        var result = stack.isFull();
        assertTrue(result);
    }

    public void testIsEmpty_Stack_True() {
        var result = stack.isEmpty();
        assertTrue(result);
    }


}
