// Inherits from Module super class
public class SystemsAnalysis extends Module
{
    private double testAverage;
    private double presentationMark;
    
    public SystemsAnalysis()
    {
        testAverage = 0.0;
        presentationMark = 0.0;
    }
    
    public SystemsAnalysis(double testAverage, double presentationMark, String moduleName, String moduleCode)
    {
        super(moduleName, moduleCode);
        this.testAverage = testAverage;
        this.presentationMark = presentationMark;
    }
    
    public double getTestAverage()
    {
        return testAverage;
    }
    
    public void setTestAverage(double testAverage)
    {
        this.testAverage = testAverage;
    }
    
    public double getPresentationMark()
    {
        return testAverage;
    }
    
    public void setPresentationMark(double presentationMark)
    {
        this.presentationMark = presentationMark;
    }
    
    public double getParticipationMark()
    {
        return (testAverage * 0.7) + (presentationMark * 0.3);
    }
    
    public double getModuleMark()
    {
        return getParticipationMark();
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
