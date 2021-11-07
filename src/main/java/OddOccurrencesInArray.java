

public class OddOccurrencesInArray {

    public static void main(String[] args) {

        int[] arr = {4,1,1,1};
        Solution caseSolution = new Solution();
        System.out.println(caseSolution.solution(arr));
    }
}


class Solution {
        public int solution(int[] A) {
        int result = 0;
        for (int i =0;i<A.length;i++) {

            result ^= A[i];
        }
        return result;
        }
}

