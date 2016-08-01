import java.io.*;

/**
 * Created by saic on 8/1/2016.
 */
public class Sample {
    public static  void main(String args[]) throws IOException {

        File input= new File("D://io//sample.txt");

        FileReader fr = new FileReader(input);
        int a=fr.read();
        System.out.println((char)a);
        System.out.println(System.getProperty("user.dir"));
        System.out.println(input.getPath());
        System.out.println(input.getAbsolutePath());

        try {
            InputStream file = new FileInputStream(input);
            int c=0;
            try {
                while((c=file.read())!=-1){
                    System.out.println((char)c);
                }

            } catch (IOException e) {

                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }

}
