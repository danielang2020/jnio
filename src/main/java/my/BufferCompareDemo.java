package my;

import java.nio.CharBuffer;
import java.util.Arrays;

/**
 *
 * @program: jnio
 * @author: daniel
 * @create: 2021-09-04 15:10
 **/
public class BufferCompareDemo {
	public static void main(String[] args) {
		CharBuffer cb1 = CharBuffer.allocate(11);
		cb1.put('d');
		cb1.put('o');
		cb1.put('t');
		cb1.put('c');
		cb1.put('o');
		cb1.put('m');
		cb1.put(' ');
		cb1.put('j');
		cb1.put('o');
		cb1.put('b');
		CharBuffer cb2 = CharBuffer.allocate(8);
		cb2.put('c');
		cb2.put('o');
		cb2.put('m');
		cb2.put('3');
		cb2.put('d');
		cb2.put('y');
		cb2.put(' ');

		cb1.position(3);
		cb1.limit(6);

		System.out.println("cb1 = " + Arrays.toString(cb1.array()) + " " + cb1.get() + " " + cb1.get() + " " + cb1.get());

		cb2.position(0);
		cb2.limit(3);
		System.out.println("cb2 = " + Arrays.toString(cb2.array()) + " " + cb2.get() + " " + cb2.get() + " " + cb2.get());

		System.out.println("compare " + cb1.compareTo(cb2));
	}
}
