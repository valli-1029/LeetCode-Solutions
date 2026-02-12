#include <string.h>
int strStr(char* haystack, char* needle) {
    if(strlen(needle)==0){
        return 0;
    }
    int n=strlen(haystack);
    int m=strlen(needle);

    for(int i=0;i<=n-m;i++){
        char *res = (char *)malloc((m+1)*sizeof(char));
        strncpy(res,haystack+i,m);
        res[m] ='\0';

        if (strcmp(res,needle)==0) {
            free(res);
            return i;
        }
        free(res);
    }
    return -1;
    }
