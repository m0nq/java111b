public class DynamicStringList extends SimpleStringList {

  public DynamicStringList() {
    super();
  }

  public void add(String value) {

    if (elementCount >= data.length) {
        doubleArrayCapacity();
    }

    super.add(value);
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