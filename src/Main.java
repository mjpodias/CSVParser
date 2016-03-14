import java.io.*;
import com.opencsv.*;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		CSVReader reader = new CSVReader(new FileReader("Bin.csv"));
		CSVWriter writer = new CSVWriter(new FileWriter("newBin.csv"), '\t');
		String [] nextLine;
		int binnumber = 1;
		HashMap<String, Bin> hm = new HashMap<String, Bin>();
		
		while ((nextLine = reader.readNext()) != null) {
	        // nextLine[] is an array of values from the line  
			String binKey = nextLine[0] + nextLine[1] + String.valueOf(binnumber);
			
			if (!hm.containsKey(binKey)){
				for (binnumber=1; binnumber <= 120; binnumber++){
					binKey = nextLine[0] + nextLine[1] + String.valueOf(binnumber);
					hm.put(binKey, new Bin(binnumber, nextLine[0], nextLine[1]));
				}
				binnumber=1;
			}
						
			if (hm.containsKey(binKey)){
				switch (nextLine[2]) {
					case "Center in Cage": 
						for (binnumber=1; binnumber <= 120; binnumber++){
							binKey = nextLine[0] + nextLine[1] + String.valueOf(binnumber);
							hm.get(binKey).setCenterDur(nextLine[binnumber+2]);
						}
						binnumber=1;
						break;
					case "Stay/Hide in Cage": 
						for (binnumber=1; binnumber <= 120; binnumber++){
							binKey = nextLine[0] + nextLine[1] + String.valueOf(binnumber);
							hm.get(binKey).setStayHideDur(nextLine[binnumber+2]);
						}
						binnumber=1;
						break;
					case "Social Contact": 
						for (binnumber=1; binnumber <= 120; binnumber++){
							binKey = nextLine[0] + nextLine[1] + String.valueOf(binnumber);
							hm.get(binKey).setSocialContactDur(nextLine[binnumber+2]);
						}
						binnumber=1;
						break;
					case "Social Contact <0.030": 
						for (binnumber=1; binnumber <= 120; binnumber++){
							binKey = nextLine[0] + nextLine[1] + String.valueOf(binnumber);
							hm.get(binKey).setThreeContactDur(nextLine[binnumber+2]);
						}
						binnumber=1;
						break;
					case "Social Contact < 0.050":  
						for (binnumber=1; binnumber <= 120; binnumber++){
							binKey = nextLine[0] + nextLine[1] + String.valueOf(binnumber);
							hm.get(binKey).setFiveContactDur(nextLine[binnumber+2]);
						}
						binnumber=1;
						break;
					case "Social Contact < 0.070":  
						for (binnumber=1; binnumber <= 120; binnumber++){
							binKey = nextLine[0] + nextLine[1] + String.valueOf(binnumber);
							hm.get(binKey).setSevenContactDur(nextLine[binnumber+2]);
						}
						binnumber=1;
						break;
					case "Social Contact < 0.100":  
						for (binnumber=1; binnumber <= 120; binnumber++){
							binKey = nextLine[0] + nextLine[1] + String.valueOf(binnumber);
							hm.get(binKey).setOneContactDur(nextLine[binnumber+2]);
						}
						binnumber=1;
						break;
					case "Social Contact < 0.200":  
						for (binnumber=1; binnumber <= 120; binnumber++){
							binKey = nextLine[0] + nextLine[1] + String.valueOf(binnumber);
							hm.get(binKey).setTwoContactDur(nextLine[binnumber+2]);
						}
						binnumber=1;
						break;
					case "Social Contact < 0.400":  
						for (binnumber=1; binnumber <= 120; binnumber++){
							binKey = nextLine[0] + nextLine[1] + String.valueOf(binnumber);
							hm.get(binKey).setFourContactDur(nextLine[binnumber+2]);
						}
						binnumber=1;
						break;
					case "Social Contact < 0.600":  
						for (binnumber=1; binnumber <= 120; binnumber++){
							binKey = nextLine[0] + nextLine[1] + String.valueOf(binnumber);
							hm.get(binKey).setSixContactDur(nextLine[binnumber+2]);
						}
						binnumber=1;
						break;
					case "Social Approach":  
						for (binnumber=1; binnumber <= 120; binnumber++){
							binKey = nextLine[0] + nextLine[1] + String.valueOf(binnumber);
							hm.get(binKey).setApproachDur(nextLine[binnumber+2]);
						}
						binnumber=1;
						break;
					case "Social Leave":  
						for (binnumber=1; binnumber <= 120; binnumber++){
							binKey = nextLine[0] + nextLine[1] + String.valueOf(binnumber);
							hm.get(binKey).setLeaveDur(nextLine[binnumber+2]);
						}
						binnumber=1;
						break;
					case "Social Follow":  
						for (binnumber=1; binnumber <= 120; binnumber++){
							binKey = nextLine[0] + nextLine[1] + String.valueOf(binnumber);
							hm.get(binKey).setFollowDur(nextLine[binnumber+2]);
						}
						binnumber=1;
						break;
					case "Social Sniff":  
						for (binnumber=1; binnumber <= 120; binnumber++){
							binKey = nextLine[0] + nextLine[1] + String.valueOf(binnumber);
							hm.get(binKey).setSniffDur(nextLine[binnumber+2]);
						}
						binnumber=1;
						break;
					case "Social Mount":  
						for (binnumber=1; binnumber <= 120; binnumber++){
							binKey = nextLine[0] + nextLine[1] + String.valueOf(binnumber);
							hm.get(binKey).setMountDur(nextLine[binnumber+2]);
						}
						binnumber=1;
						break;
					case "Social Compete":  
						for (binnumber=1; binnumber <= 120; binnumber++){
							binKey = nextLine[0] + nextLine[1] + String.valueOf(binnumber);
							hm.get(binKey).setCompeteDur(nextLine[binnumber+2]);
						}
						binnumber=1;
						break;
					default:
						break;
				}
			}
	    }
		
		
		// I can't figure out why this section of code is not ignoring the 'entries' that contain null data.
		// I know the null value is being converted to a string but my condition statement is still not detecting anything.
		int counter = 1;		
		for (String binKey : hm.keySet()) {
		    String[] entries = hm.get(binKey).toString().split("#");
		    if (entries[3]!="null,"){
		    	System.out.println(counter);
		    	System.out.println(entries[3]);
		    	writer.writeNext(entries);
		    	counter++;
		    }	    
		}
		reader.close();
		writer.close();
	}
}
