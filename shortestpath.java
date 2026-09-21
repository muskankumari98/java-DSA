public class shortestpath {


    //displacement
    //displacement=sqrt(x1-x2)*2+(y1-y2)*2
    //initially 
    //x=0,y=0
    //north  y+1
    //south  y-1
    //east   x+1
    //west   x-1
    
    public static float getShortestPath(String path) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
              //south
            if (dir == 'S') {
                y--;
            } 
            //north
            else if (dir == 'N') {
                y++;
            }
             //east
             else if (dir == 'E') {
                x++;
            }
             //west
             else if (dir == 'W') {
                x--;
            }
        }

        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
       



    public static void main(String[] args) {
       // String path = "WNEENESENNN";
          String path = "NS";
        System.out.println(getShortestPath(path));
    }
}



//T(n)=O(n)