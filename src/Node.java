import java.util.*;

public class Node<T> {
  T value;
  List<Node<T>> children;
  
  public Node(T value) {
    this.value = value;
    children = new ArrayList<>();
  }
}