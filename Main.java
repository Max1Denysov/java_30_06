class Box{
    double width,height,depth;
    double volume(){
        
       return  width * height * depth;
    }
}
class Main{
    public static void main(String args[]){
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 160;
        mybox2.height = 620;
        mybox2.depth = 15;

        
        System . out . println ( " Oбъeм равен " + mybox1.volume() ) ;
         
        System . out . println ( " Oбъeм равен " + mybox2.volume() ) ;


    }
}