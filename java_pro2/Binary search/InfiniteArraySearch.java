public class InfiniteArraySearch {
    public static void main(String[] args) {
        // Infinite-sized array example
        int arr[] = {2, 4, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28};
        int target = 14;

        int index = findpos(arr, target);
        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found");
        }
    }

    // Function to find the position of the target in an infinite array
    public static int findpos(int arr[], int target) {
        int l = 0;
        int h = 1;

        // Expand the range until we find a value >= target
        while (arr[h] < target) {
            l = h;       // Move low to current high
            h = 2 * h;   // Double the high index
        }

        // Perform binary search between l and h
        return binarySearch(arr, l, h, target);
    }

    // Standard binary search implementation
    public static int binarySearch(int arr[], int l, int h, int target) {
        while (l <= h) {
            int mid = l + (h - l) / 2; // Prevent overflow

            if (arr[mid] == target) {
                return mid;   // Target found
            } else if (arr[mid] < target) {
                l = mid + 1;  // Search right half
            } else {
                h = mid - 1;  // Search left half
            }
        }
        return -1; // Return -1 if target is not found
    }
}
