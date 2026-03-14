#include <stdlib.h>
char* intToRoman(int num) {
    int val[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    char *ch[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    char *res=(char*)malloc(16);
    int i=0,j=0;
    while (num>0){
         if(num>=val[i]){
            int k=0;
            while(ch[i][k]){
                res[j++]=ch[i][k++];
            }
            num-=val[i];
        }
        else i++;
    }
    res[j]='\0';
    return res;
}
