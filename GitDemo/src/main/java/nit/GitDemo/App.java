package nit.GitDemo;

/**
 * Hello world!
 */
public class App {
	static int sum(int x, int y) {
		return x+y;
	}
	static int divition(int x, int y) {
		return x-y;
	}
	public static void main(String[] args) {
        System.out.println("Result : "+sum(15, 45));
        System.out.println("Result : "+divition(15, 45));
    }
}
