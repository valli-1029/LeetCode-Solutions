#include <stdlib.h>
#include <string.h>
char* multiply(char* num1,char* num2){
    int n=strlen(num1),m=strlen(num2);
    if(num1[0]=='0'||num2[0]=='0') return "0";
    int *res=(int*)calloc(n+m,sizeof(int));

    for(int i=n-1;i>=0;i--){
        for(int j=m-1;j>=0;j--){
            int mul=(num1[i]-'0')*(num2[j]-'0');
            int sum=mul+res[i+j+1];
            res[i+j+1]=sum%10;
            res[i+j]+=sum/10;
        }
    }

    char *ans=(char*)malloc(n+m+1);
    int i=0,k=0;
    while(i<n+m && res[i]==0) i++;
    for(;i<n+m;i++) ans[k++]=res[i]+'0';
    ans[k]='\0';
    return ans;
}