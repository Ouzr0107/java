
public class test {

	public static void main(String[] args) {
		String strIm = "I am a student. I like Java Language!  ";
		System.out.println(strIm.length());
		System.out.println(strIm.charAt(0));
		System.out.println(strIm.charAt(strIm.length() - 1));
		System.out.println(strIm.indexOf("student"));
		strIm = strIm.trim();
		System.out.println(strIm.substring(2, 6));
		String[] str = strIm.split(" ");
		for (String i : str) {
			System.out.println(i);
		}
		StringBuilder sb = new StringBuilder();
		for (String i : str) {
			sb.append(i);
		}
		System.out.println(sb);
		System.out.println(strIm.toUpperCase());
	}

}
