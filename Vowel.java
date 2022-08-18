public class Vowel {
	public int countVowels(char[] CharArr) {
		int count = 0;
		for (char ch : CharArr) {
		
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
			try {
				if(ch=='x') {
					System.out.println("Exception is Checked");
				}
			}catch(Exception e){
				System.out.println(e);
			}

		}
		return count;

	}

	public static void main(String[] args) {
		Vowel vobj = new Vowel();
		char[] CharArray = { 'a', 'b', 'c', 'd', 'e','x' };
		int countValueOfVowel = vobj.countVowels(CharArray);
		System.out.println(countValueOfVowel);

	}

}