
public class ReplaceString {
	
	public static void replaceString( char[] input, int stringLen) {

		int numSpaceChars = 0;

		// Find number of space characters
		for (int i=0; i<stringLen; i++ ) {
			if ( input[i] == ' ') {
				numSpaceChars++;
			}
		}
		int numChars = 2; // %20
		int shiftBy = numSpaceChars * numChars;
		int end = stringLen + shiftBy -1;
		int strPts = stringLen -1 ;

		while(  strPts >= 0  ) {
			if ( input[strPts] == ' ') {
				input[end] = '0';
				input[--end] = '2';
				input[--end] = '%';
			}
			else {
				input[end] = input[strPts];
			}
			end --;
			strPts --;
		}
  	}

  	public static void main( String[] args) {
  		String inputStr = "My Name Is Sumit";
  		char[] input = new char[100];

  		System.arraycopy( inputStr.toCharArray(), 0 ,input, 0,inputStr.length() );
  		replaceString( input,inputStr.length()  );
  		System.out.println( input);
  	}

}