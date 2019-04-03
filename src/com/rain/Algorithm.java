package com.rain;


/**
 * @author Maksim Gromko
 */
public class Algorithm {
	private int[] array;
	private final int MINLENGHT = 10;

	public Algorithm() {
		this.array = new int[MINLENGHT];
		randomFillArray();
	}

	public Algorithm(int length) {
		length = length < MINLENGHT ? MINLENGHT : length;

		this.array = new int[length];
		randomFillArray();
	}

	// fill the array with random numbers
	private void randomFillArray() {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (MINLENGHT - 3) + 1);
		}
	}

	public int rainIsComing(int position) {
		int result = 0 ;
		
		int maxRight = 0;
		int positionRight =0;
		for (int i = position+1; i < array.length; i++) {
			positionRight = maxRight < array[i] ? i : positionRight;
			maxRight = maxRight < array[i] ? array[i] : maxRight;
			
		}
		
		int maxLeft = 0;
		int positionLeft = 0;
		for (int i = position-1; i >= 0; i--) {
			positionLeft = maxLeft < array[i] ? i : positionLeft;
			maxLeft = maxLeft < array[i] ? array[i] : maxLeft;
		}
		
		int positionMin = (maxLeft < maxRight)?positionLeft:positionRight;	

		for (int i = position; i < positionRight+1; i++) {
			if(array[i] < maxRight ) {
				if(array[positionMin] > array[position]) {
				result += array[positionMin] - array[i] ;
				}else {
					result += maxRight - array[i] ;
				}
			}
		}
		
		for (int i = positionLeft+1; i < position; i++) {
			if(array[i] < maxLeft ) {
				if(array[positionMin] > array[position]) {
					result += array[positionMin] - array[i] ;
					}else {
						result += maxLeft - array[i] ;
					}
			}
		}

		return result ;
		
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}
}
