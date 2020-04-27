import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 10);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void canPrint(){
        printer.print(2, 5);
        assertEquals(90, printer.getPaper());
    }

    @Test
    public void usesToner(){
        printer.print(2, 3);
        assertEquals(4, printer.getToner());
    }

    @Test
    public void notEnoughPaper(){
        printer.print(100, 10);
        assertEquals(100, printer.getPaper());
    }
}
