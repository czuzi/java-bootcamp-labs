package primitivetypes;

import java.io.InterruptedIOException;

public class PrimitiveTypesMain {
	public static void main(String[] args) {

		int a = 2;
		Integer b = 2;
		Integer c = a;
		Integer d = b;
		Integer e = new Integer("2");
		int f = new Integer(2);
		int g = new Integer(a);
		int h = new Integer(c);
		int i = Integer.parseInt("2");
		Integer j = Integer.parseInt("2");
		boolean k = true;
		Boolean l = true;
		boolean m = new Boolean(true);
		Boolean n = new Boolean(true);
		boolean o = Boolean.parseBoolean("TrUe");
		Boolean p = Boolean.parseBoolean("TrUe");
		boolean q = Boolean.parseBoolean("TreU");
		Boolean r = Boolean.parseBoolean("TreU");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
	}
}
