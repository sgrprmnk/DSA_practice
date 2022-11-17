class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int rect1=(ax2-ax1)*(ay2-ay1);
        int rect2=(bx2-bx1)*(by2-by1);
        int xOverlap=Math.min(ax2,bx2)-Math.max(ax1,bx1);
        
        int yOverlap=Math.min(ay2,by2)-Math.max(ay1,by1);
        int overLap=0;
        if(xOverlap>0 && yOverlap>0){
         overLap=   xOverlap*yOverlap;
        }
        
        
        
        int res=rect1+rect2-overLap;
        return res;
        
    }
}
