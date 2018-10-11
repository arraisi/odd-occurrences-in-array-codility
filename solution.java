// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
     int i = 0;
     Arrays.sort(A);
     for (int temp : A) {
         if (A[i] != A[(i+1) % A.length]) {
             return A[i];
         }
         i += 2;
     }
     return A[A.length - 1];
    }
}
