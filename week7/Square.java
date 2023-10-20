package week7;

public class Square {
    private int length;
    public Square(){
        this.length = 0;
    }
    public Square(int length){
        this.length = length;
    }
    public int getPerimeter(){
        return this.length * 4;
    }
    public int getArea(){
        return this.length * this.length;
    }
}
