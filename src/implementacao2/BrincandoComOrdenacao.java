package implementacao2;

import java.util.Random;

public class BrincandoComOrdenacao {

	public static void main(String[] args) {
		// TODO Codifique o experimento pedido. Crie metodos auxiliares para
		// facilitar.

		int x[] = { 1, 8, 2, 5, 1 };

		// bubbleSort(x);
		// selectionSort(x);
		// insertionSort(x);
		// mergeSort(x);
		// quickSort(x);
		countingSort(x);
		for (int i = 0; i < 5; i++)
			System.out.println(x[i]);

	}

	// ALGORITMO BUBBLE SORT
	public static void bubbleSort(int[] vetor) {

		int n = vetor.length;

		for (int i = n - 1; i >= 1; i--) // A condição do laço é maior igual a 1
											// porque se o i fosse =0 o laço de
											// dentro nao seria realizado //pois
											// a condição 0<0 nunca seria
											// satisfeita
		// O laço é decrementado para que haja todas as comparações necessarias
		// corretamente e de forma flexivel, pelo fato de que
		// a variavel i muda a cada repetição
		{
			for (int j = 0; j < i; j++) {

				if (vetor[j] > vetor[j + 1]) {
					swap(vetor, j, j + 1);
				}

			}
		}
	}

	// ALGORITMO SELECTION SORT
	public static void selectionSort(int[] vetor) {

		int n = vetor.length;

		for (int i = 0; i < n - 1; i++) {

			int minima = i;

			for (int j = i + 1; j < n; j++) {

				if (vetor[j] < vetor[minima])
					minima = j;
			}

			swap(vetor, i, minima);
		}

	}

	// ALGORITMO INSERTION SORT
	public static void insertionSort(int[] vetor) {

		int n = vetor.length;

		for (int i = 1; i < n; i++) {
			int key = vetor[i];
			int j = i - 1;

			while (j > 0 && vetor[j] > key) {

				vetor[j + 1] = vetor[j];
				j = j - 1;
			}

			vetor[j + 1] = key;
		}
	}

	// ALGORITMO MERGE SORT
	public static void mergeSort(int[] vetor) {
		int n = vetor.length;

		int[] aux = new int[n];

		mergeSort(vetor, aux, 0, n - 1);

	}

	private static void mergeSort(int[] vetor, int[] aux, int left, int right) {

		if (left < right) {

			int meio = (left + right) / 2;
			mergeSort(vetor, aux, left, meio);
			mergeSort(vetor, aux, meio + 1, right);
			merge(vetor, aux, left, meio + 1, right);
		}

	}

	private static void merge(int[] vetor, int[] aux, int leftPos, int rightPos, int rightEnd) {

		int leftEnd = rightPos - 1;
		int auxPos = leftPos;
		int numElements = rightEnd - leftPos + 1;

		while (leftPos <= leftEnd && rightPos <= rightEnd) {

			// TESTAR
			if (vetor[leftPos] <= vetor[rightPos])
				aux[auxPos++] = vetor[leftPos++];
			else
				aux[auxPos++] = vetor[rightPos++];

		}
		while (leftPos <= leftEnd)
			aux[auxPos++] = vetor[leftPos++];

		while (rightPos <= rightEnd)
			aux[auxPos++] = vetor[rightPos++];

		for (int i = 0; i < numElements; i++, rightEnd--) {
			vetor[rightEnd] = aux[rightEnd];
		}

	}

	// ALGORITMO QUICKSORT
	public static void quickSort(int[] vetor) {

		quickSort(vetor, 0, vetor.length - 1);

	}

	private static void quickSort(int[] vetor, int left, int right) {

		if (left < right) {
			int pivot = partition(vetor, left, right);
			quickSort(vetor, left, pivot - 1);
			quickSort(vetor, pivot + 1, right);
		}
	}

	private static int partition(int[] vetor, int left, int right) {

		int p = vetor[left];
		int i = left + 1;
		int j = right;

		while (i <= j) {
			if (vetor[i] <= p)
				i++;
			else if (vetor[j] > p)
				j--;
			else
				swap(vetor, i, j);
		}
		swap(vetor, left, j);
		return j;

	}

	// ALGORITMO COUNTING SORT
	public static void countingSort(int[] vetor) {

		int k = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > vetor[k])
				k = i;
		}
		int aux[] = new int[vetor[k] + 1];
		int b[] = new int[vetor.length];
		
		for(int i = 0; i< aux.length; i++)
			aux[i] = 0;
		
		for(int i = 0; i< vetor.length; i++)
			aux[vetor[i]]+=1;
		for(int i = 1; i <aux.length; i++)
			aux[i] += aux[i-1];
		
		for(int i = 0; i < vetor.length; i++)
			b[aux[vetor[i]]-- -1] = vetor[i];
		
		for(int i = 0; i < vetor.length; i++)
			vetor[i] = b[i];
	}	
	

	

	private static void swap(int[] vetor, int i, int j) {

		int aux = vetor[i];

		vetor[i] = vetor[j];
		vetor[j] = aux;

	}

}
