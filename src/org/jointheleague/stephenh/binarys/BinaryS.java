package org.jointheleague.stephenh.binarys;

public class BinaryS {
    public static void main(String[] args) {
	boolean signed = Boolean.parseBoolean(args[0]);
	byte[] bytes = new byte[args.length - 1];
	    for (int i = 0; i < bytes.length; i++) {
		bytes[i] = (byte) Integer.parseInt(args[i + 1]);
	    }
	int readByte = readSignedByte(bytes);
	System.out.println(readByte);
    }

    public static int readSignedByte(byte[] bytes) {
	assert bytes != null && bytes.length == 1;
	return (int) bytes[0];
    }

    public static int readUnsignedByte(byte[] bytes) {
	assert bytes != null && bytes.length == 1;
	return  bytes[0] & 0xFF;
    }
}