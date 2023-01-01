package ss09_mvc.util;

import ss09_mvc.model.Customer;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class ReadAndWrite {
    public static void writeCustomerListToCSV(String pathFile, List<Customer> customerList, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer s : customerList) {
                bufferedWriter.write(s.getInfoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Customer> readCustomerFromCSV(String pathFile) {
        List<Customer> studentList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                Customer customer = new Customer(Integer.parseInt(array[0]), array[1], array[2]);
                studentList.add(customer);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
