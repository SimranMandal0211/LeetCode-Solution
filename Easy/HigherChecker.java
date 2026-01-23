class Solution {
    public int HigherChecker(int[] heights){
        int h = heights.length;
        int[] res = heights.clone();

        for(int i = 0; i < h - 1; i++){
            for(int j = 0; j < h -1 -i; j++){
                if(heights[j] > heights[j+1]){
                    int temp = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = temp;
                }
            }
        }
        int count = 0;
        for(int i = 0; i<h; i++){
            if(heights[i] != res[i]){
                count++;
            }
        }

        return count;
    }
}