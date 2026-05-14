// Inherits from Module superclass
public class DataAnalytics extends Module
{
    private double testAverage;
    private double projectMark;
    private double examMark;
    
    
    public DataAnalytics()
    {
        testAverage = 0.0;
        projectMark = 0.0;
        examMark = 0.0;
    }
    
    public DataAnalytics(double testAverage, double projectMark, double examMark, String moduleName, String moduleCode)
    {
        super(moduleName, moduleCode);
        this.testAverage = testAverage;
        this.projectMark = projectMark;
        this.examMark = examMark;
    }
    
    public double getTestAverage()
    {
        return testAverage;
    }
    
    public void setTestAverage(double testAverage)
    {
        this.testAverage = testAverage;
    }
    
    public double getProjectMark()
    {
        return projectMark;
    }
    
    public void setProjectMark(double projectMark)
    {
        this.projectMark = projectMark;
    }
    
    public double getExamMark()
    {
        return examMark;
    }
    
    public void setExamMark(double examMark)
    {
        this.examMark = examMark;
    }
    
    public double getParticipationMark()
    {
        return (testAverage * 0.6) + (projectMark * 0.4);
    }
    
    public double getModuleMark()
    {
        return (getParticipationMark() * 0.5) + (examMark * 0.5);
    }
    
    
    @Override
    public String toString()
    {
        if (getModuleMark() > 75.0)
        {
            return "Your final mark for " + getModuleName() + "(" + getModuleCode() + ")" + " is " + getModuleMark() + " which is a distinction";
        }
        else if(getModuleMark() > 50.0)
        {
            return "Your final mark for " + getModuleName() + "(" + getModuleCode() + ")" + " is " + getModuleMark() + " which is a pass";
        }
        else
        {
            return "Your final mark for " + getModuleName() + "(" + getModuleCode() + ")" + " is " + getModuleMark() + " which is a fail";
        }
    }
}
