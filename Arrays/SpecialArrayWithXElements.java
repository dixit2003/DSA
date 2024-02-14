package Arrays;

public class SpecialArrayWithXElements {
    static int specialArray(int[] nums) {
        int x = nums.length;
        int[] counts = new int[x + 1];

        for (int num : nums) {
            if (num >= x)
                counts[x]++;
            else
                counts[num]++;
        }
        int res = 0;
        for (int i = counts.length - 1; i >= 0; i--) {
            res += counts[i];
            if (res == i)
                return i;
        }
        return -1;
    }
    static int specialArray2(int[] nums) {
        int end = nums.length;
        int start = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int count = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] >= mid)
                    count++;
            }
            if(count == mid)
                return mid;
            if(count > mid)
                start = mid+1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(specialArray2(new int[]{0, 4, 3, 0, 4}));
    }
}
