import java.util.HashSet;
import java.util.Iterator;

/**
 * Exemplo de Set.
 * @author Thiago Leite
 */
public class SetExemplo {

	public static void main(String[] args) {

		HashSet<Integer> s = new HashSet<>();

		s.add(1980);
		s.add(1981);
		s.add(1982);
		s.add(1983);
		s.add(1981);
		s.add(2009);

		System.out.println(s.size());

		System.out.println(s.contains(1992));

		s.remove(2009);

		System.out.println(s.size());

		System.out.println(s.isEmpty());

		for (Iterator<Integer> iterator = s.iterator(); iterator.hasNext();) {
			Integer elemento = iterator.next();
			System.out.println(elemento);
		}
	}
}
