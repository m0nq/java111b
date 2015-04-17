public class SimpleStringList {

  protected String[] data;
  protected int elementCount;

  public SimpleStringList() {
    data = new String[4];
    elementCount = 0;
  }

  public void add(String value) {

    if (elementCount >= data.length) {
      // bail
      System.out.println("Sorry. No more words.");
      return;
    }

    data[elementCount] = value;
    elementCount++;
  }

  public String get(int index) {

    return data[index];
  }

  public int size() {

    return elementCount;
  }

  public boolean contains(String value) {

    for (int i = 0; i < elementCount; i++) {
        if (data[i] == value) {
            return true;
        }
    }

    return false;
  }
}