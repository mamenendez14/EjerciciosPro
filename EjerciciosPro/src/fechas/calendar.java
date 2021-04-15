package fechas;

import java.util.Calendar;

public class calendar {

	public static void main(String[] args) {
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		//System.out.println(c1.get(Calendar.YEAR));
		//System.out.println(c1.get(Calendar.MONTH));
		//System.out.println(c1.get(Calendar.DAY_OF_MONTH));
		//System.out.println(c1.get(Calendar.HOUR));
		//System.out.println(c1.get(Calendar.MINUTE));
		//System.out.println(c1.get(Calendar.SECOND));
		
		c1.get(Calendar.YEAR);
		//System.out.println(c1.get(Calendar.YEAR));
		
		c1.set(Calendar.YEAR, 1995);
		c2.set(Calendar.YEAR, 1995);
		//System.out.println(c1.get(Calendar.YEAR));
		
		c1.add(Calendar.YEAR, 18);
		//System.out.println(c1.get(Calendar.YEAR));
		
		
		if (c2.before(c1)) {
			System.out.println("c2 es anterior a c1");
		}

	}

}
