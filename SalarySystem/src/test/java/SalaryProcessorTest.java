import org.example.SalaryProcessor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalaryProcessorTest
{
    @Test
    public void TestSalaryProcessor_ValidDaysUntilEOM_ReturnsTrue()
    {
        System.out.println("TestSalaryProcessor_ValidDaysUntilEOM_ReturnsTrue");

        // Arrange
        StubCalendarProvider stubCalendarProvider = new StubCalendarProvider();
        stubCalendarProvider.setDaysUntilEOM(3);

        SalaryProcessor salaryProcessor = new SalaryProcessor(stubCalendarProvider);

        // Act
        Boolean result = salaryProcessor.lodgeSalaries("salaries.data");

        // Assert
        assertEquals(true, result);
    }

    @Test
    public void TestSalaryProcessor_InvalidDaysUntilEOM_ReturnsFalse()
    {
        System.out.println("TestSalaryProcessor_InvalidDaysUntilEOM_ReturnsFalse");

        // Arrange
        StubCalendarProvider stubCalendarProvider = new StubCalendarProvider();
        stubCalendarProvider.setDaysUntilEOM(10);

        SalaryProcessor salaryProcessor = new SalaryProcessor(stubCalendarProvider);

        // Act
        Boolean result = salaryProcessor.lodgeSalaries("salaries.data");

        // Assert
        assertEquals(false, result);
    }

    @Test
    public void TestSalaryProcessor_InvalidFileExtension_ReturnsFalse()
    {
        System.out.println("TestSalaryProcessor_InvalidFileExtension_ReturnsFalse");

        // Arrange
        StubCalendarProvider stubCalendarProvider = new StubCalendarProvider();
        stubCalendarProvider.setDaysUntilEOM(3);

        SalaryProcessor salaryProcessor = new SalaryProcessor(stubCalendarProvider);

        // Act
        Boolean result = salaryProcessor.lodgeSalaries("salaries.txt");

        // Assert
        assertEquals(false, result);
    }

    @Test
    public void TestSalaryProcessor_ValidFileExtension_ReturnsTrue()
    {
        System.out.println("TestSalaryProcessor_ValidFileExtension_ReturnsTrue");

        // Arrange
        StubCalendarProvider stubCalendarProvider = new StubCalendarProvider();
        stubCalendarProvider.setDaysUntilEOM(3);

        SalaryProcessor salaryProcessor = new SalaryProcessor(stubCalendarProvider);

        // Act
        Boolean result = salaryProcessor.lodgeSalaries("salaries.data");

        // Assert
        assertEquals(true, result);
    }
}
