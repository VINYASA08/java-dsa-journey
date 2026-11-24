//https://leetcode.com/problems/median-of-two-sorted-arrays/description/


public class leet_4 {

    static void main(String[] args) {

        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};

        findMedianSortedArrays(nums1,nums2);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] smaller = nums1.length <= nums2.length ? nums1 : nums2;
        int[] larger = nums1.length <= nums2.length ? nums2 : nums1;

        int total = nums1.length + nums2.length;
        int half = (total + 1) / 2;

        int low = 0;
        int high = smaller.length;

        while (low <= high) {

            int partx = low + (high - low) / 2;
            int party = half - partx;

            int l1 = partx == 0 ? Integer.MIN_VALUE : smaller[partx - 1];
            int r1 = partx == smaller.length ? Integer.MAX_VALUE : smaller[partx];

            int l2 = party == 0 ? Integer.MIN_VALUE : larger[party - 1];
            int r2 = party == larger.length ? Integer.MAX_VALUE : larger[party];

            if (l1 <= r2 && l2 <= r1) {

                if (total % 2 == 0) {
                    return ((double) Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                }

                return Math.max(l1, l2);

            } else if (l1 > r2) {
                high = partx - 1;
            } else {
                low = partx + 1;
            }
        }

        return 0.0;
    }

}
