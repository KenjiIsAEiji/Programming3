public class Test{
    public static void main(String[] args) {
        try{

            System.out.println();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("errorCode : " + e);
        }finally{
            System.out.println("End");
        }
    }
}