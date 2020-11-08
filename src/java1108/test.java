package java1108;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy.MM.dd");						
		Date time = new Date();							
		String time1 = format1.format(time);						
		
		System.out.println(time1);
		
	}

}

