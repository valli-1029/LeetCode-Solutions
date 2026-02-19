#include <string.h>
int calVal(char x ){
    if (x=='I') return 1;
    if (x=='V') return 5;
    if (x=='X') return 10;
    if (x=='L') return 50;
    if (x=='C') return 100;
    if (x=='D') return 500;
    if (x=='M') return 1000;
    return 0;
}

int romanToInt(char* s) {
    int total=0;
    int n=strlen(s);

    for(int i=0;i<n;i++){
        if(i<n-1 & (calVal(s[i])<calVal(s[i+1]))){
            total=total-calVal(s[i]);
        }
        else total=total+calVal(s[i]);
    }
    return total;
}