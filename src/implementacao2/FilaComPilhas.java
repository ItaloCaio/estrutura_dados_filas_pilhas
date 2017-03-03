package implementacao2;

public class FilaComPilhas implements Fila_IF {

	Pilha_IF minhaPilha1 = new PilhaComArray();
	Pilha_IF minhaPilha2 = new PilhaComArray();
	private int numElementos = 0;

	@Override
	public void enqueue(int element) throws Exception {

		minhaPilha1.push(element);
		numElementos++;

	}

	@Override
	public int dequeue() throws Exception {

		while (!minhaPilha1.isEmpty()) {

			minhaPilha2.push(minhaPilha1.pop());

		}
		int aux = minhaPilha2.pop();

		while (!minhaPilha2.isEmpty())
			minhaPilha1.push(minhaPilha2.pop());

		numElementos--;

		return aux;
	}

	@Override
	public int head() throws Exception {
		// TODO Auto-generated method stub

		while (!minhaPilha1.isEmpty()) 
			minhaPilha2.push(minhaPilha1.pop());
		
		int aux = minhaPilha2.top();
		
		while (!minhaPilha2.isEmpty())
			minhaPilha1.push(minhaPilha2.pop());
		
		
		
		
		
		return aux;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (numElementos == 0);
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return (numElementos == 10);
	}

}
