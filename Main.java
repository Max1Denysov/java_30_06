class Box{
    double width,height,depth;
    Box(double w , double h , double d){
        System.out . println (" Koнcтpyиpoвaниe объекта Вох") ; 
        width = w;
        height = h;
        depth = d; 
    }
    double volume(){
        
       return  width * height * depth;
    }
}
class Main{
    public static void main(String args[]){
        Box mybox1 = new Box(10,10,15);
        Box mybox2 = new Box(3,6,9);
       

       double numb;

        
        System . out . println ( " Oбъeм равен " + mybox1.volume() ) ;
         
        System . out . println ( " Oбъeм равен " + mybox2.volume() ) ;


    }
}