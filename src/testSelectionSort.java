import static org.junit.Assert.*;

import org.junit.Test;
//import org.junit.Assert;

public class testSelectionSort {

	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		//testZeros();
		//testDuplicates();
		}   
	public testSelectionSort() {  
		
	}    
	public void testPositive(){    
		int[] arr = new int[5];      
		arr[0] = 8;       
		arr[1] = 9;      
		arr[2] = 7;    
		arr[3] = 10;
		arr[4] = 2;
		int[] Sortedarr = new int[5];   
		Sortedarr[0] = 2;   
		Sortedarr[1] = 7;
		Sortedarr[2] = 8; 
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
		/** add tests to check for this unit test **/ 
		SelectionSort temp = new SelectionSort();
		int actual[] = temp.basicSelectionSort(arr);
		
		for(int i = 0; i < 5; i ++){
			assertEquals(Sortedarr[i], actual[i]);
		}
		
		} 
	public void testNegative(){
		int[] arr = new int[5];      
		arr[0] = -8;       
		arr[1] = -9;      
		arr[2] = -7;    
		arr[3] = -10;
		arr[4] = -2;
		int[] Sortedarr = new int[5];   
		Sortedarr[0] = -10;   
		Sortedarr[1] = -9;
		Sortedarr[2] = -8; 
		Sortedarr[3] = -7;
		Sortedarr[4] = -2;
		/** add tests to check for this unit test **/ 
		SelectionSort temp = new SelectionSort();
		int actual[] = temp.basicSelectionSort(arr);
		
		for(int i = 0; i < 5; i ++){
			assertEquals(Sortedarr[i], actual[i]);
		}
		
		}
	//public void testZeros(){
		
	//}
	public void testMixed(){
	    	/** Test data contains with both positive, negative and zeros **/  
		int[] arr = new int[5];      
		arr[0] = 8;       
		arr[1] = -9;      
		arr[2] = -7;    
		arr[3] = -10;
		arr[4] = 0;
		int[] Sortedarr = new int[5];   
		Sortedarr[0] = -10;   
		Sortedarr[1] = -9;
		Sortedarr[2] = -7; 
		Sortedarr[3] = 0;
		Sortedarr[4] = 8;
		/** add tests to check for this unit test **/ 
		SelectionSort temp = new SelectionSort();
		int actual[] = temp.basicSelectionSort(arr);
		
		for(int i = 0; i < 5; i ++){
			assertEquals(Sortedarr[i], actual[i]);
		}
	    	}    
	public void testDuplicates(){  
	    	/** Test data contains duplicates **/
		int[] arr = new int[5];      
		arr[0] = -9;       
		arr[1] = -9;      
		arr[2] = -7;    
		arr[3] = -10;
		arr[4] = -10;
		int[] Sortedarr = new int[5];   
		Sortedarr[0] = -10;   
		Sortedarr[1] = -10;
		Sortedarr[2] = -9; 
		Sortedarr[3] = -9;
		Sortedarr[4] = -7;
		/** add tests to check for this unit test **/ 
		SelectionSort temp = new SelectionSort();
		int actual[] = temp.basicSelectionSort(arr);
		
		for(int i = 0; i < 5; i ++){
			assertEquals(Sortedarr[i], actual[i]);
		}
	    	}

}
