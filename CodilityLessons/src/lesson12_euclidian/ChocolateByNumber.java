package lesson12_euclidian;

import java.util.HashSet;
import java.util.Set;

public class ChocolateByNumber {

    public static void main(String[] args) {

        System.out.println(solution(10,4));

    }

    public static int solution(int N, int M) {

        if (N == 1)
            return 1;

        if(M == 1)
            return N;

        Set visited = new HashSet();

        for(int i = 0; visited.contains(i) == false ;i = rotatedIndex(i,M,N)){
            visited.add(i);
        }

        return visited.size();
    }

    private static int rotatedIndex(int i , int m, int lastIndex){

        if((i+m) > lastIndex){
            return m-(lastIndex -(i+m));
        }

        return i+m;
    }
}
