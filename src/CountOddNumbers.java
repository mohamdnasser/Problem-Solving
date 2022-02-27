import com.sun.tools.javac.Main;

public class CountOddNumbers {
    public static void main(String[] args)
    {
        CountOddNumbers obj = new CountOddNumbers();
        obj.countOdds(3,13);
    }

    public int countOdds(int low, int high){
        int answer = 0;
        if(low % 2 == 0 && high % 2 == 0){
            answer = (high - low) / 2;
            System.out.println(answer);
            return answer;
        }
        answer = (high - low) / 2 + 1;
        System.out.println(answer);
        return (high - low) / 2 + 1 ;
    }
      // solution 1
//    public int countOdds(int low, int high){
//        int count = 0;
//        for (int i = low; i <= high ; i++){
//            if(i % 2 == 1 ) {
//                count++;
//            }
//        }
//        System.out.println("Number of Odd Numbers = " + count);
//        return count;
//    }

    // solution 2
//    public int countOdds(int low, int high){
//        int count = 0;
//        while (low <= high){
//            if (low % 2 == 1)
//                count++;
//            low++;
//        }
//        System.out.println("Number of Odd Numbers = " + count);
//        return count;
//    }
}

