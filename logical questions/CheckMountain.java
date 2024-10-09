public class CheckMountain {

    public boolean validMountainArray(int[] arr) {
        boolean checLeft = checkLeft(arr);
        boolean checkRigh = checkRigh(arr);

        return checLeft == checkRigh;
    }

    boolean checkLeft(int[] arr){
        int s = 0;
        int e = arr.length-1;
        
        while(s<=e){
            int mid = s + (e-s)/2;

            if (arr[mid] < arr[mid +1]) {
                e  = mid - 1;
            }else{
                return false;
            }
        }
        return true;
    }

    boolean checkRigh(int[] arr){
        int s = 0;
        int e = arr.length-1;
        
        while(s<=e){
            int mid = s + (e-s)/2;

            if (arr[mid] > arr[mid + 1]) {
                s  = mid + 1;
            }else{
                return false;
            }    
        }
        return true;
    }

    public static void main(String[] args) {
       CheckMountain checkmount = new CheckMountain();
       int[] arr = {3,5,5};

       System.out.println(checkmount.validMountainArray(arr));
    }
}
