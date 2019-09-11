import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
// Link DWHTesting with this Main Class;
        String enterReportPath = "C:\\Users\\mk28393\\Desktop\\Working\\New folder\\La Red_HEDIS_May 2019_remove LTSS_V2_DOB.xlsx";
        int enterIndexOfSheet = 6;
        int enterColumnIndexOfSheet = 0;
//=================================No Change Required Below this Point==================================================
        DWHTesting dwht = new DWHTesting();
        System.out.println("Execution has STARTED.....");
        dwht.connectDB("jdbc:oracle.driver.OracleDriver",
                "jdbc:oracle:thin:@edwhtst.kmhp.com:1521:podwh1ts",
                "mk28393[GLOBL]",
                "Mdajim2026");
        dwht.createTableInDB("C:\\Users\\mk28393\\Desktop\\Working\\Reporting\\SQLQuery.xlsx",
                1, 0);
//        dwht.inserDataFromExcel("C:\\Users\\mk28393\\Desktop\\Working\\New folder\\La Red_HEDIS_May 2019_remove LTSS_V2_DOB.xlsx",
//                6,0);//insert data from first excel column;
        dwht.inserDataFromExcel(enterReportPath, enterIndexOfSheet, enterColumnIndexOfSheet);
        dwht.displayReturnResult(1,
                "select * from GLOBL.RED_SAS_MEMBER MINUS select * from GLOBL.RED_MEM_2",
                "C:\\Users\\mk28393\\Desktop\\Working\\MedEconReportTestingResults\\");
        dwht.dropDBTable("C:\\Users\\mk28393\\Desktop\\Working\\Reporting\\SQLQuery.xlsx",
                2, 1);
        dwht.closeDBConnection();
    }
}

//DB Column Index Start from 1;
// Sheet and Column Index Start from 0
