
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moham
 */
public class ConsoleIntoFile {
    public void readConsole() throws IOException
    {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );
        String file_name = "console_inputs.txt";
        File file = new File(file_name);
        boolean res = file.createNewFile();
        if(!res){
            System.out.println("Failed to create a new file, May be it's already created!");
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        String new_line;
        do {
            System.out.println("Enter Data: ");
            new_line = "";
            try {
                new_line = reader.readLine();
                System.out.println("Data is: " + new_line);
                bw.append(new_line);
                if(!"stop".equals(new_line.toLowerCase())){
                    bw.newLine();
                }
            } catch (IOException ex) {
                System.out.println("Failed to load this: " + new_line);
            }
        } while(!"stop".equals(new_line.toLowerCase()));
        bw.close();
    }
}
