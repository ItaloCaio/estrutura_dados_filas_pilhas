package implementacao2;

public class FilaComArray implements Fila_IF {

	private int array[] = new int[10];
	private int quant;
	private int cabeca = 0;
	private int rabo = 0;
	private int numDeElementos;
	int aux;

	public static void main(String[] args) throws Exception {
		
		FilaComArray fila = new FilaComArray();
		System.out.println(fila.isEmpty());
		fila.enqueue(1);
		fila.enqueue(2);
		fila.enqueue(3);
		fila.enqueue(4);
		fila.enqueue(5);
		fila.enqueue(6);
		fila.enqueue(7);
		fila.enqueue(8);
		fila.enqueue(10);
		fila.enqueue(10);
		fila.enqueue(1);
		
		System.out.println(fila.isEmpty());
		for(int i=0; i <10; i++)
			System.out.println(fila.dequeue());

	}

	@Override
	public void enqueue(int element) throws Exception {

		if (rabo == array.length) {
			rabo = 0;
			aux++;

		}

		if (aux == 0)
			array[rabo++] = element;
		else {
			array[rabo++] = element;
			cabeca++;
			if (cabeca == array.length)
				cabeca = 0;
		}

		if (numDeElementos < array.length)
			numDeElementos++;

	}

	@Override
	public int dequeue() throws Exception {

		if (cabeca == array.length)
			cabeca = 0;

		if (isEmpty()) {
			throw new Exception("Buffer Vazio, não pode mais remover");
		} else {
			int x = array[cabeca];
			array[cabeca] = 0;
			cabeca++;
			numDeElementos--;

			return x;
		}

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
