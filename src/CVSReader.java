import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Project: LinearRegression
 * Package: PACKAGE_NAME
 * <p>
 * User: Nguyen Vi
 * Date: 12/1/2020
 * Time: 10:29 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class CVSReader {


    private static final List<RealEstate> list = new ArrayList<>();
    public static void readFromCSV(String fileName)
    {
        Path path = Paths.get(fileName);

        try(BufferedReader br = Files.newBufferedReader(path , StandardCharsets.US_ASCII))
        {
            String line = br.readLine();
            while(line != null)
            {
                String[] array = line.split(",");
                RealEstate res = createRealEstate(array);
                list.add(res);
                line = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void printOut()
    {
        list.forEach(System.out::println);
    }

    private static RealEstate createRealEstate(String[] arr)
    {
        double x2 = Double.parseDouble(arr[0]);
        double x3 = Double.parseDouble(arr[1]);
        int x4 = Integer.parseInt(arr[2]);
        double x5 = Double.parseDouble(arr[3]);
        double x6 = Double.parseDouble(arr[4]);
        double y = Double.parseDouble(arr[5]);
        RealEstate res = new RealEstate(x2,x3,x4,x5,x6,y);
        return res;

    }
}
