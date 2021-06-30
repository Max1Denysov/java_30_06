class Box{
    double width,height,depth;
    void volume(){
        
        System.out.print("Object = ");
        System.out.println( width * height * depth);
    }
}
class Main{
    public static void main(String args[]){
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 160;
        mybox2.height = 620;
        mybox2.depth = 15;

        mybox1.volume();
        mybox2.volume();


    }
}