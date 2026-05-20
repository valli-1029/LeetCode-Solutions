// import java.util.*;

// class Fancy {

//     ArrayList<Integer> a = new ArrayList<>();
//     int MOD=1000000007;

//     public Fancy(){


//     }

//     public void append(int val) {
//         a.add(val);
//     }

//     public void addAll(int inc) {
//         for (int i=0;i<a.size();i++) {
//             a.set(i, (int)(((long)a.get(i) + inc) % MOD));
//         }
//     }
//     public void multAll(int m) {
//         for (int i = 0; i < a.size(); i++) {
//             a.set(i, (int)(((long)a.get(i) * m) % MOD));
//         }
//     }
//     public int getIndex(int idx) {
//         if (idx >= a.size()) {
//             return -1;
//         }
//         return a.get(idx);
//     }
// }
import java.util.*;

class Fancy {

    List<Long> list;

    long mul;
    long add;

    int MOD = 1000000007;

    public Fancy() {
        list = new ArrayList<>();
        mul = 1;
        add = 0;
    }

    public void append(int val) {
        long x = ((val - add + MOD) % MOD);
        x = (x * modInverse(mul)) % MOD;
        list.add(x);
    }

    public void addAll(int inc) {
        add = (add + inc) % MOD;
    }

    public void multAll(int m) {
        mul = (mul * m) % MOD;
        add = (add * m) % MOD;
    }

    public int getIndex(int idx) {
        if (idx >= list.size()) {
            return -1;
        }
        long val = list.get(idx);
        return (int)((val * mul + add) % MOD);
    }

    private long power(long a, long b) {
        long ans = 1;
        while (b > 0) {

            if ((b & 1) == 1) {
                ans = (ans * a) % MOD;
            }
            a = (a * a) % MOD;
            b >>= 1;
        }
        return ans;
    }
    private long modInverse(long x) {
        return power(x, MOD - 2);
    }
}