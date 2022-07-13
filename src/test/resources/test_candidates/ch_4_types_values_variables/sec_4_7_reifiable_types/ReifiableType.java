import java.util.ArrayList;
import java.util.List;

public class ReifableType {
	public static void main(String[] args) {
		addAll(new ArrayList<String>(),
               "Leonardo da Vinci",
               "Vasco de Gama"
       );
       addAll(new ArrayList<Pair<String, String>>(),
               new Pair<String, String>("Leonardo", "da Vinci"),
               new Pair<String, String>("Vasco", "de Gama")
       );
		System.out.println("passed");
	}
	@SafeVarargs
	static <E> void addAll(List<E> list, E... array) {
       for (E element : array) {
		   System.out.println(element);
           list.add(element);
       }
   }
}
class Pair<T,K> {
	T valT;
	K valK;
	Pair(T valT, K valK) {
		this.valT = valT;
		this.valK = valK;
	}
	@Override
	public String toString() {
		return valT.toString() + ", " + valK.toString();
	}
}
