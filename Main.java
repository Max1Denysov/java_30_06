class Box{
    double width,height,depth;
    Box(){
        System.out . println (" Koнcтpyиpoвaниe объекта Вох") ; 
        width = 10;
        height = 2;
        depth = 30;
    }
    double volume(){
        
       return  width * height * depth;
    }
}
class Main{
    public static void main(String args[]){
        Box mybox1 = new Box();
        Box mybox2 = new Box();
       

       

        
        System . out . println ( " Oбъeм равен " + mybox1.volume() ) ;
         
        System . out . println ( " Oбъeм равен " + mybox2.volume() ) ;


    }
}