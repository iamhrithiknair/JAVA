class UseStatic{
    static int a = 3;
    static int b = 4;

    static void meth(){
        
        System.out.println("a="+ a );
        
    }

}   
class eg{
    public static void main(String args[]){
        UseStatic.meth();
        System.out.println("b=" + UseStatic.b);
    }
}