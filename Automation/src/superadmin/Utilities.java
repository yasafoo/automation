package superadmin;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {
	public String getMerchantName(){
		String name = "QA-Merchant-cin";
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
		String date = sdf.format(today);
		StringBuilder sb = new StringBuilder(date);
		sb.deleteCharAt(2);
		sb.deleteCharAt(4);
		name+=sb.toString();
		return name;
	}
	
}
