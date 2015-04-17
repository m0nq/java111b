public class StringListMain {

  public static void main(String[] args) {
    StringList x = new StringList();

    // x.add("first!");
    // x.add("second!");


    for (int i = 0; i < 4; i++) {
  
      x.add("This is # " + i);
      System.out.println(x.get(i));
    }

    System.out.println(x.totalVowelCount());

    System.out.println(x.totalCharacterCount());
  }
}