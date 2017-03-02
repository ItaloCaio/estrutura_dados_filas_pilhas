package implementacao2;

public class FilaComArray implements Fila_IF {

	
	private int array[] = new int[10];
	private int posiction = 0;
	
	@Override
	public void enqueue(int element) throws Exception {
		
		
		
		if(posiction <10){
			
			array[posiction] = element;
			
			posiction++;
		}
		

	}

	@Override
	public int dequeue() throws Exception {
		
		int aux = array[posiction];
		
		if(!isEmpty()){
			
			array[posiction] = 0;
			
			posiction --;
		}
		
		
		return aux;
	}

	@Override
	public int head() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		
		if(posiction >1)
		return false;
		else
			return true;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if(posiction ==10)
			return true;
		else 
			return false;
	}

}
