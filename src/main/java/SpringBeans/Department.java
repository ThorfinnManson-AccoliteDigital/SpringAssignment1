package SpringBeans;

import java.sql.Struct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Department {
    String name;
    Map<Teacher, List<Student>> deptList;

    public Department(String name, Map<Teacher, List<Student>> deptList) {
        this.name = name;
        this.deptList = deptList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", deptList=" + deptList +
                '}';
    }

    public void initDepartment(){

    }
    public void destDepartment(){

    }
}
