package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Test2 {

	private static int PADDING_SIZE = 2;
	private static String NEW_LINE = "\n";
	private static String TABLE_JOINT_SYMBOL = "+";
	private static String TABLE_V_SPLIT_SYMBOL = "|";
	private static String TABLE_H_SPLIT_SYMBOL = "-";

	public static void main(String[] args) {
		 StringBuilder stringBuilder = new StringBuilder();
		
		
	      int array[] = {10, 20, 25, 63, 96, 57};
	      int k =5; 
	      List<List<String>> rowsList = new ArrayList<>();
	      for (int i = 0; i < k; i++) {
	            List<String> row = new ArrayList<>(); 
	            row.add(UUID.randomUUID().toString());
	            row.add(UUID.randomUUID().toString());
	            row.add(UUID.randomUUID().toString());
	            row.add(UUID.randomUUID().toString());
	            rowsList.add(row);
	        }

	      System.out.println(Test2.solution(rowsList));
     

	}

//	private static void solution(int[] array, int k) {
	private static String solution(List<List<String>> rowsList, int... overRiddenHeaderHeight) {
		
		StringBuilder stringBuilder = new StringBuilder();

        int rowHeight = overRiddenHeaderHeight.length > 0 ? overRiddenHeaderHeight[0] : 1; 

        Map<Integer,Integer> columnMaxWidthMapping = getMaximumWidhtofTable(rowsList);

        stringBuilder.append(NEW_LINE);
        stringBuilder.append(NEW_LINE);     
        for (List<String> row : rowsList) {

            for (int i = 0; i < rowHeight; i++) {
                stringBuilder.append(NEW_LINE);
            }

            for (int cellIndex = 0; cellIndex < row.size(); cellIndex++) {
                fillCell(stringBuilder, row.get(cellIndex), cellIndex, columnMaxWidthMapping);
            }

        }

        stringBuilder.append(NEW_LINE);
        stringBuilder.append(NEW_LINE);
        stringBuilder.append(NEW_LINE);

        return stringBuilder.toString();
		
	}
	
	  @SuppressWarnings("unused")
	private void createRowLine(StringBuilder stringBuilder,int headersListSize, Map<Integer,Integer> columnMaxWidthMapping)
	    {
	        for (int i = 0; i < headersListSize; i++) {
	            if(i == 0)
	            {
	                stringBuilder.append(TABLE_JOINT_SYMBOL);   
	            }

	            for (int j = 0; j < columnMaxWidthMapping.get(i) + PADDING_SIZE * 2 ; j++) {
	                stringBuilder.append(TABLE_H_SPLIT_SYMBOL);
	            }
	            stringBuilder.append(TABLE_JOINT_SYMBOL);
	        }
	    }

	
	 private static Map<Integer,Integer> getMaximumWidhtofTable(List<List<String>> rowsList)	    {
	        Map<Integer,Integer> columnMaxWidthMapping = new HashMap<>();
	        for (List<String> row : rowsList) {

	            for (int columnIndex = 0; columnIndex < row.size(); columnIndex++) {

	                if(row.get(columnIndex).length() > columnMaxWidthMapping.get(columnIndex))
	                {
	                    columnMaxWidthMapping.put(columnIndex, row.get(columnIndex).length());
	                }
	            }
	        }


	        return columnMaxWidthMapping;
	    }
	 
	 private static void fillSpace(StringBuilder stringBuilder, int length)
	    {
	        for (int i = 0; i < length; i++) {
	            stringBuilder.append(" ");
	        }
	    }
	 
	 private static void fillCell(StringBuilder stringBuilder,String cell,int cellIndex,Map<Integer,Integer> columnMaxWidthMapping)
	    {

	        int cellPaddingSize = getOptimumCellPadding(cellIndex, cell.length(), columnMaxWidthMapping, PADDING_SIZE);

	        if(cellIndex == 0)
	        {
	            stringBuilder.append(TABLE_V_SPLIT_SYMBOL); 
	        }

	        fillSpace(stringBuilder, cellPaddingSize);
	        stringBuilder.append(cell);
	        if(cell.length() % 2 != 0)
	        {
	            stringBuilder.append(" ");
	        }

	        fillSpace(stringBuilder, cellPaddingSize);

	        stringBuilder.append(TABLE_V_SPLIT_SYMBOL); 

	    }	
	 
	 private static int getOptimumCellPadding(int cellIndex,int datalength,Map<Integer,Integer> columnMaxWidthMapping,int cellPaddingSize)
	    {
	        if(datalength % 2 != 0)
	        {
	            datalength++;
	        }

	        if(datalength < columnMaxWidthMapping.get(cellIndex))
	        {
	            cellPaddingSize = cellPaddingSize + (columnMaxWidthMapping.get(cellIndex) - datalength) / 2;
	        }

	        return cellPaddingSize;
	    }


}
