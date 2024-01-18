class ReverseofEachWord{

	public static void main(String[] args){

	String input ="Hello World";

	String output ="";
	
	String[] splitwords =input.split(" ");


	for(String word : splitwords){


		String revword="";

		for(int j=word.length()-1;j>=0;j--){

			revword=revword+word.charAt(j);		


		}
		output =output+revword+" ";

	}

	System.out.println(output);













	}








}