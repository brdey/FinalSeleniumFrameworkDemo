package tabledata;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import tablepage.TableData;
import tablepage.TablePage;

/**
 * Created by PIIT_NYA on 5/20/2017.
 */
public class ReadTableData extends CommonAPI {

    @Test
    public void headerVerification(){
        TablePage tablePage = PageFactory.initElements(driver, TablePage.class);
        tablePage.verifyHeader();
    }

    @Test
    public void readingTableCellData(){
        TableData tableData = PageFactory.initElements(driver, TableData.class);
        tableData.table();
    }
}
