public class mergesort {
    public static void main(String[] args) {
        
    }
    public static int[] Merge_TwoSorted_Array(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int[] ans = new int[n + m];
		int i = 0;// arr1
		int j = 0;// arr2
		int k = 0;// ans

		while (i < n && j < m) {

			if (arr1[i] <= arr2[j]) {
				ans[k] = arr1[i];
				k++;
				i++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}

		}
		while (i < n) {
			ans[k] = arr1[i];
			k++;
			i++;
		}

		while (j < m) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;

	}
}
