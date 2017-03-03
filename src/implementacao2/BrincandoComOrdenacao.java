package implementacao2;

import java.util.Random;

public class BrincandoComOrdenacao {

	public static void main(String[] args) {

		int arrayOrdenado[] = new int[20];
		int arrayInversamenteOrd[] = new int[20];
		int arrayAleatorio[] = new int[20];

		int arrayOrdenado2[] = new int[2000];
		int arrayInversamenteOrd2[] = new int[2000];
		int arrayAleatorio2[] = new int[2000];
		Random random = new Random();

		// Cria o Array Ordenado de 20 elementos
		for (int i = 0; i < 20; i++) {
			arrayOrdenado[i] = i + 1;
		}

		// Cria o Array Ordenado Inversamente de 20 elementos
		int j = 0;
		for (int i = 19; i >= 0; i--, j++) {
			arrayInversamenteOrd[i] = j + 1;
		}
		// Cria Array Aleatorio de 20 elementos 1 - 20
		for (int i = 0; i < 20; i++) {
			arrayAleatorio[i] = random.nextInt(20) + 1;
		}

		// Cria o Array Ordenado de 2000 elementos
		for (int i = 0; i < 2000; i++) {
			arrayOrdenado2[i] = i + 1;
		}

		// Cria o Array Ordenado Inversamente de 2000 elementos
		int k = 0;
		for (int i = 1999; i >= 0; i--, k++) {
			arrayInversamenteOrd2[i] = k + 1;
		}
		// Cria Array Aleatorio de 2000 elementos 1 - 20
		for (int i = 0; i < 2000; i++) {
			arrayAleatorio2[i] = random.nextInt(2000) + 1;
		}

		System.out.println("20 Elementos");
		System.out.println();

		// Tempo Ordenado Bubble
		long tempoBubbleOrd = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			bubbleSort(arrayOrdenado.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoBubbleOrd += tempo;

		}
		long mediaBubbleOrd = tempoBubbleOrd / 5;

		System.out.println("Media Buble Ord: " + mediaBubbleOrd);
		// Tempo Inversamente Ordenado Bubble
		long tempoBubbleInv = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			bubbleSort(arrayInversamenteOrd.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoBubbleInv += tempo;

		}
		long mediaBubbleInv = tempoBubbleInv / 5;
		System.out.println("Media Buble Inv: " + mediaBubbleInv);

		// Tempo Aleatorio Bubble
		long tempoBubbleAleatorio = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			bubbleSort(arrayAleatorio.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoBubbleAleatorio += tempo;

		}
		long mediaBubbleAleatoria = tempoBubbleAleatorio / 5;
		System.out.println("Media Buble Aleatorio: " + mediaBubbleAleatoria);
		System.out.println();
		// Tempo Ordenado Selection
		long tempoSelectionOrd = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			selectionSort(arrayOrdenado.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoSelectionOrd += tempo;

		}
		long mediaSelectionOrd = tempoSelectionOrd / 5;

		System.out.println("Media Selection Ord: " + mediaSelectionOrd);
		// Tempo Inversamente Ordenado Selection
		long tempoSelectionInv = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			selectionSort(arrayInversamenteOrd.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoSelectionInv += tempo;

		}
		long mediaSelectionInv = tempoSelectionInv / 5;

		System.out.println("Media Selection Inv: " + mediaSelectionInv);

		// Tempo Aleatorio Selection
		long tempoSelectionAleatorio = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			selectionSort(arrayAleatorio.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoSelectionAleatorio += tempo;

		}
		long mediaSelectionAleatoria = tempoSelectionAleatorio / 5;

		System.out.println("Media Selection Aleatorio: " + mediaSelectionAleatoria);
		System.out.println();
		// Tempo Ordenado Insertion
		long tempoInsertionOrd = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			insertionSort(arrayOrdenado.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoInsertionOrd += tempo;

		}
		long mediaInsertionOrd = tempoInsertionOrd / 5;

		System.out.println("Media Insertion Ord: " + mediaInsertionOrd);
		// Tempo Inversamente Ordenado Insertion
		long tempoInsertionInv = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			insertionSort(arrayInversamenteOrd.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoInsertionInv += tempo;

		}
		long mediaInsertionInv = tempoInsertionInv / 5;
		System.out.println("Media Insertion Inv: " + mediaInsertionInv);

		// Tempo Aleatorio Insertion
		long tempoInsertionAleatorio = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			insertionSort(arrayAleatorio.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoInsertionAleatorio += tempo;

		}
		long mediaInsertionAleatoria = tempoInsertionAleatorio / 5;
		System.out.println("Media Insertion Aleatorio: " + mediaInsertionAleatoria);
		System.out.println();
		// Tempo Ordenado Merge
		long tempoMergeOrd = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			mergeSort(arrayOrdenado.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoMergeOrd += tempo;

		}
		long mediaMergeOrd = tempoMergeOrd / 5;

		System.out.println("Media Merge Ord: " + mediaMergeOrd);
		// Tempo Inversamente Ordenado Merge
		long tempoMergeInv = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			mergeSort(arrayInversamenteOrd.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoMergeInv += tempo;

		}
		long mediaMergeInv = tempoMergeInv / 5;
		System.out.println("Media Merge Inv: " + mediaMergeInv);

		// Tempo Aleatorio Merge
		long tempoMergeAleatorio = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			mergeSort(arrayAleatorio.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoMergeAleatorio += tempo;

		}
		long mediaMergeAleatoria = tempoMergeAleatorio / 5;
		System.out.println("Media Merge Aleatorio: " + mediaMergeAleatoria);
		System.out.println();
		// Tempo Ordenado Quick
		long tempoQuickOrd = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			quickSort(arrayOrdenado.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoQuickOrd += tempo;

		}
		long mediaQuickOrd = tempoQuickOrd / 5;

		System.out.println("Media Quick Ord: " + mediaQuickOrd);

		// Tempo Inversamente Ordenado Quick
		long tempoQuickInv = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			quickSort(arrayInversamenteOrd.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoQuickInv += tempo;

		}
		long mediaQuickInv = tempoQuickInv / 5;
		System.out.println("Media QuickInv: " + mediaQuickInv);

		// Tempo Aleatorio Quick
		long tempoQuickAleatorio = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			quickSort(arrayAleatorio.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoQuickAleatorio += tempo;

		}
		long mediaQuickAleatoria = tempoQuickAleatorio / 5;
		System.out.println("Media Quick Aleatorio: " + mediaQuickAleatoria);
		System.out.println();
		// Tempo Ordenado Counting
		long tempoCountingOrd = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			countingSort(arrayOrdenado.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoCountingOrd += tempo;

		}
		long mediaCountingOrd = tempoCountingOrd / 5;

		System.out.println("Media Counting Ord: " + mediaCountingOrd);
		// Tempo Inversamente Ordenado Counting
		long tempoCountingInv = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			countingSort(arrayInversamenteOrd.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoCountingInv += tempo;

		}
		long mediaCountingInv = tempoCountingInv / 5;
		System.out.println("Media Counting Inv: " + mediaCountingInv);

		// Tempo Aleatorio Counting
		long tempoCountingAleatorio = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			countingSort(arrayAleatorio.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoCountingAleatorio += tempo;

		}
		long mediaCountingAleatoria = tempoCountingAleatorio / 5;
		System.out.println("Media Counting Aleatorio: " + mediaCountingAleatoria);

		System.out.println();

		// 2000 elementos

		System.out.println("2000 Elementos");

		System.out.println();
		// Tempo Ordenado Bubble
		long tempoBubbleOrd2 = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			bubbleSort(arrayOrdenado2.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoBubbleOrd2 += tempo;

		}
		long mediaBubbleOrd2 = tempoBubbleOrd2 / 5;

		System.out.println("Media Buble Ord: " + mediaBubbleOrd2);
		// Tempo Inversamente Ordenado Bubble
		long tempoBubbleInv2 = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			bubbleSort(arrayInversamenteOrd2.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoBubbleInv2 += tempo;

		}
		long mediaBubbleInv2 = tempoBubbleInv2 / 5;
		System.out.println("Media Buble Inv: " + mediaBubbleInv2);

		// Tempo Aleatorio Bubble
		long tempoBubbleAleatorio2 = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			bubbleSort(arrayAleatorio2.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoBubbleAleatorio2 += tempo;

		}
		long mediaBubbleAleatoria2 = tempoBubbleAleatorio2 / 5;
		System.out.println("Media Buble Aleatorio: " + mediaBubbleAleatoria2);
		System.out.println();
		// Tempo Ordenado Selection
		long tempoSelectionOrd2 = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			selectionSort(arrayOrdenado2.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoSelectionOrd2 += tempo;

		}
		long mediaSelectionOrd2 = tempoSelectionOrd2 / 5;

		System.out.println("Media Selection Ord: " + mediaSelectionOrd2);
		// Tempo Inversamente Ordenado Selection
		long tempoSelectionInv2 = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			selectionSort(arrayInversamenteOrd2.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoSelectionInv2 += tempo;

		}
		long mediaSelectionInv2 = tempoSelectionInv2 / 5;

		System.out.println("Media Selection Inv: " + mediaSelectionInv2);

		// Tempo Aleatorio Selection
		long tempoSelectionAleatorio2 = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			selectionSort(arrayAleatorio2.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoSelectionAleatorio2 += tempo;

		}
		long mediaSelectionAleatoria2 = tempoSelectionAleatorio2 / 5;

		System.out.println("Media Selection Aleatorio: " + mediaSelectionAleatoria2);
		System.out.println();
		// Tempo Ordenado Insertion
		long tempoInsertionOrd2 = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			insertionSort(arrayOrdenado2.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoInsertionOrd2 += tempo;

		}
		long mediaInsertionOrd2 = tempoInsertionOrd2 / 5;

		System.out.println("Media Insertion Ord: " + mediaInsertionOrd2);
		// Tempo Inversamente Ordenado Insertion
		long tempoInsertionInv2 = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			insertionSort(arrayInversamenteOrd2.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoInsertionInv2 += tempo;

		}
		long mediaInsertionInv2 = tempoInsertionInv2 / 5;
		System.out.println("Media Insertion Inv: " + mediaInsertionInv2);

		// Tempo Aleatorio Insertion
		long tempoInsertionAleatorio2 = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			insertionSort(arrayAleatorio2.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoInsertionAleatorio2 += tempo;

		}
		long mediaInsertionAleatoria2 = tempoInsertionAleatorio2 / 5;
		System.out.println("Media Insertion Aleatorio: " + mediaInsertionAleatoria2);
		System.out.println();
		// Tempo Ordenado Merge
		long tempoMergeOrd2 = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			mergeSort(arrayOrdenado2.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoMergeOrd2 += tempo;

		}
		long mediaMergeOrd2 = tempoMergeOrd2 / 5;

		System.out.println("Media Merge Ord: " + mediaMergeOrd2);
		// Tempo Inversamente Ordenado Merge
		long tempoMergeInv2 = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			mergeSort(arrayInversamenteOrd2.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoMergeInv2 += tempo;

		}
		long mediaMergeInv2 = tempoMergeInv2 / 5;
		System.out.println("Media Merge Inv: " + mediaMergeInv2);

		// Tempo Aleatorio Merge
		long tempoMergeAleatorio2 = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			mergeSort(arrayAleatorio2.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoMergeAleatorio2 += tempo;

		}
		long mediaMergeAleatoria2 = tempoMergeAleatorio2 / 5;
		System.out.println("Media Merge Aleatorio: " + mediaMergeAleatoria2);
		System.out.println();
		// Tempo Ordenado Quick
		long tempoQuickOrd2 = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			quickSort(arrayOrdenado2.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoQuickOrd2 += tempo;

		}
		long mediaQuickOrd2 = tempoQuickOrd2 / 5;

		System.out.println("Media Quick Ord: " + mediaQuickOrd2);
		// Tempo Inversamente Ordenado Quick
		long tempoQuickInv2 = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			quickSort(arrayInversamenteOrd2.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoQuickInv2 += tempo;

		}
		long mediaQuickInv2 = tempoQuickInv2 / 5;
		System.out.println("Media QuickInv: " + mediaQuickInv2);

		// Tempo Aleatorio Quick
		long tempoQuickAleatorio2 = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			quickSort(arrayAleatorio2.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoQuickAleatorio2 += tempo;

		}
		long mediaQuickAleatoria2 = tempoQuickAleatorio2 / 5;

		System.out.println("Media Quick Aleatorio: " + mediaQuickAleatoria2);
		System.out.println();
		// Tempo Ordenado Counting
		long tempoCountingOrd2 = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			countingSort(arrayOrdenado2.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoCountingOrd2 += tempo;

		}
		long mediaCountingOrd2 = tempoCountingOrd2 / 5;

		System.out.println("Media Counting Ord: " + mediaCountingOrd2);
		// Tempo Inversamente Ordenado Counting
		long tempoCountingInv2 = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			countingSort(arrayInversamenteOrd2.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoCountingInv2 += tempo;

		}
		long mediaCountingInv2 = tempoCountingInv2 / 5;
		System.out.println("Media Counting Inv: " + mediaCountingInv2);

		// Tempo Aleatorio Counting
		long tempoCountingAleatorio2 = 0;

		for (int i = 0; i < 5; i++) {
			long antes = System.nanoTime();
			countingSort(arrayAleatorio2.clone());
			long depois = System.nanoTime();

			long tempo = depois - antes;

			tempoCountingAleatorio2 += tempo;

		}
		long mediaCountingAleatoria2 = tempoCountingAleatorio2 / 5;
		System.out.println("Media Counting Aleatorio: " + mediaCountingAleatoria2);

		System.out.println();
		
		

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

		for (int i = 0; i < aux.length; i++)
			aux[i] = 0;

		for (int i = 0; i < vetor.length; i++)
			aux[vetor[i]] += 1;
		for (int i = 1; i < aux.length; i++)
			aux[i] += aux[i - 1];

		for (int i = 0; i < vetor.length; i++)
			b[aux[vetor[i]]-- - 1] = vetor[i];

		for (int i = 0; i < vetor.length; i++)
			vetor[i] = b[i];
	}

	private static void swap(int[] vetor, int i, int j) {

		int aux = vetor[i];

		vetor[i] = vetor[j];
		vetor[j] = aux;

	}

}
