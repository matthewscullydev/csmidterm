
// Program to illustrate the isEqual() method

import java.util.*;
import java.time.*;

public class Equal {
	public static void main(String[] args) {
		// Parses the first date
		LocalDate dt1 = LocalDate.parse("2018-11-27");
		// Parses the second date
		LocalDate dt2 = LocalDate.parse("2015-11-27");

		// Checks
		System.out.println(dt1.isEqual(dt2));
	}
}