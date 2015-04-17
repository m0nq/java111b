import java.util.*;

class StringList {

	private String[] data;
  private int elementCount;
	
	public StringList() {
		
		data = new String[4];
    elementCount = 0;
	}

	public void add(String value) {
		
		if (elementCount >= data.length)
    	doubleArrayCapacity();
    
    data[elementCount] = value;
    elementCount++;
	}

	public String get(int index) {
		
		return data[index];
	}

	public int size() {
		
		return elementCount;
	}

	public int totalCharacterCount() {
		
		String check = "";
		int accum = 0;

		for (int i = 0; i < elementCount; i++) {
			
			// if (data[i] != null) {
				
			// 	check = data[i];
			// }

			// for (int j = 0; j < elementCount; j++) {
				
				accum += data[i].length();
			// }
		}

		return accum;
	}

	public int totalVowelCount() {
		
		int accum = 0;

		for (int i = 0; i < elementCount; i++) {
				
			if (data[i].contains("a") || data[i].contains("e") || data[i].contains("i") || data[i].contains("o") || data[i].contains("u")) {

				accum++;
			}
		}

		return accum;
	}

	private void doubleArrayCapacity() {

    String[] newData = new String[data.length * 2];

    for (int i = 0; i < elementCount; i++) {
        newData[i] = data[i];
    }

    data = newData;

    System.out.println("(data increased to " + data.length + ")");
  }
}