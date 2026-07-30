# Merge Sort Algorithm Implementation (Java)

## Project Overview
A standard console-based implementation of the Merge Sort algorithm in Java. This code follows the divide-and-conquer approach to sort an array of integers in ascending order.

Developed as part of the Data Structures and Algorithms in Java module (ITDJA2-44) at Eduvos.

## How to Run
This is a standard Java console application. You can run it using NetBeans, IntelliJ, Eclipse, or the command line.

**Command line execution:**
1. Navigate to the `src` folder.
2. Compile: `javac com/mergesort/MergeSort.java`
3. Run: `java com.mergesort.MergeSort`

## Code Structure
```text
src/
└── com/
    └── mergesort/
        └── MergeSort.java
.gitignore
pom.xml
README.md

## Algorithm Details
The implementation consists of two primary methods:

1. **mergeSort()** - Recursively divides the array into left and right halves until each subarray contains a single element.
2. **merge()** - Compares elements from the left and right subarrays and merges them back into the original array in ascending order.

## Time and Space Complexity
- **Time Complexity:** O(n log n) for best, average, and worst cases. This is because the array is split log n times, and each level requires n comparisons during merging.
- **Space Complexity:** O(n) - Requires auxiliary arrays to store temporary data during the merge phase.

## Sample Output
<img width="1047" height="229" alt="image" src="https://github.com/user-attachments/assets/af10f140-dece-46cd-bd0e-39840abb16f7" />

## Author
Kamogelo Phale
