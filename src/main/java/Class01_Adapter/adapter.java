package Class01_Adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @Author cx
 * @Data 2021/2/28 23:14
 */
public class adapter {

    /*
        如果两个类之间不能直接访问的话，则中间加入一层适配层即可
        最经典的例子就是inputStream转换成reader
     */
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("E:\\workspace\\Design-Pattern-Study\\src\\main\\java\\Class01_Adapter\\test.txt");
        // isr就是一层适配器
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader reader = new BufferedReader(isr);
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.print(line + "\t");
        }
    }

}
