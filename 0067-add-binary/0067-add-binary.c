#include <stdlib.h>
#include <string.h>
char* addBinary(char* a,char* b){
    int i=strlen(a)-1;
    int j=strlen(b)-1;
    int carry=0,k=0;

    char* res=(char*)malloc(10000*sizeof(char));

    while(i>=0 || j>=0 || carry){
        int sum=carry;

        if(i>=0) sum+=a[i--]-'0';
        if(j>=0) sum+=b[j--]-'0';

        res[k++]=(sum%2)+'0';
        carry=sum/2;
    }

    res[k]='\0';

    for(int l=0,r=k-1;l<r;l++,r--){
        char t=res[l];
        res[l]=res[r];
        res[r]=t;
    }

    return res;
}