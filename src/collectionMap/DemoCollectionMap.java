package collectionMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class DemoCollectionMap {
    public static void main(String args[]){
        HashMap<Employee, String> mapEmpSpec = new HashMap<>();
        for (int i = 0; i < 8; i++) {
            Employee emp = new Employee(i,"Имя" + i, "Фамилия" + i, i+10);
            mapEmpSpec.put(emp, "специализация" + i/2);
        }

        HashMap<String, ArrayList<Employee>> mapSpecEmp = reMap(mapEmpSpec);
        System.out.println("исходная коллекция: " + mapEmpSpec);
        System.out.println("измененная коллекция" + mapSpecEmp);
    }

    public static HashMap<String, ArrayList<Employee>> reMap(HashMap<Employee, String> mapEmpSpec){
        String key;
        HashMap<String, ArrayList<Employee>> mapSpecEmp = new HashMap<>();

        Set<Map.Entry<Employee, String>> set = mapEmpSpec.entrySet();
        for (Map.Entry<Employee, String> me: set){
            ArrayList<Employee> tmpCollection = new ArrayList<>();  //временная коллекция
            key = me.getValue();
            if (mapSpecEmp.containsKey(key)){
                //такая специализация уже есть в итоговои списке (ранее уже добавляли сотрудников с этой специализацией)
                tmpCollection = mapSpecEmp.get(key);    //получили коллекцию с уже добавленными работниками
            }
            tmpCollection.add(me.getKey()); //добавили в коллекцию сотрудника с новой специализацией
            mapSpecEmp.put(key, tmpCollection);
        }
        return mapSpecEmp;
    }
}
