package my;

import java.nio.IntBuffer;

/**
 *
 * @program: jnio
 * @author: daniel
 * @create: 2021-09-04 11:30
 **/
public class BufferFlipDemo {
	public static void main(String[] args) {
		IntBuffer allocate = IntBuffer.allocate(3);
		allocate.put(1);
		allocate.put(1);
		allocate.put(1);
		//before flip capacity=3 limit=3 position=3
		System.out.println("before flip capacity=" + allocate.capacity() + " limit=" + allocate.limit() + " position=" + allocate.position());
		allocate.flip();
		//after one flip capacity=3 limit=3 position=0
		System.out.println("after one flip capacity=" + allocate.capacity() + " limit=" + allocate.limit() + " position=" + allocate.position());
		allocate.flip();
		//after one flip capacity=3 limit=0 position=0
		System.out.println("after one flip capacity=" + allocate.capacity() + " limit=" + allocate.limit() + " position=" + allocate.position());
		allocate.get();//throw BufferUnderflowException

	}
}
