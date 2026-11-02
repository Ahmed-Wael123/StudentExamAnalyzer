# Student Exam Results Analyzer

A simple system developed to help university instructors analyze students' exam results by organizing and sorting student records in ascending order based on their exam scores.

## Algorithm Used: Merge Sort
For this system, **Merge Sort** was implemented to sort the student records.

### Why Merge Sort?
1. **Guaranteed O(n log n) Worst-Case Performance:** Unlike other sorting algorithms such as QuickSort (which can degrade to $O(n^2)$ in worst-case scenarios), Merge Sort strictly guarantees an $O(n \log n)$ time complexity across all cases (best, average, and worst).
2. **Stability:** Merge Sort is a stable sorting algorithm, meaning it preserves the relative order of students who achieve the exact same exam score.

## Complexity Analysis
* **Time Complexity:**
    * **Best Case:** $O(n \log n)$
    * **Average Case:** $O(n \log n)$
    * **Worst Case:** $O(n \log n)$

* **Space Complexity:**
    * **$O(n)$** because Merge Sort requires additional auxiliary memory space to store temporary sub-lists during the merging process.