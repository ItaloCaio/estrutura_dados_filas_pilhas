package testes;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import implementacao2.BrincandoComOrdenacao;

public class TesteOrdenacao {

	@Test
	public void testBubbleSort() {

		int [] vetOrd =  new int[5];
		int [] vetDesord =  new int[5];
		
		
		BrincandoComOrdenacao ordena = new BrincandoComOrdenacao();
		
		for(int i = 0; i < vetOrd.length; i++){
			vetOrd[i]= i+1;
			
			
		}
		for(int i = 4; i > 0; i--){
			vetDesord[i]= i+1;
			
			
		}
		ordena.insertionSort(vetDesord);
		assertEquals(vetOrd, vetDesord);
		
		}
		

		
	}


