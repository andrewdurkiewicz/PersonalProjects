import java.util.Scanner;
import javax.print.attribute.standard.Fidelity;
import java.io.*;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.awt.Desktop;
import java.util.Arrays;
public class CASI
{
    private Scanner scan;
    public static void main(String[] args)
    {
            Scanner scan = new Scanner(System.in);
            ArrayList<String> outputs = new ArrayList<String>();
            final Desktop desktop = Desktop.getDesktop();
            String csvFile = "/Users/adurkiew/Desktop/inputFileName.csv";
            String outText = "/Users/adurkiew/Desktop/NatureOut.txt";
           
            File file = new File(outText);
            File input = new File(csvFile);
 
            BufferedReader br = null;
            PrintWriter out = null;
           
            String line = "";
            String csvSplitBy = ",";
            try
            {
                if(input.exists()) {input.delete();}
                if(input.exists()) {input.delete();}
 
                input.createNewFile();
                System.out.println("Please input the information into the csv. When done, continue with space:\n");
                desktop.open(input);
                System.out.println(input.lastModified());
                long modified = input.setLastModified(input.lastModified());
               
                if(modified != input.lastModified())
                {
                    br = new BufferedReader(new FileReader(csvFile));
                    out = new PrintWriter(new FileWriter(csvFile));
                    int counter = 1;
                    while((line = br.readLine()) != null)
                    {
                            String[] filesnames = line.split(csvSplitBy);
                            String directory = filesnames[0];
       
                            if(directory.charAt(directory.length()-1)=='-')
                                {
                                    directory = directory.substring(0, directory.length() - 1);
                                }
                            String fix = "";
                            String[] p = Arrays.copyOfRange(filesnames, 1, filesnames.length - 3);
                            for(int i = 0; i<=p.length - 1; i++)
                            {
                                fix = fix + p[i];
                            }
                           
                           
                            fix = fix.replace(':', '-').replace('?','-');;
                            String journal = filesnames[filesnames.length - 3];
                            String date = filesnames[filesnames.length -2] + "," + filesnames[filesnames.length -1];
                            String str_final = directory + "-" + fix  + "-" + journal + "-" + date;
                            str_final = str_final.replace("\"","").replace(" | Interface Focus","").replace(':', '-').replace('?','-').replace("&", "");
                            out.println(counter +")     "+str_final);
                            counter++;
                            outputs.add(str_final);
                    }
                }
               
               
 
                br.close();
                out.close();
                desktop.open(file);
                while(scan.hasNextInt())
                {
                    System.out.println("Which would you like to copy?");
                    int choice = scan.nextInt();
                    System.out.println("The following has been updated to clipboard: ");
                    System.out.println(outputs.get(choice-1));
                    StringSelection selection = new StringSelection(outputs.get(choice-1));
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    clipboard.setContents(selection, selection);
                   
                   
                }
                scan.close();
            }
                catch (FileNotFoundException e)
                {
                    e.printStackTrace();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }          
                finally
                {
                    if (br != null)
                    {
                        try
                        {
                            br.close();
                            out.close();
                        }
                            catch (IOException e)
                        {
                                e.printStackTrace();
                        }
                    }
                }
    }
   
 
}