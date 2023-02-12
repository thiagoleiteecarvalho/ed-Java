import java.util.Stack;

/**
 * Exemplo de Pilha. 
 * @author Thiago Leite
 */
public class PilhaExemplo {

	public static void main(String[] args) {
		
		Stack<String> p = new Stack<>();
		
		p.push("F");
		p.push("L");
		p.push("A");
		
		System.out.println(p.search("F"));
		
		System.out.println(p.peek());
		
		System.out.println(p.pop());
		
		System.out.println(p.peek());
		
		System.out.println(p.size());
		
		System.out.println(p.empty());
		
		System.out.println(p.search("F"));
	}
}
