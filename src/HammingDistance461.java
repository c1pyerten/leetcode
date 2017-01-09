/**
 * Created by hzz on 17/1/9.
 */
public class HammingDistance461 {
    public int solution(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

}
