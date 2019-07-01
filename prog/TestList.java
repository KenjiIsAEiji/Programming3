import java.util.ArrayList;

public class TestList{
    public static void main(String[] args) {
        ArrayList<String> month = new ArrayList<String>();
        month.add("January");
        month.add("February");
        month.add("March");

        for(int i = 0; i < month.size(); i++){
            System.out.println(month.get(i));
        }

        month.remove(1);
        System.out.printf("\n");

        for(int i = 0; i < month.size(); i++){
            System.out.println(month.get(i));
        }
    }
}