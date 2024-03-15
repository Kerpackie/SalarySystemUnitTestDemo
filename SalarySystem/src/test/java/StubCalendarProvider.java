import org.example.ICalendarProvider;

public class StubCalendarProvider implements ICalendarProvider
{

    private int daysUntilEOM;

    public void setDaysUntilEOM(int daysUntilEOM)
    {
        this.daysUntilEOM = daysUntilEOM;
    }

    @Override
    public int getDaysUntilEOM() {
        return daysUntilEOM;
    }
}
