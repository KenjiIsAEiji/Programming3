import java.util.Iterator;
import java.util.LinkedList;

public class ExerciseList{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("miyazawa");
        list.add("eiji");
        list.add("kanazawa");
        
        // for()
        // for(int i = 0; i < list.size();i++){
        //     String str = list.get(i);
        //     System.out.println(str);
        // }

        // extention for()
        // for(String str : list){
        //     System.out.println(str);
        // }

        // iterator
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
    }
}