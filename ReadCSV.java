import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadCSV
{
    public static void main(String[] args) throws IOException
    {
        File fn = new File("C:/Users/.../VI_data.csv");
        Scanner scan = new Scanner(fn);

        while (scan.hasNextLine())
        {
            String line = scan.nextLine();
            
            String[] parts = line.split(",");
            
            double t = Double.parseDouble(parts[0]);
            double V = Math.abs(Double.parseDouble(parts[1]));
            double I = Math.abs(Double.parseDouble(parts[2]));

            if (I != 0)
            {
                double resistance = V / I;
                System.out.println("time: " + t + ", resistance: " + resistance);
            }
            else
            {
                System.out.println("time: " + t + ", resistance: undefined (I is 0)");
            }
        }

        scan.close();
    }
}
