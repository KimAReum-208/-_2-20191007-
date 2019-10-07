import java.io.*;
import java.util.*;
/**
 * 여기에 FileReader 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class FileReaderTest{
    public static void main (String args[]){
        HashMap<String, Integer> score = new HashMap<String, Integer>(); 

        try{
            FileReader fr = new FileReader("c:\\Temp\\inputData20191007.txt");
            Scanner scanner = new Scanner(fr);

            String key;
            String value;
            while(scanner.hasNext()){
                String word = scanner.nextLine();
                String[] s = word.split(" ");

                key = s[0];
                value = s[1];
                
                System.out.println(key + value);
                
            }
        }catch(IOException e){
            System.out.println("파일을 찾을 수 없습니다");
        }
    }
}
