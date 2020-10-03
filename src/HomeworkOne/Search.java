package HomeworkOne;

public class Search {
    public int search(int[] array, int x) {
        //Initializes the ranges of the array
        int middleIndex = array.length / 2;
        int low = 0;
        int high = array.length - 1;

        //Checks the middle number of the array to see if the requested number matches.
        //Performs binary search until number is found.
        for (int i = 0; i < array.length; i++) {
            if (x == array[middleIndex])
                return middleIndex;
            if (x > array[middleIndex]) {
                int increaseMiddleBy = (high - middleIndex) / 2;
                low = middleIndex;
                middleIndex = middleIndex + increaseMiddleBy;
            } else {
                int decreaseMiddleBy = (middleIndex - low) / 2;
                high = middleIndex;
                middleIndex = middleIndex - decreaseMiddleBy;
            }
        }
        return -1;
    }
}
