#include <stdlib.h>

char* convertToTitle(int columnNumber){
    char *res=(char*)malloc(25);
    int i=24;
    res[i--]='\0';

    while(columnNumber>0){
        columnNumber--;
        res[i--]=(columnNumber%26)+'A';
        columnNumber/=26;
    }
    return res+i+1;
}