//Andrew Durkiewicz
import java.util.Scanner;
import java.io.*;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.awt.Desktop;
import java.util.Arrays;
public class CASI
{
    public Scanner scan;
    public static void main(String[] args) throws IOException
    {
            final Desktop desktop = Desktop.getDesktop();
            Scanner scan = new Scanner(System.in);
            String csvFile = "/home/andrew/PersonalProjects/fileOutStream/inputFileName.csv";
            String outText = "/home/andrew/PersonalProjects/fileOutStream/outputList.txt";
            File csv = new File(csvFile);
            File file = new File(outText);
            file.createNewFile();
            csv.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file,false);
            FileOutputStream csvOutputStream = new FileOutputStream(csv,false);
            ArrayList<String> outputs = new ArrayList<String>();



            BufferedReader br = null;
            PrintWriter out = null;
            String delim = ",";
            String change = "";

            System.out.println("Is there anything we need to remove?");
            boolean ischanged = false;//Is there anything we need to change?

            if (scan.hasNextLine())
            {
                change = scan.nextLine();//get removed text
                ischanged = true;
            }

            try
            {
                String line = "";//For our while statement. While a string exists.
                br = new BufferedReader(new FileReader(csvFile));
                out = new PrintWriter(new FileWriter(csvFile));
                int counter = 1;

                while ((line = br.readLine()) != null)
                {
                    String[] filesnames = line.split(delim);
                    String directory = filesnames[0];

                    if(directory.charAt(directory.length()-1)=='-')
                    {
                        directory = directory.substring(0, directory.length() - 1);
                    }

                    String fix = "";
                    String[] p = Arrays.copyOfRange(filesnames, 1, filesnames.length - 3);

                    for (int i = 0; i<=p.length - 1; i++)
                    {
                        fix = fix + p[i];
                    }

                    fix = fix.replace(':', '-').replace('?','-');
                    String journal = filesnames[filesnames.length - 3];
                    String date = filesnames[filesnames.length -2] + "," + filesnames[filesnames.length -1];
                    String str_final = directory + "-" + fix  + "-" + journal + "-" + date;
                    str_final = str_final.replace("\"","").replace(':', '-').replace('?','-').replace("&", "");

                    if (ischanged == true)
                    {
                        str_final=str_final.replaceAll(change, "");
                    }

                    out.println(counter +")     "+str_final);
                    counter++;
                    outputs.add(str_final);
                    }

                //close the writer
                br.close();
                out.close();

                //open file to read which output works
                desktop.open(file);


                //This allows you to copy though typing in a value
                while(true)
                {
                    System.out.println("Which would you like to copy?");
                    int choice = scan.nextInt();
                    System.out.println("The following has been updated to clipboard: ");
                    System.out.println(outputs.get(choice-1));
                    StringSelection selection = new StringSelection(outputs.get(choice-1));
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    clipboard.setContents(selection, selection);
                }
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
