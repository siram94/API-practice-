public class Maxmin {

    public static void main(String[] args)
    {

        int[] arr = { 5,15,86,92,36,4,78};
        int max = arr[0];
        int secondmax =arr[0];

        int min = arr[0];
        int secondmin =arr[0];

        for (int i=0;i< arr.length;i++ ) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("");

        for (int i=0;i< arr.length;i++) {
            if (arr[i] > max) {
                secondmax = max;
                max = arr[i];
            } else if (arr[i] > secondmax){
                secondmax = arr[i];

            }}
        System.out.println("\nthe second max is " +secondmax);

        for ( int i=0;i< arr.length;i++){
            if(arr[i]<min){
                secondmin = min;
                min = arr[i];

            }else  if(arr[i]<secondmin){
                secondmin = arr[i];

            }
        }
        System.out.println("\nthe second min is " +secondmin);

    }
}
