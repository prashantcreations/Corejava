
public class ExceptionExample {
	public static void main(String arg[]) {
		
		getData();
	}

	private static int getData() {
		try {
			return 0;
		}catch(Exception ex) {
			return 0;
		}finally {
			System.out.println("in finally");
		}
		
		
	}

}
