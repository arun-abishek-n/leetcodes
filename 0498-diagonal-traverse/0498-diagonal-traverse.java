class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rowLen = mat.length;
        int colLen = mat[0].length;
        int arr[]=new int[rowLen*colLen];
        int row=0,col=0;
        int index=0;
        int direction=1;
        while(index<arr.length){
            arr[index++]=mat[row][col];
            if(direction==1){
                if(col==colLen-1){
                    row++;
                    direction=0;
                }
                else if(row==0){
                    col++;
                    direction=0;
                }
                else{
                    row--;
                    col++;
                }
            }
            else{
                if(row==rowLen-1){
                    col++;
                    direction=1;
                }
                else if(col==0){
                    row++;
                    direction=1;
                }
                else{
                row++;
                col--;
                }
            }
        }
        return arr;
        
    }
}