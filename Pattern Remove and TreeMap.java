import java.util.Map;
import java.util.TreeMap;

public class PearsonTest {
	public static void main(String[] args) {
        
		String str = "<b>Pearson</b> PLC is a <u>British</u> <i>multinational publishing</i> and <i>education</i> company headquartered in <b>London</b>. It is the <b>largest</b> education company and the <b>largest</b> <i>book publisher</i> in the world. <b>Pearson</b> has a primary listing on the <i>London Stock Exchange</i> and is a constituent of the FTSE 100 Index.";
		
		calculateWordCount(str);
		
    }

	private static void calculateWordCount(String str) {
		
		if(str == null || str.equals("")){
			return;
		}
		
		String pattern1 = str.replaceAll("<.*?>", ""); //Pattern that removes all the tags from the string.
		
		String pattern2 = pattern1.replaceAll("[^a-zA-Z0-9 ]", ""); //Pattern that removes all the punctuation from the string.
        
		String[] str_array = pattern2.toLowerCase().split(" ");	//adding the words to a string array
        
        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>(); //TreeMap to display contents (key-value pairs) in alphabetical order.
        
        for(String word: str_array){			//Keep count of all the words.
        	
        	Integer count = treeMap.get(word);
        	if(count == null){
        		count = 1; 
        	}else{
        		count++;
        	}
        	treeMap.put(word, count);      //Adding the words to the map. 	
        }
        
        //System.out.println(treeMap);	//Printing all key-value pairs in a single line.
        
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {		// Printing all key value pairs in new line.
        	System.out.println(entry.getKey() + " = " + (entry.getValue()));       	
       }
	}
}
