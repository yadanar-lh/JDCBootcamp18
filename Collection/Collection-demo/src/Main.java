public class Main {
    static void main() {
        HashTable hashTable = new HashTable(10);
        hashTable.add("A");
        hashTable.add("AB");
        hashTable.add("ABC");
        hashTable.add("BC");
        hashTable.add("DF");
        hashTable.display();

        hashTable.remove("BC");
        hashTable.display();
        System.out.println("DF Found at: " + hashTable.search("DF"));
        hashTable.display();

//        System.out.println("A found at : " + hashTable.search("DF"));
    }
}
