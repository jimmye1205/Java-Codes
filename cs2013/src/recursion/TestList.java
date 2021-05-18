package recursion;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
class TestList {
	@Test
	public void test() {
		RecursionList test = new RecursionList();
		ArrayList<String> hello = new ArrayList<String>();
		hello.add("hello");
		hello.add("my");
		hello.add("name");
		hello.add("is");
		hello.add("Jimmy Hernandez");
		int output = test.longest(hello);
		assertEquals(15, output);
	}
}
