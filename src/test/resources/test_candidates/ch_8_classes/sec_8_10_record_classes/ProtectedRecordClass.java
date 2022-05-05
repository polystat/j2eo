public class ProtectedRecordClass {
	public static void main(String[] args) {
		Person p = new Person("Mike", "Innopolis");
		System.out.println(p.name());
		System.out.println(p.address());
		System.out.println("passed");
	}
	protected static record Person (String name, String address) {}
}
