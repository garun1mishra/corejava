package april.override;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		String str = "i am garun i live in india";
		 String [] stringArr = str.split(" "); 
		 
		 List<String> listString =  Arrays.asList(stringArr);
		 
		int countword =0;
		 listString.stream().map(value-> value).collect(Collectors.groupingBy(String::toString, Collectors.counting())).entrySet().forEach(rec -> {
//		   countword += rec.getValue();
		   System.out.println(rec.getKey() + "----"+rec.getValue());
		 }
		 );
		 
		 System.out.println("Total Word : "+countword);
		 ConcurrentHashMap<String, String> cmap = new ConcurrentHashMap<String, String>();
		 cmap.put("Abc", "Def");

	}

}
