import java.util.*;
public class Demo
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your test average for Data Analytics");
        double testAvg = scan.nextDouble();
        
        System.out.println("Enter your project mark for Data Analytics");
        double project = scan.nextDouble();
        
        System.out.println("Enter your exam mark for Data Analytics");
        double exam = scan.nextDouble();
        
        DataAnalytics data = new DataAnalytics(testAvg, project, exam, "Data Analytics", "CMPG222");
        
        System.out.println(data);  
        
        System.out.println("Enter your test average for Systems Analysis");
        double testAverage = scan.nextDouble();
        
        System.out.println("Enter your presentation mark for Systems Analysis");
        double presentation = scan.nextDouble();

        SystemsAnalysis systems = new SystemsAnalysis(testAverage, presentation, "Systems Analysis", "CMPG223");
        
        System.out.println(systems.toString());
        
    }
}
