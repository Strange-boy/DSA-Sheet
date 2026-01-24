# 📋 Linked List

---

## Basic Linked List Operations

| No. | Problem      | Platform  | Solution                                              | Difficulty | Last Revised | Solved on my own |
|-----|--------------|-----------|-------------------------------------------------------|------------|--------------|------------------|
| 1   | Add Last     | Pepcoding | [AddLast.java](AddLast.java)                         | 🟢 Easy    | 2026-01-20   | ✅ Yes           |
| 2   | Display      | Pepcoding | [DisplayLinkedList.java](DisplayLinkedList.java)     | 🟢 Easy    | 2026-01-20   | ✅ Yes           |
| 3   | Remove First | Pepcoding | [RemoveFirst.java](RemoveFirst.java)                 | 🟢 Easy    | 2026-01-20   | 🔶 With help     |
| 4   | Get Value    | Pepcoding | [GetValue.java](GetValue.java)                       | 🟢 Easy    | 2026-01-24   | 🔶 With help     |

---

## 📝 Notes

### What is a Linked List?
A linked list is a linear data structure where elements are stored in nodes, and each node contains a data field and a reference (link) to the next node in the sequence.

### Key Operations:
- **addLast()**: Add element to the end of the linked list
- **addFirst()**: Add element to the beginning of the linked list  
- **addAt()**: Add element at a specific position
- **removeFirst()**: Remove element from the beginning
- **removeLast()**: Remove element from the end
- **removeAt()**: Remove element from a specific position
- **display()**: Display all elements in the linked list
- **getFirst()**: Get first element
- **getLast()**: Get last element
- **getAt()**: Get element at specific position

### Time Complexity:
- **addLast()**: O(1) when tail pointer is maintained
- **addFirst()**: O(1)
- **removeFirst()**: O(1)
- **removeLast()**: O(n) (without doubly linked list)
- **getAt()**: O(n)

### Space Complexity:
- **Space**: O(n) where n is the number of elements

---

## 🚀 Progress

- [x] Add Last operation
- [x] Display operation
- [x] Remove First operation
- [ ] Remove Last operation
- [ ] Remove At operation
- [x] Get Value operations (getFirst, getLast, getAt)
- [ ] Size operation
- [ ] Reverse Linked List
- [ ] Merge Two Linked Lists
- [ ] Find Middle Element
- [ ] Detect Cycle
- [ ] Remove Cycle