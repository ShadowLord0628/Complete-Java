Explaining all methods of each class in the Java Collection Framework with examples would be extensive, as the Java Collection Framework contains many classes, each with numerous methods. However, I’ll provide an overview of the most commonly used methods for each major class (`ArrayList`, `LinkedList`, `HashSet`, `TreeSet`, `PriorityQueue`, `ArrayDeque`, `HashMap`, and `TreeMap`) along with examples and their typical time complexities.

---

### 1. **ArrayList**

An `ArrayList` is a resizable array implementation of the `List` interface.

**Common Methods:**

- **add(element)** – Adds an element at the end of the list. O(1) (amortized)
- **add(index, element)** – Inserts an element at a specific position. O(n)
- **get(index)** – Returns the element at the specified position. O(1)
- **set(index, element)** – Replaces the element at the specified position. O(1)
- **remove(index)** – Removes the element at the specified position. O(n)
- **contains(element)** – Checks if the list contains the specified element. O(n)
- **size()** – Returns the number of elements. O(1)
- **clear()** – Removes all elements from the list. O(n)

**Example:**

```java
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
list.add(1, "Orange"); // Insert at index 1
System.out.println(list.get(1)); // Output: Orange
list.set(1, "Grape"); // Replace element at index 1
list.remove("Apple"); // Remove "Apple"
System.out.println(list.contains("Banana")); // Output: true
System.out.println(list.size()); // Output: 2
list.clear(); // Remove all elements
```

---

### 2. **LinkedList**

`LinkedList` is a doubly linked list implementation of the `List` and `Deque` interfaces.

**Common Methods:**

- **add(element)** – Adds an element at the end. O(1)
- **addFirst(element)** / **addLast(element)** – Adds elements at the beginning/end. O(1)
- **get(index)** – Returns the element at the specified index. O(n)
- **remove(index)** – Removes the element at the specified index. O(n)
- **contains(element)** – Checks if the list contains an element. O(n)
- **size()** – Returns the number of elements. O(1)

**Example:**

```java
import java.util.LinkedList;

LinkedList<String> linkedList = new LinkedList<>();
linkedList.add("Apple");
linkedList.addFirst("Mango"); // Add at beginning
linkedList.addLast("Banana"); // Add at end
System.out.println(linkedList.get(1)); // Output: Apple
linkedList.remove(2); // Removes "Banana"
System.out.println(linkedList.contains("Apple")); // Output: true
System.out.println(linkedList.size()); // Output: 2
```

---

### 3. **HashSet**

`HashSet` is a collection that contains no duplicate elements.

**Common Methods:**

- **add(element)** – Adds the specified element to the set if it’s not already present. O(1)
- **remove(element)** – Removes the specified element from the set. O(1)
- **contains(element)** – Returns true if the set contains the element. O(1)
- **size()** – Returns the number of elements in the set. O(1)
- **clear()** – Removes all elements from the set. O(n)

**Example:**

```java
import java.util.HashSet;

HashSet<String> set = new HashSet<>();
set.add("Apple");
set.add("Banana");
set.add("Apple"); // Duplicate, won’t be added
System.out.println(set.contains("Apple")); // Output: true
set.remove("Banana");
System.out.println(set.size()); // Output: 1
set.clear();
```

---

### 4. **TreeSet**

`TreeSet` is a sorted collection that doesn’t allow duplicates.

**Common Methods:**

- **add(element)** – Adds the element, maintaining order. O(log n)
- **remove(element)** – Removes the specified element. O(log n)
- **contains(element)** – Checks if the element is in the set. O(log n)
- **first() / last()** – Returns the first/last element. O(log n)
- **size()** – Returns the number of elements. O(1)

**Example:**

```java
import java.util.TreeSet;

TreeSet<Integer> treeSet = new TreeSet<>();
treeSet.add(50);
treeSet.add(20);
treeSet.add(40);
System.out.println(treeSet.first()); // Output: 20
System.out.println(treeSet.contains(40)); // Output: true
treeSet.remove(20);
System.out.println(treeSet.last()); // Output: 50
```

---

### 5. **PriorityQueue**

`PriorityQueue` is a queue where elements are ordered by priority.

**Common Methods:**

- **add(element)** – Adds the element according to its priority. O(log n)
- **peek()** – Returns the head of the queue without removing it. O(1)
- **poll()** – Retrieves and removes the head of the queue. O(log n)
- **remove(element)** – Removes the specified element. O(n)
- **contains(element)** – Checks if the queue contains the element. O(n)
- **size()** – Returns the number of elements. O(1)

**Example:**

```java
import java.util.PriorityQueue;

PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.add(10);
pq.add(5);
pq.add(20);
System.out.println(pq.peek()); // Output: 5
pq.poll(); // Removes 5
System.out.println(pq.contains(10)); // Output: true
```

---

### 6. **ArrayDeque**

`ArrayDeque` is a resizable array implementation of a double-ended queue.

**Common Methods:**

- **addFirst(element)** / **addLast(element)** – Adds elements at the beginning/end. O(1)
- **removeFirst() / removeLast()** – Removes elements from the beginning/end. O(1)
- **peekFirst() / peekLast()** – Retrieves the first/last element without removing. O(1)
- **size()** – Returns the number of elements. O(1)
- **clear()** – Removes all elements. O(n)

**Example:**

```java
import java.util.ArrayDeque;

ArrayDeque<String> deque = new ArrayDeque<>();
deque.addFirst("A");
deque.addLast("B");
System.out.println(deque.peekFirst()); // Output: A
deque.removeFirst();
System.out.println(deque.peekLast()); // Output: B
deque.clear();
```

---

### 7. **HashMap**

`HashMap` is a collection of key-value pairs with no specific order.

**Common Methods:**

- **put(key, value)** – Associates the specified value with the specified key. O(1)
- **get(key)** – Returns the value associated with the specified key. O(1)
- **remove(key)** – Removes the key-value pair for the specified key. O(1)
- **containsKey(key)** – Checks if the map contains the specified key. O(1)
- **containsValue(value)** – Checks if the map contains the specified value. O(n)
- **size()** – Returns the number of key-value pairs. O(1)
- **clear()** – Removes all key-value pairs. O(n)

**Example:**

```java
import java.util.HashMap;

HashMap<Integer, String> map = new HashMap<>();
map.put(1, "One");
map.put(2, "Two");
System.out.println(map.get(1)); // Output: One
map.remove(2);
System.out.println(map.containsKey(2)); // Output: false
map.clear();
```

---

### 8. **TreeMap**

`TreeMap` is a sorted map of key-value pairs based on keys.

**Common Methods:**

- **put(key, value)** – Associates the value with the key. O(log n)
- **get(key)** – Returns the value associated with the key. O(log n)
- **remove(key)** – Removes the key-value pair for the key. O(log n)
- **firstKey() / lastKey()** – Returns the first/last key. O(log n)
- **size()** – Returns the number of key-value pairs. O(1)

**Example:**

```java
import java.util.TreeMap;

TreeMap<Integer, String> treeMap = new TreeMap<>();
treeMap.put(3, "Three");
treeMap.put(1, "One");
System.out.println(treeMap.firstKey()); // Output: 1
System.out.println(treeMap.get(3)); // Output: Three
treeMap.remove(1);
System.out.println(treeMap.lastKey()); // Output: 3
```

---

Each of these classes has a broad range of methods, but these are the most commonly used ones.