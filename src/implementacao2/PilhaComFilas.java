package implementacao2;

public class PilhaComFilas implements Pilha_IF {

	Fila_IF minhaFila1 = new FilaComArray();
	Fila_IF minhaFila2 = new FilaComArray();
	
	
	@Override
	public void push(int element) throws Exception {
	
		minhaFila1.enqueue(element);

	}

	@Override
	public int pop() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int top() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

}
