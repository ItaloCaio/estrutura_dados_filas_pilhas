package implementacao2;



public class FilaComArray implements Fila_IF {

	
	private int array[] = new int[10];
	private int quant;
	private int cabeca = 0;
	private int rabo = 0;
	private int numDeElementos;
	int aux;

	
	@Override
	public void enqueue(int element) throws Exception {
		
		
		if (rabo == array.length) {
			rabo = 0;
			aux ++;
			
		}
		
		if( aux==0)
			array[rabo++] = element;
		else
		{
			array[rabo++] = element;
			cabeca++;
			if(cabeca == array.length)
				cabeca =0;
		}

		if (numDeElementos < array.length)
			numDeElementos++;


	}

	@Override
	public int dequeue() throws Exception {
		
		if(cabeca== array.length)
			cabeca = 0;
		
		int x = array[cabeca];
		
		if (isEmpty()) 
			throw new Exception("Buffer Vazio, não pode mais remover");
		
			array[cabeca] = 0;
			cabeca++;
			numDeElementos--;
	
	
		return x;
	}

	@Override
	public int head() throws Exception {
		// TODO Auto-generated method stub
		return array[cabeca];
	}

	@Override
	public boolean isEmpty() {
		
		return (numDeElementos == 0);
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		
			return (numDeElementos == 10);
	}

}
