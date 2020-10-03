package HomeworkOne;

public class Main {

    public static void main(String[] args) {
        Search binarySearch = new Search();
        int[] array = new int[]{1,2,4,8,16,32,64,128,256,512,1024,2048,4096};
        int x = 128;
        System.out.println(binarySearch.search(array,x));
    }
}
