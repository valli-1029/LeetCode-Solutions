int kthFactor(int n, int k) {
    int count = 0;
    for (int i = 1; i * i <= n; i++) {
        if (n % i == 0) {
            count++;
            if (count == k) return i;
        }
    }
    for (int i = sqrt(n); i >= 1; i--) {
        if (n % i == 0) {
            int other = n / i;
            if (other != i) {
                count++;
                if (count == k) return other;
            }
        }
    }
    return -1;
}
