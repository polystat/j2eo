public class PatternParenthExpr {
	public static void main(String[] args) {
		Sup s1 = new Some();
		Sup s2 = new SomeOther();
		if (s1 instanceof ISome some) {
			System.out.println(some.getSome());
		}
		if (s2 instanceof ISome some) {
			System.out.println(some.getSome());
		}
	}
}
interface ISome {
	public String getSome();
}
interface ISomeOther {
	public String getSome();
}
class Sup {}
class Some extends Sup implements ISome {
	@Override
	public String getSome() { return "passed"; }
}
class SomeOther extends Sup implements ISomeOther{
	@Override
	public String getSome() { return "not passed"; }
}
