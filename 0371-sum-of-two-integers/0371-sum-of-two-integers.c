int getSum(int sa, int sb) {
    unsigned int a=sa;
    unsigned int b=sb;

   unsigned int  c;
    while(b!=0){
        c=(a&b)<<1;
        a=a^b;
        b=c;

    }
    return a;
}