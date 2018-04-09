public class BinarySearch {
    static int[] list = {2, 4, 7, 23, 45, 56, 73, 83, 86, 90, 93, 96, 98};

    static int binarySearch(int[] list, int key){
        int low = 0;
        int hight = list.length - 1;
        while (low <= hight){
            int mid = (low + hight) / 2;
            if (key == list[mid]){
                return mid;
            } else if (key > list[mid]){
                low = mid + 1;
            } else {
                hight = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("index is: " + binarySearch(list, 23));
        System.out.println("index is: " + binarySearch(list, 100));
    }
}
