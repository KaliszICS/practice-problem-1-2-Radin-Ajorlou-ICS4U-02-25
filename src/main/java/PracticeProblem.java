public class PracticeProblem {

	public static void main(String args[]) {

	}


	public static boolean validIndex(int[] array, int index){
		try {
			int b = array[index];
			return true;
		}
		catch(ArrayIndexOutOfBoundsException e){
			return false;
			
		}
	}




	public static int divide(int num1, int num2){
		try{
			return num1/num2;
		}
		catch(Exception e){
			return 0;
		}
	}




	public static int safeConvertStringtoInt(String line){
		try{
			int num  = Integer.parseInt(line);
			return num;
		}
		catch(NumberFormatException e){
			return 0;
		}
		catch(Exception e){
			return 0;
		}
	}

	

}
