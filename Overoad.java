class Over {
    void test () {
        System.out . println ( "Пapaмeтpы отсутствуют") ;
    }
    void test ( int а) {
        System.out.println ( "a: " + а );
    }
    void test ( int а, int Ь) {
        System . out . println ("a и Ь: "+а +""+ Ь);
    }
    double test ( double а) {
        System . out . println ( "double а: " + а );
        return а*а; 
    }

}

class Overload{
    
    public static void main(String args[]){
        Over something =  new Over();
        something.test();
        something.test(12);
        something.test(12,34);
        something.test(323.45);

    }
}
