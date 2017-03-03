package implementacao2;

public class PilhaComArray implements Pilha_IF {

	
	private int array[] = new int[10];
	private int numElementos =0;
	private int k= 0;
	
	@Override
	public void push(int element) throws Exception {
	
		if(numElementos<10){
			
			array[k] = element;
			k++;
			
		}else
			throw new Exception("Pilha Cheia");
		
		

	}

	@Override
	public int pop() throws Exception {
		
		
		
		if(isEmpty())
			throw new Exception("Buffer Vazio, não pode mais remover");
		
		int aux = array[k-1];
		
		array[k-1]=0;
		k--;
		
		

		return aux;
	}

	@Override
	public int top() throws Exception {
		// TODO Auto-generated method stub
		return array[k-1];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (k == 0);
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return (numElementos== 10);
	}

}
