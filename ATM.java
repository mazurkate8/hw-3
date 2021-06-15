class ATM{
 public  int countBanknotes(int number) {
        int[] arr = new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1};
        int i = 0;
        int count = 0;

        while (number > 0) {
            while ((number - arr[i]) >= 0) {
                    number -= arr[i];
                    count++;
                }

            if(i==arr.length-1){
                break;
            }
            i++;
        }
        return count;
    }
}