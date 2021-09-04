package my;

import java.nio.IntBuffer;
import java.util.Arrays;

/**
 *
 * @program: jnio
 * @author: daniel
 * @create: 2021-09-04 16:09
 **/
public class BufferBulkDemo {
	public static void main(String[] args) {
		IntBuffer ib = IntBuffer.allocate(3);
		ib.put(1);
		ib.put(2);
		ib.put(3);
		int[] ints = new int[4];
		ib.flip();
//		ib.get(ints);// throw BufferUnderflowException
		ib.get(ints, 0, 3);
		System.out.println(Arrays.toString(ints));
	}
}
