import java.util.LinkedList;

/**
 * Exemplo de Fila. 
 * @author Thiago Leite
 */
public class FilaExemplo {

	public static void main(String[] args) {
		
		LinkedList<Integer> f = new LinkedList<>();
		
		f.add(2);
		f.add(6);
		f.add(8);
		
		System.out.println(f.peek());
		
		System.out.println(f.poll());
		
		System.out.println(f.size());
		
		System.out.println(f.isEmpty());
		
	}
}
