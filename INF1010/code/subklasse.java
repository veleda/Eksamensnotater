class A {
	int a;

	A (int a) {
		this.a = a;
	}
}

class B extends A {
	int b;

	B (int a, int b) {
		super(a);
		this.b = b;
	}
}

class C extends B {
	int c;

	C (int a, int b, int c) {
		
		// Vil finne konstruktoren i B, og saa titte paa A sin.
		// Siden B har to parametere, saa velger den B sin konstruktor,
		// men vi faar med begge variablene vi vil ha.
		
		super(a, b);
		this.c = c;
	}
}
