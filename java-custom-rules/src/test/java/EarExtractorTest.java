import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.regex.Pattern;

import org.junit.Test;

public class EarExtractorTest {

	@Test
	public void test() throws Exception {		
		String webINFpath = findFolder(new File("src/main/resources/ship"), "WEB-INF");
		String jspPath = findFolder(new File(webINFpath), "jsp_servlet");
		int i = findFiles(new File(jspPath), "^_{2}.*\\.class$");
		if(i==0) {
			throw new Exception("no class files found");
		}
		System.out.println(i);
	}
	
	public String findFolder(File source, String targetDir) {
		String found = null;
		String temp = null;
		try {
			File[] files = source.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					//System.out.println(file.getName());
					if(file.getName().equals(targetDir)) { //folder name matches target
						//System.out.println("found target: " + file.getName());
						 found = file.getCanonicalPath();					 
						//System.out.println("found at base case: " + found);
					}
					else {
						temp = findFolder(file, targetDir);
						if(temp != null) {
							found = temp;
						}
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println("target not found");
		//System.out.println("found end iter: " + found);
		return found;
	}
	
	public int findFiles(File source, String regex) {
		int count = 0;
		//System.out.println("source inside findFiles call: " + source.getName());
		File[] files = source.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				 count += findFiles(file, regex);
			}
			else {
				if(Pattern.matches(regex, file.getName())) {
					count++;
					//System.out.println(count);
					//System.out.println("Matches");
				}
				else {
					//System.out.println("No match");
				}
			}			
		}
		return count;
	}
}
