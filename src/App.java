public class App {
    public static void main(String[] args) throws Exception {
        int[] arr={1,4,2,6,44,86,33};

        for (int i=0; i<arr.length-1;i++){
            for (int j=0; j<arr.length-i-1; j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
