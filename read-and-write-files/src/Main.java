import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // How to write a file using java (4 popular options)

        // FileWriter -> Good for sm or md text files
        // BufferedWriter -> Better performance for large amounts of text
        // PrintWriter -> Best for structured data (reports/logs)
        // FileOutputStream -> Best for binary files (images/audio)

        // File Writer option:
        // String filePath = "/Users/diogomonteiro/Desktop/test1.txt";
        String filePath = "test.txt";
        /*
        String textContent = "I like pizza!";
        try(FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e) {
            // SAFETY NET / GLOBAL CATCH
            System.out.println("Could not write file");
        }
        */


        // How to read a file using Java (3 popular options)

        // BufferedReader + FileReader -> Best for reading text files line-by-line
        // FileInputStream -> Best for binary files (images/audio)
        // RandomAccessFile -> Best for read/write specific portions of a large file

        // BufferedReader + FileReader option:

        try(BufferedReader reader = new BufferedReader(new FileReader((filePath)))) {
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        catch (IOException e) {
            // SAFETY NET
            System.out.println("Something went wrong");
        }

    }
}