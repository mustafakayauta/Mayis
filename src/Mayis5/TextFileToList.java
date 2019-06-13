package Mayis5;

import java.nio.file.*;
import java.util.*;

public class TextFileToList {

	public static void main(String[] args) {

		List<String> lineLst = getTextFileAsList("hero4");

		
		  System.out.println(lineLst); // System.out.println(lineLst.size());
		  
		  
		  String s = "erat_quisque_erat.xls";
		  
		  String fileExtension = s.substring(s.indexOf(".") + 1); //
		  System.out.println(fileExtension);
		  
		  int countXls = 0; int countDoc = 0; int countPpt = 0; int countPdf = 0;
		  
		  for (String each : lineLst) {
		  
		  String fileExtension2 = each.substring(each.indexOf(".") + 1);
		  
		  if (fileExtension2.equals("xls")) { countXls++; }
		  if(fileExtension2.contentEquals("doc")) { countDoc++; }
		  if(fileExtension2.contentEquals("ppt")) { countPpt++; }
		  if(fileExtension2.contentEquals("pdf")) { countPdf++; } }
		  System.out.println("Word Count is: "+countDoc);
		  System.out.println("Pdf Count is: "+countPdf);
		  System.out.println("power point Count is: "+countPpt);
		  System.out.println("Excel Count is: " + countXls);
		  
		  
		  // !!!!!!!!!!!!!!LONGEST FILENAME!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		  
		  String longest=lineLst.get(0);
		  
		  for(String each:lineLst) {
		  
		  if(each.length()>longest.length()) { longest=each; } }
		  System.out.println("longest file name: "+longest);
		 
		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!! LONGEST EXCEL FILE!!!!!!!!!!!!!!!!!!!!!!!!!

		String longestExcel = "";

		for (String each : lineLst) {

			if (each.endsWith(".xls") && (each.length() > longestExcel.length())) {

				longestExcel = each;

			}
		}

		System.out.println("Longest Excel file: " + longestExcel);

	}

	/*
	 * DO NOT MODIFY AND JUST USE IT Method name : getTextFileAsList
	 * 
	 * @parameter location of text file as String if your file is at root path
	 * (right under project folder) you may directly path your filename.txt if not
	 * pass /your/own/folder/name/filename.txt as String to method
	 * 
	 * @return List of String that contain each line as per element
	 * 
	 */
	public static List<String> getTextFileAsList(String filePath) {

		List<String> allLines = null;
		try {
			allLines = Files.readAllLines(Paths.get(filePath));
		} catch (Exception e) {
			System.out.println("Wrong file path probably");
		}
		return allLines;

	}

}
