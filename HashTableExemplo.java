import java.util.HashMap;
import java.util.Iterator;

/**
 * Exemplo de HashTable.
 * 
 * @author Thiago Leite
 */
public class HashTableExemplo {

	public static void main(String[] args) {

		HashMap<String, Integer> m = new HashMap<>();

		m.put("Brasil", 5);
		m.put("Alemanha", 4);
		m.put("Italia", 4);
		m.put("Argentina", 2);
		m.put("França", 2);
		m.put("Uruguai", 2);
		m.put("Inglaterra", 1);
		m.put("Espanha", 1);

		System.out.println(m.containsKey("Brasil"));

		System.out.println(m.containsValue(10));

		System.out.println(m.get("Alemanha"));

		System.out.println(m.get("Argentina"));
		m.put("Argentina", 3);
		System.out.println(m.get("Argentina"));

		m.remove("Argentina");

		System.out.println(m.size());

		System.out.println(m.isEmpty());

		// Pelos valores
		for (Iterator<Integer> i = m.values().iterator(); i.hasNext();) {
			Integer valor = i.next();
			System.out.println(valor);
		}

		// Pelas chaves
		for (Iterator<String> i = m.keySet().iterator(); i.hasNext();) {
			String chave = i.next();
			System.out.println(chave);
		}

	}
}
