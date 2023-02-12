/**
 * Exemplos de vetores e matrizes. 
 * @author Thiago Leite
 */
public class VetorMatrizExemplo {

	public static void main(String[] args) {
		
		
		int[] v = new int[5];
		int[][] m = new int[5][5];
		
		int[] v1 = {10,25};
		int[] v2 = new int[] {1,2,3};
		int[][] m1 = new int[][] {{1,2},{3,4}};
		int[][] m2 = {{5,6},{7,8}};
		int[][][] m3 = new int[][][] {{{1,2},{3,4}}, {{5,6},{7,8}}};
		int[][][] m4 = {{{9,10},{11,12}}, {{13,14},{15,16}}};
		
		v[0] = 70;
		v[3] = 45;
		m[0][0]= 65;
		m[3][2]= 17;
		
		int iV = v[0];
		int iM = m[0][0];
		System.out.println(iV);
		System.out.println(iM);
		
		System.out.println(v.length);
		System.out.println(m.length);
		
		System.out.println(m[0].length + m[1].length + m[2].length + m[3].length + m[4].length);
	}
}
