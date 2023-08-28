package gokul.August.aug17;

class PerfectNumber {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        for(int i = 1; i < n; i++){
           sum = 0;
            for(int j = i;j>=1;j--){
                if(i%j==0 && i!=j)
                    sum += j;
            }

            if(sum==i)
                System.out.println(sum);
        }

    }
}