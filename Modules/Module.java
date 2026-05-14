public abstract class Module
{
    private String moduleName;
    private String moduleCode;
    
    
    protected Module ()
    {
        
    }
    
    protected Module (String moduleName, String moduleCode)
    {
        this.moduleName = moduleName;
        this.moduleCode = moduleCode;
    }
    
    public String getModuleName()
    {
        return moduleName;
    }
    
    public void setModuleName(String moduleName)
    {
        this.moduleName = moduleName;
    }
    
    public String getModuleCode()
    {
        return moduleCode;
    }
    
    public void setModuleCode(String moduleCode)
    {
        this.moduleCode = moduleCode;
    }
    
    public abstract double getParticipationMark();
    
    public abstract double getModuleMark();
    
    public String toString()
    {
         return "The module marks for Data Analytics and Systems Analysis are calculates using Java";
    }
}
