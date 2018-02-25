package TimeComplexity;

public class FrogJmp {


    public static void main(String[] args) {
        FrogJmp frogJmp = new FrogJmp();

        int X = 10;
        int Y = 85;
        int D = 30;

        System.out.println(frogJmp.solution(X, Y, D));
    }


    public int solution(int X, int Y, int D) {

        if (validateInputs(X, Y)) return 0;

        int diff = Y-X;
        int totalJumps = diff/D;

        if (diff%D > 0)
            totalJumps++;

        return totalJumps;
    }

    private boolean validateInputs(int X, int Y) {
        if (X>=Y)
        {
            return true;
        }

        if (X > 1000000000 || X < 1 || Y > 1000000000 || Y < 1)
            return true;
        return false;
    }
}
