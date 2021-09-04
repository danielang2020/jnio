package my;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 *
 * @program: jnio
 * @author: daniel
 * @create: 2021-09-04 14:19
 **/
public class BufferCompactDemo {
	public static void main(String[] args) {
		ByteBuffer bb = ByteBuffer.allocate(7);
		bb.put((byte) 20);
		bb.put((byte) 30);
		bb.put((byte) 40);

		System.out.println("Original ByteBuffer: " + Arrays.toString(bb.array()));

		System.out.println("Position: " + bb.position() + " limit: " + bb.limit());

		bb.flip();
		bb.get();
		ByteBuffer cbb = bb.compact();

		System.out.println("Flip then Compacted ByteBuffer: " + Arrays.toString(cbb.array()));

		System.out.println("Position: " + cbb.position() + " limit: " + cbb.limit());

		// putting the int to byte typecast value in compacted ByteBuffer
		cbb.put((byte) 50);

		System.out.println("Updated Compacted ByteBuffer: " + Arrays.toString(cbb.array()));
		System.out.println("Position: " + cbb.position() + " limit: " + cbb.limit());

		cbb.put((byte) 60);
		cbb.put((byte) 70);

		System.out.println("ByteBuffer: " + Arrays.toString(cbb.array()));
		bb.flip();
		bb.get();
		cbb = bb.compact();

		System.out.println("ByteBuffer: " + Arrays.toString(cbb.array()));

		System.out.println("Position: " + cbb.position() + " limit: " + cbb.limit());
	}
}
