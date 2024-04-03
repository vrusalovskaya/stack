import junit.framework.TestCase;
import org.stack.Stack;
import org.stack.StackIsEmptyException;
import org.stack.StackLL;

public class StackTest extends TestCase {

    Stack<String> stack = new Stack<>(String.class);

    public void testPush_Value_ValueAddedToStack() throws StackIsEmptyException {
        String value = "test123";

        stack.push(value);

        var result = stack.pick();
        assertEquals(value, result);
    }

    public void testPick_Value_TopPicked() throws StackIsEmptyException {
        String value = "top";
        stack.push(value);

        var result = stack.pick();

        assertEquals(result, value);
    }

    public void testPop_2ValuesPushed_LastPushedValueReturned() throws StackIsEmptyException {
        String str1 = "1";
        String str2 = "2";
        stack.push(str1);
        stack.push(str2);

        var result = stack.pop();

        assertEquals(str2, result);
    }

    public void testPop_ValuePushed_StackIsEmpty() throws Exception {
        stack.push("Value");

        stack.pop();

        assertTrue(stack.isEmpty());
    }

    public void testIsEmpty_Stack_True() {
        var result = stack.isEmpty();
        assertTrue(result);
    }


}
