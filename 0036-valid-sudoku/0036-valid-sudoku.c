bool isValidSudoku(char** board, int boardSize, int* boardColSize) {
    bool row[9][9]={false};
    bool col[9][9]={false};
    bool res[9][9]={false};

    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            if(board[i][j]=='.'){
                continue;
            }
            int num=board[i][j]-'1';
            int index=(i/3)*3+(j/3);
            if (row[i][num]||col[j][num]||res[index][num])
                return false;
            row[i][num]=true;
            col[j][num]=true;
            res[index][num]=true;
        }
    }
    return true;
}