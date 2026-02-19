int computeArea(int ax1,int ay1,int ax2,int ay2,
                int bx1,int by1,int bx2,int by2){

    int area1=(ax2-ax1)*(ay2-ay1);
    int area2=(bx2-bx1)*(by2-by1);

    int left=ax1>bx1?ax1:bx1;
    int right=ax2<bx2?ax2:bx2;
    int bottom=ay1>by1?ay1:by1;
    int top=ay2<by2?ay2:by2;

    int overlap=0;

    if(right>left && top>bottom)
        overlap=(right-left)*(top-bottom);

    return area1+area2-overlap;
}
