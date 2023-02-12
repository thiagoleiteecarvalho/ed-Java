import java.util.ArrayList;

/**
 * Exemplo de Lista. 
 * @author Thiago Leite
 */
public class ListaExemplo {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<>();
		
		l.add("Fla");
		l.add("men");
		l.add("go");
		
		System.out.println(l.get(0));
		
		l.remove(1);
		l.remove(1);
		
		System.out.println(l.size());
		
		System.out.println(l.isEmpty());
	}
}
