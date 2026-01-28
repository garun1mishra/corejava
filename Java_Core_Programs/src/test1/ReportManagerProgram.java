package test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportManagerProgram {

 static	Map<String, Integer> result = new HashMap<>();
	public static void main(String[] args) {
		
		Map<String, String> dataSet = new HashMap<>();
		dataSet.put("A", "C");
		dataSet.put("B", "C");
		dataSet.put("C", "F");
		dataSet.put("D", "E");
		dataSet.put("E", "F");
		dataSet.put("F", "F");
		
		printSolution(dataSet);		
		System.out.println("result = " + result);		
		

	}
	private static void printSolution(Map<String, String> dataset) {
		Map<String, List<String>> mgrEmp = new HashMap<>();
		for(Map.Entry<String, String> key : dataset.entrySet()) {
			String emp = key.getKey();
			String mgr = key.getValue();
			if(!emp.equals(mgr)){
			 List<String> directReportList = mgrEmp.get(mgr);
			 if(directReportList == null) {
				 directReportList = new ArrayList<String>();
				 mgrEmp.put(mgr, directReportList);					 
			 }
			 directReportList.add(emp);
			}
		}
		
	  for(String mngr : dataset.keySet()) {
		  populateResultUtil(mngr, mgrEmp);
	  }
	}
	private static int populateResultUtil(String mngr, Map<String, List<String>> mgrEmp) {
		int count =0;
		if(!mgrEmp.containsKey(mngr)) {
			result.put(mngr,  0);
			return 0;
		}else if(!mgrEmp.containsKey(mngr)) 
			count = result.get(mngr);	
		else {
		List<String> directReport	= mgrEmp.get(mngr);	
			count = directReport.size();
			
			for(String directRepEmp : directReport) 
				count += populateResultUtil(directRepEmp, mgrEmp);
			
			result.put(mngr, count);
		}
		
		
		return count;
	}

}
