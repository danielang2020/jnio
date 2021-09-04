package my;

import java.nio.IntBuffer;

/**
 *
 * @program: jnio
 * @author: daniel
 * @create: 2021-09-04 10:30
 **/
public class BufferDemo {
	public static void main(String[] args) {
		IntBuffer allocate = IntBuffer.allocate(2);
		allocate.put(1);
		allocate.put(1);
		allocate.put(1);// throw BufferOverflowException
		allocate.get(new int[100]);// throw BufferUnderflowException
		allocate.get(100);// throw IndexOutOfBoundsException
	}
}
