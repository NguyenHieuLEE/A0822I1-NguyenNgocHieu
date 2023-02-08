package case_study.read_and_write;
import case_study.models.human.Employee;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
public class ReadAndWrite<Employee> {
    public void writeToFile(String path, List<Employee> list, boolean isAppend) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path, isAppend))) {
            for(Employee e : list){
                writer.write(e.toString());
                writer.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}