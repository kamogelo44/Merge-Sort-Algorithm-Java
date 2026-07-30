# Merge Sort Algorithm Implementation (Java)

## Project Overview
A standard console-based implementation of the Merge Sort algorithm in Java. This code follows the divide-and-conquer approach to sort an array of integers in ascending order.

Developed as part of the Data Structures and Algorithms in Java module (ITDJA2-44) at Eduvos.

**Given the array:** `[4, 2, 6, 5, 3, 9]`

---

## Visual Diagram & Algorithm Walkthrough

Below is a visualization of how the Merge Sort algorithm performs an ascending sort on the given array:

<img width="940" height="810" alt="Merge Sort Diagram" src="https://github.com/user-attachments/assets/433305af-082a-4171-a6e2-769be9ec773f" />

### Step 1: Divide
The end goal is to ensure that all elements are separated into singular sub-arrays.

- `[4, 2, 6, 5, 3, 9]` is divided into `[4, 2, 6]` and `[5, 3, 9]`.
- `[4, 2, 6]` is divided into `[4, 2]` and `[6]`, then divided again into `[4]`, `[2]`, and `[6]`.
- `[5, 3, 9]` is divided into `[5, 3]` and `[9]`, then divided again into `[5]`, `[3]`, and `[9]`.

### Step 2: Conquer
Sort the elements in ascending order during the merge phase.

- `[2]` is smaller than `[4]`, so they swap places. `[2]` becomes first and `[4]` becomes second, resulting in the sub-array `[2, 4]`.
- As we add the outlier `[6]` to the merged sub-array `[2, 4]`, we compare to ensure it is placed last. The result is `[2, 4, 6]`.
- The same process is repeated on the right-side sub-arrays, resulting in `[3, 5, 9]`.

### Step 3: Merge
Combine and sort the left and right sub-arrays in ascending order while merging.

- When we sort the elements from both arrays, we end up with the fully sorted array:  
  `[2, 3, 4, 5, 6, 9]`

---

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
```
Algorithm Details
The implementation consists of two primary methods:

mergeSort() - Recursively divides the array into left and right halves until each subarray contains a single element.

merge() - Compares elements from the left and right subarrays and merges them back into the original array in ascending order.

Time and Space Complexity
Time Complexity: O(n log n) for best, average, and worst cases. This is because the array is split log n times, and each level requires n comparisons during merging.

Space Complexity: O(n) - Requires auxiliary arrays to store temporary data during the merge phase.

## Sample Output
<img width="1047" height="229" alt="image" src="https://github.com/user-attachments/assets/af10f140-dece-46cd-bd0e-39840abb16f7" />

## Author
Kamogelo Phale
