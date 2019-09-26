import java.io.*;
import java.util.*;
import static java.lang.System.*;
public class oneLiner {
    public static void main(String[] args) throws IOException{

        try {
            Scanner file = new Scanner(new File("changeThis.dat"));
            String printed = "";
            file.useDelimiter("\\s+");
            String randomPicker = "";
            int randNum = (int) (Math.random() * 11);
            out.println(randNum);
            randomPicker = "output.txt";

            ArrayList<String> oneLetter = new ArrayList<>();
            ArrayList<String> twoLetter = new ArrayList<>();
            ArrayList<String> threeLetter = new ArrayList<>();
            ArrayList<String> fourLetter = new ArrayList<>();
            ArrayList<String> fiveLetter = new ArrayList<>();
            ArrayList<String> sixLetter = new ArrayList<>();
            ArrayList<String> sevenLetter = new ArrayList<>();
            ArrayList<String> eightLetter = new ArrayList<>();
            ArrayList<String> nineLetter = new ArrayList<>();
            ArrayList<String> tenLetter = new ArrayList<>();
            ArrayList<String> elevenLetter = new ArrayList<>();
            ArrayList<String> twelveLetter = new ArrayList<>();
            ArrayList<String> thirteenLetter = new ArrayList<>();
            ArrayList<String> fourteenLetter = new ArrayList<>();
            ArrayList<String> fifteenLetter = new ArrayList<>();
            ArrayList<String> sixteenLetter = new ArrayList<>();
            ArrayList<String> seventeenLetter = new ArrayList<>();
            ArrayList<String> eighteenLetter = new ArrayList<>();
            ArrayList<String> nineteenLetter = new ArrayList<>();
            ArrayList<String> twentyLetter = new ArrayList<>();
            ArrayList<String> twentyOneLetter = new ArrayList<>();
            ArrayList<String> twentyTwoLetter = new ArrayList<>();






            PrintWriter out = new PrintWriter(randomPicker);
            while (file.hasNextLine()) {
                String str = file.nextLine();
                switch(str.length())
                {
                    case 1: oneLetter.add(str);
                    break;
                    case 2: twoLetter.add(str);
                        break;
                    case 3: threeLetter.add(str);
                        break;
                    case 4: fourLetter.add(str);
                        break;
                    case 5: fiveLetter.add(str);
                        break;
                    case 6: sixLetter.add(str);
                        break;
                    case 7: sevenLetter.add(str);
                        break;
                    case 8: eightLetter.add(str);
                        break;
                    case 9: nineLetter.add(str);
                        break;
                    case 10: tenLetter.add(str);
                        break;
                    case 11: elevenLetter.add(str);
                        break;
                    case 12: twelveLetter.add(str);
                        break;
                    case 13: thirteenLetter.add(str);
                        break;
                    case 14: fourteenLetter.add(str);
                        break;
                    case 15: fifteenLetter.add(str);
                        break;
                    case 16: sixteenLetter.add(str);
                        break;
                    case 17: seventeenLetter.add(str);
                        break;
                    case 18: eighteenLetter.add(str);
                        break;
                    case 19: nineteenLetter.add(str);
                        break;
                    case 20: twentyLetter.add(str);
                        break;
                    case 21: twentyOneLetter.add(str);
                        break;
                    case 22: twentyTwoLetter.add(str);
                        break;
                }
                file.nextLine();

            }

            out.println("One Letter");

            for(int i = 0; i < oneLetter.size(); i++)
            {

            }

            out.println(printed);
            out.close();
        }
        catch (Exception e)
        {
            PrintWriter out = new PrintWriter("changeThis.dat");
            out.close();
            PrintWriter sout = new PrintWriter("Copy paste code to changeThis");
            sout.close();
        }
    }
}