package test.data;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import com.github.javafaker.Faker;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class FakerTestDataGenerator {

	public void generateData() {
		
		Faker f = new Faker();

		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("sheet1");

		for (int createRow = 0; createRow < 30; createRow++) {
			Row row = sheet.createRow(createRow);
			Cell cell = row.createCell(0);
			String firstName = f.name().firstName();
			cell.setCellValue(firstName);

			cell = row.createCell(1);
			String lastName = f.name().lastName();
			cell.setCellValue(lastName);

			cell = row.createCell(2);
			String email = f.internet().emailAddress();
			cell.setCellValue(email);

			cell = row.createCell(3);
			String password = f.internet().password();
			cell.setCellValue(password);

			String adressFirstName = firstName;
			cell = row.createCell(4);
			cell.setCellValue(adressFirstName);

			String adressLastName = lastName;
			cell = row.createCell(5);
			cell.setCellValue(adressLastName);

			String address = f.address().streetName();
			cell = row.createCell(6);
			cell.setCellValue(address);

			String city = f.address().cityName();
			cell = row.createCell(7);
			cell.setCellValue(city);

			String zipCode = f.address().zipCode().replace("-", "0").substring(0, 5);
			cell = row.createCell(8);
			cell.setCellValue(zipCode);

			String mobilePhone = f.phoneNumber().cellPhone();
			cell = row.createCell(9);
			cell.setCellValue(mobilePhone);

			String assignAlias = f.address().secondaryAddress();
			cell = row.createCell(10);
			cell.setCellValue(assignAlias);

			sheet.autoSizeColumn(createRow);

		}

		try {
			FileOutputStream os = new FileOutputStream("testData.xls");
			wb.write(os);

			wb.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
