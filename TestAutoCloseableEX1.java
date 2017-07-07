package July07;

class ResouceCloseable implements AutoCloseable {

	public void close1() throws Exception {
		System.out.println("close");
	}

	@Override
	public void close() throws Exception {
		System.out.println("close2");
	}
}

public class TestAutoCloseableEX1 {

	public static void main(String[] args) {
		try (ResouceCloseable resource = new ResouceCloseable()) {
			resource.close1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
