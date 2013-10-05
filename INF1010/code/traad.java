import java.util.Random;

class Traader {
	public static void main(String[] args) {
		// thread-klassen mekkes av nytt objekt (Random-objekt) med parameter navn = one.
		Thread t1 = new Thread ( new Random("one") );
		Thread t2 = new Thread ( new Random("two") );
		Thread t3 = new Thread ( new Random("three") );

		// naar man kaller paa start(), vil den hoppe direkte til run().
		t1.start();
		t2.start();
		t3.start();
	}
}

class Random implements Runnable {
	String navn;
	int tid;
	Random r = new Random();

	Traader(String s) {
		name = s;
		// tiden vil vaere mellom 0 og 999 milisekunder.
		tid = r.nextInt(999);
	}

	public void run() {
		try {
			System.out.println(name + " is sleeping for " + time);
			Thread.sleep(time);
			System.out.println(name + " is done " + name);
		} catch (Exception e) {. . .}
	}
}
