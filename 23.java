import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class test {
	
	public static void main(String[] args) throws IOException {
		int[] a = new int[5];
		File file = new File("output.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter fw = new FileWriter("output.txt", false);
		PrintWriter pw = new PrintWriter(fw);
		Scanner num = new Scanner(System.in);
		for (int i = 0;i < 5; ++i) {
			a[i] = num.nextInt();
		}
		Arrays.sort(a);
		for (int i : a) {
			pw.print(i + " ");
			pw.flush();
			System.out.print(i + " ");
		}
	}

}
