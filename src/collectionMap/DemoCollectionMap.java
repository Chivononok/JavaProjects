package collectionMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class DemoCollectionMap {
    public static void main(String args[]){
        HashMap<Employee, String> mapEmpSpec = new HashMap<>();
        for (int i = 0; i < 8; i++) {
            Employee emp = new Employee(i,"Имя" + i, "Фамилия" + i, i+10);
            mapEmpSpec.put(emp, "специализация" + i);
        }

        HashMap<String, Employee> mapSpecEmp = reMap(mapEmpSpec);
        System.out.println(mapEmpSpec);
        System.out.println(mapSpecEmp);
    }

    public static HashMap<String, Employee>  reMap(HashMap<Employee, String> mapEmpSpec){
        HashMap<String, Employee> mapSpecEmp = new HashMap<>();
        Set<Map.Entry<Employee, String>> set = mapEmpSpec.entrySet();
        for (Map.Entry<Employee, String> me: set){
            mapSpecEmp.put(me.getValue(), me.getKey());
        }
        return mapSpecEmp;
    }
}
