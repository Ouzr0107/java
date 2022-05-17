import java.time.*;
import java.util.*;

public class test {
	
	public static void main(String[] args) {
			Date today = new Date();
			System.out.println(today.toString());
			LocalDateTime mydate = LocalDateTime.now();
			System.out.print(mydate.getYear() + " ");
			System.out.println(mydate.getMonthValue());
		}
	}