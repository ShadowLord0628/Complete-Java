The **Java Collection Framework (JCF)** is a set of classes and interfaces that implement commonly reusable collection data structures such as Lists, Sets, Queues, and Maps. It provides a way to store and manipulate groups of objects efficiently.

Here’s an overview of the **core interfaces and their hierarchy** in the framework, along with examples, time complexities, and a description of each main class.

### Java Collection Framework Hierarchy

The main interfaces in the Java Collection Framework are:

1. **Collection Interface** - The root of the collection hierarchy.
   - **List** (e.g., `ArrayList`, `LinkedList`, `Vector`): Ordered collection that allows duplicate elements.
   - **Set** (e.g., `HashSet`, `LinkedHashSet`, `TreeSet`): Collection that does not allow duplicate elements.
   - **Queue** (e.g., `PriorityQueue`, `ArrayDeque`): Collection to hold elements for processing in a particular order.
   
2. **Map Interface** - Represents key-value pairs (not a subtype of Collection).
   - **Map** (e.g., `HashMap`, `LinkedHashMap`, `TreeMap`, `Hashtable`): Key-value pairs where keys are unique.

Each of these interfaces has various classes with unique characteristics and time complexities.

### Java Collection Framework Classes with Examples and Time Complexities

Below is a summary of the main collection classes with examples, their functions, and time complexity.

#### 1. **List Interface**

- **ArrayList**: Resizable array that allows random access.
  - **Time Complexity**: 
    - Access: O(1), Insert/Delete: O(n) (for worst-case resizing)
  - **Code Example**:

    ```java
    import java.util.ArrayList;

    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);  // O(1)
    list.get(0);   // O(1)
    list.remove(0); // O(n) due to shift
    ```

- **LinkedList**: Doubly linked list allowing fast insertions and deletions.
  - **Time Complexity**:
    - Access: O(n), Insert/Delete: O(1) at ends
  - **Code Example**:

    ```java
    import java.util.LinkedList;

    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(20);    // O(1) (at end)
    linkedList.addFirst(5); // O(1)
    linkedList.removeLast(); // O(1)
    ```

#### 2. **Set Interface**

- **HashSet**: Unordered collection with no duplicates, backed by a hash table.
  - **Time Complexity**: O(1) for add, remove, contains
  - **Code Example**:

    ```java
    import java.util.HashSet;

    HashSet<String> set = new HashSet<>();
    set.add("Apple");   // O(1)
    set.contains("Apple"); // O(1)
    set.remove("Apple"); // O(1)
    ```

- **TreeSet**: Sorted collection with no duplicates, implemented as a Red-Black tree.
  - **Time Complexity**: O(log n) for add, remove, contains
  - **Code Example**:

    ```java
    import java.util.TreeSet;

    TreeSet<Integer> treeSet = new TreeSet<>();
    treeSet.add(50);   // O(log n)
    treeSet.add(30);   // O(log n)
    treeSet.contains(50); // O(log n)
    ```

#### 3. **Queue Interface**

- **PriorityQueue**: A queue where elements are ordered based on natural ordering or a comparator.
  - **Time Complexity**: 
    - Insert: O(log n), Remove: O(log n)
  - **Code Example**:

    ```java
    import java.util.PriorityQueue;

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(5);   // O(log n)
    pq.add(10);  // O(log n)
    pq.poll();   // Removes and returns smallest element (O(log n))
    ```

- **ArrayDeque**: Resizable-array implementation of a deque (double-ended queue).
  - **Time Complexity**: O(1) for insertions and deletions at both ends.
  - **Code Example**:

    ```java
    import java.util.ArrayDeque;

    ArrayDeque<String> deque = new ArrayDeque<>();
    deque.addFirst("Start");  // O(1)
    deque.addLast("End");     // O(1)
    deque.removeFirst();      // O(1)
    ```

#### 4. **Map Interface**

- **HashMap**: Hash table implementation for key-value pairs with no order.
  - **Time Complexity**: O(1) for get, put (average case)
  - **Code Example**:

    ```java
    import java.util.HashMap;

    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "One");       // O(1)
    map.get(1);              // O(1)
    map.remove(1);           // O(1)
    ```

- **TreeMap**: Red-Black tree implementation of Map, sorted by keys.
  - **Time Complexity**: O(log n) for get, put
  - **Code Example**:

    ```java
    import java.util.TreeMap;

    TreeMap<Integer, String> treeMap = new TreeMap<>();
    treeMap.put(2, "Two");    // O(log n)
    treeMap.get(2);           // O(log n)
    ```

### Summary Table of Collection Classes and Their Time Complexities

| Class           | Data Structure     | Add       | Remove    | Contains   | Access |
|-----------------|--------------------|-----------|-----------|------------|--------|
| `ArrayList`     | Resizable Array    | O(1)      | O(n)      | O(n)       | O(1)   |
| `LinkedList`    | Doubly Linked List | O(1) (end)| O(1) (end)| O(n)       | O(n)   |
| `HashSet`       | Hash Table         | O(1)      | O(1)      | O(1)       | -      |
| `TreeSet`       | Red-Black Tree     | O(log n)  | O(log n)  | O(log n)   | -      |
| `PriorityQueue` | Binary Heap        | O(log n)  | O(log n)  | -          | -      |
| `ArrayDeque`    | Resizable Array    | O(1)      | O(1)      | -          | -      |
| `HashMap`       | Hash Table         | O(1)      | O(1)      | -          | O(1)   |
| `TreeMap`       | Red-Black Tree     | O(log n)  | O(log n)  | -          | O(log n) |

### Key Points to Remember

- **Lists** are ordered collections, allowing duplicates.
- **Sets** do not allow duplicates and often provide unique elements without specific order.
- **Queues** provide ordered processing, often based on priority or insertion order.
- **Maps** store key-value pairs and provide efficient access via unique keys.

The Java Collection Framework is versatile, offering various implementations to meet specific needs for performance and order. Each class has unique characteristics that affect its time complexity, so choose according to your use case requirements.