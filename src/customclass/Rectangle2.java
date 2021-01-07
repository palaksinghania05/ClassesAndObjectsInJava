package customclass;

public class Rectangle2 {
    //Instance variable
    private int length; //default value
    private int width;
    //defining constructors
    //no parameter constructor
    public Rectangle2(){
        length = 0;
        width = 0;
    }
    //parametrized constructor
    public Rectangle2(int len, int wid) {
        length = len;
        width = wid;
    }

        //getter for length
        public int getLength(){
            return length;
        }
        //getter for width
        public int getWidth(){
            return width;
        }
        //setter for length
        public void setLength(int len){
            length = len;
        }
        //setter for width
        public void setWidth(int wid){
            width = wid;
        }
}
