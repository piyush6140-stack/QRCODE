import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class wr_xl {


    public static void wrxl(String name) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        Workbook wb=Workbook.getWorkbook(new File("t3.xls"));
        WritableWorkbook copy = Workbook.createWorkbook(new File("t3.xls"),wb);
        Sheet x1=wb.getSheet(0);
        WritableSheet copsheet= copy.getSheet(0);
        int nrow=x1.getRows();
        Label label=new Label(0,nrow,name);
        Label label1=new Label(1,nrow,dtf.format(now));
        //System.out.println();
        copsheet.addCell(label);
        copsheet.addCell(label1);
        copy.write();
        copy.close();

    }
    public static void main(String[] args)throws Exception
    {
        String name="Piyus";
        wrxl(name);
    }
}