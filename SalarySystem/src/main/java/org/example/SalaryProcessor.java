package org.example;

public class SalaryProcessor
{
    private final ICalendarProvider _calendarProvider;

    public SalaryProcessor(ICalendarProvider calendarProvider) {
        _calendarProvider = calendarProvider;
    }

    public Boolean lodgeSalaries(String dataFile)
    {
        // First piece of business logic is to check that the dataFile has a valid extension.
        if(!dataFile.endsWith(".data")) {
            return false;  //dataFile extension is invalid
        }
/*
        Boolean status = _extensionManager.isValid(dataFile);

        if (status == false) {
            return false;
        }*/

/*
        // Next piece of business logic is to check that five days remain in
        // the month i.e. the current date is 5 days before the end of the month
        Calendar cal = Calendar.getInstance();
        int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        // maxDay stores the number of days in the current month.
        if(cal.get(Calendar.DAY_OF_MONTH)< maxDay-7) {
            readTheDataFileAndProcessSalaries();
            return true;
        }
        else {
            return false;
        }*/

        int daysUntilEOM = _calendarProvider.getDaysUntilEOM();

        if(daysUntilEOM < 5) {
            readTheDataFileAndProcessSalaries();
            return true;
        }
        else {
            return false;
        }
    }

    public void readTheDataFileAndProcessSalaries()
    {
        // This code is under construction and is not currently needed
        // to unit test the business logic in the lodgeSalaries method.
    }
}
