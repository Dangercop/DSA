

public class recursionApplication{

	static void towerOfHanoi(char sou, char dest, char aux, int n)
	{
	
		if(n == 1){
		
		System.out.println("Move disk from "
							+ sou
							+" to "
							+  dest);
		}
		else {
		towerOfHanoi(sou,aux,dest, n-1);
		towerOfHanoi(sou,dest,aux, 1);
		towerOfHanoi(aux,dest,sou, n-1);
		}
	}
	
	public static void main(String args[]){
	
	int diskNo = 4;
	towerOfHanoi('A', 'B', 'C', diskNo);
	
	}

}