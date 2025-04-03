package q01;
class Pair<K, V> {
 private K key;
 private V value;

 public Pair(K key, V value) {
     this.key = key;
     this.value = value;
 }

 public K getKey() {
     return key;
 }

 public void setKey(K key) {
     this.key = key;
 }

 public V getValue() {
     return value;
 }

 public void setValue(V value) {
     this.value = value;
 }

 @Override
 public String toString() {
     return "Key: " + key + ", Value: " + value;
 }
}

public class q1 {
 public static void main(String[] args) {
     // Creating Pair objects
     Pair<String, Integer> pair1 = new Pair<>("One", 1);
     Pair<String, Integer> pair2 = new Pair<>("Two", 2);
     Pair<String, Integer> pair3 = new Pair<>("Three", 3);

     System.out.println(pair1);
     System.out.println(pair2);
     System.out.println(pair3);

     pair1.setKey("UpdatedOne");
     pair1.setValue(10);
     
     // Printing the updated pair
     System.out.println("Updated pair1: " + pair1);
 }
}
