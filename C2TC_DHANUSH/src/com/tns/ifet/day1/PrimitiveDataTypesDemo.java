package com.tns.ifet.day1;

public class PrimitiveDataTypesDemo {
public static void main(String[] args) {
	byte byteMax=127;
	byte byteMin=-128;
	System.out.println("Min range of byte is" +byteMin+" Max range of byte is "+byteMax);
	short shortMax=32767;
	short shortMin=-32768;
	System.out.println("Min short range of byte is" +shortMin+" Max short range of byte is "+shortMax);
	int maxInt=2147483647;
	int minInt=-2147483648;
	System.out.println("Min int range of byte is"+minInt+" Max int range of byte is"+maxInt); 
	long maxLong=9223372036854775807L;
	long minLong=-9223372036854775808L;
	System.out.println("Min long range of byte is"+minLong+" Max long range of byte is "+maxLong);
	float f=3234.141243278345f;
	double d=3456.14124512345678902345678914f;
	System.out.println("float value is "+f+" double value is "+d);
	boolean flag=false;
	System.out.println("boolean value is "+flag);
}
}
