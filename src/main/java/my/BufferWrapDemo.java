package my;

import java.nio.IntBuffer;

/**
 *
 * @program: jnio
 * @author: daniel
 * @create: 2021-09-04 16:47
 **/
public class BufferWrapDemo {
	public static void main(String[] args) {
//		int[] ints = {1, 2, 3};
//		IntBuffer intBuffer = IntBuffer.wrap(ints);
//		System.out.println(intBuffer.get());
//		ints[1] = 10;
//		System.out.println(intBuffer.get());
//		intBuffer.put(0, 100);
//		System.out.println(ints[0]);

		int[] ints1 = {1, 2, 3, 4};
		IntBuffer intBuffer1 = IntBuffer.wrap(ints1, 1, 2);
		System.out.println(intBuffer1.get());
		ints1[2] = 10;
		System.out.println(intBuffer1.get());
		intBuffer1.put(0, 100);
		System.out.println(ints1[0]);
	}
}
