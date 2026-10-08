class Solution {
    public int balancedString(String s) {
        
        int n = s.length();
        int st = 0;
        int end = 0;
        
        int q = 0, w = 0, e= 0, r = 0;
        
        for(int i = 0; i<n; i++) {
            
            if( s.charAt(i) == 'Q')
                q++;
            if( s.charAt(i) == 'W')
                w++;
            if( s.charAt(i) == 'E')
                e++;
            if( s.charAt(i) == 'R')
                r++;                                    
        }

        
        int qq = q - n/4 <= 0 ? 0 : q-n/4; 
        int ww = w - n/4 <= 0 ? 0 : w-n/4; 
        int ee = e - n/4 <= 0 ? 0 : e-n/4; 
        int rr = r - n/4 <= 0 ? 0 : r-n/4;         

        int tempQ = 0, tempR = 0,  tempE = 0,  tempW = 0;
        int ans = Integer.MAX_VALUE;
        
        
        for(int i = 0; i<n; i++) {
            
            if ( s.charAt(i) == 'Q' )
                    tempQ++;
            if ( s.charAt(i) == 'W' )
                    tempW++;
            if ( s.charAt(i) == 'E' )
                    tempE++;
            if ( s.charAt(i) == 'R' )
                    tempR++;
                    
            
            if( tempQ >= qq && tempE >= ee && tempW  >= ww && tempR >= rr ) {
                
                ans = Math.min(ans, i-st+1);
                
                while( st <= i  ) {
                                        
                    if (s.charAt(st) == 'Q')
                        tempQ--;
                    if (s.charAt(st) == 'W')
                        tempW--;
                    if (s.charAt(st) == 'E')
                        tempE--;
                    if (s.charAt(st) == 'R')
                        tempR--;                    
                    
                    st++;
                    
                    if( tempQ >= qq && tempE  >= ee && tempW  >= ww && tempR >= rr )
                        ans = Math.min(ans, i-st+1);
                    else
                        break;
                     
                }
                                
            }
            
        }
        
        return ans;
        
    }
}
