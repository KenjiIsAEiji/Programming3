import java.io.*;

public class Report4{
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("C:/MyGitHub/Programming3/prog/Report4.java");
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter("C:/MyGitHub/Programming3/prog/OutPut.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            int lineCount = 1;
            String s;
            while((s = br.readLine()) != null){
                if(s.contains("{") && s.contains("}")){
                    bw.write(String.format("%04d:", lineCount) + "* " + s + "\n");
                }else if(s.contains("{")){
                    bw.write(String.format("%04d:", lineCount) + "+ " + s + "\n");
                }else if(s.contains("}")){
                    bw.write(String.format("%04d:", lineCount) + "- " + s + "\n");
                }else{
                    bw.write(String.format("%04d:", lineCount) + "  " + s + "\n");
                }

                lineCount++;
            }

            br.close();
            bw.close();
        }catch(IOException exception){System.out.println(exception);}
    }
}