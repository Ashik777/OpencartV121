package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Dataproviders {
	@DataProvider(name="LoginData")
		public String[][] getDatat() throws IOException{
		String path =".//testdata//testdata.xlsx";
		ExcelUtility xlsutil= new ExcelUtility(path);
		int rowcount=xlsutil.getRowCount("Sheet1");
		int colcount=xlsutil.getCellCount("Sheet1", 1);
		String logindata[][]=new String[rowcount][colcount];
		for(int i=1;i<=rowcount;i++) {
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=xlsutil.getCellData("Sheet1", i, j);
			}
		}
		return logindata;
			
		}
	}


