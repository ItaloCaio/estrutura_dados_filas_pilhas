package implementacao2;

public class PilhaComFilas implements Pilha_IF {

	Fila_IF minhaFila1 = new FilaComArray();
	Fila_IF minhaFila2 = new FilaComArray();

	public static void main(String[] args) throws Exception {
		
		PilhaComFilas p = new PilhaComFilas();
			p.push(1);
			p.push(5);
			p.push(7);
			
			p.top();
			p.pop();
			
			
			

	}

	@Override
	public void push(int element) throws Exception {

	

		while (!minhaFila1.isEmpty()) {
			minhaFila2.enqueue(minhaFila1.dequeue());
			
		}

			if (minhaFila1.isEmpty()) {

				minhaFila1.enqueue(element);

				while (!minhaFila2.isEmpty())
					minhaFila1.enqueue(minhaFila2.dequeue());


		}
			
			

	}

	@Override
	public int pop() throws Exception {
		
		int aux;
		
		if(minhaFila1.isEmpty())
			throw  new Exception("Pilha Vazia");
		else{
			aux = minhaFila1.dequeue();
			
			
		}
			
			
		
		
		return aux;
	}

	@Override
	public int top() throws Exception {
		
		int x = minhaFila1.dequeue();
		
		this.push(x);
		
		
		
		return x;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return minhaFila1.isEmpty();
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return minhaFila1.isFull();
	}

}
