public class HammingDistance461 {
    public int solution(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

}
