package genericCollection.sec07;

import java.util.ArrayList;
import java.util.Iterator;


public class EmployeeMain {
    public static void main(String[] args) {
        // 사용자 정의 클래스 활용 : Employee 클래스의 인스턴스 생성
        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        Employee employee1 = new Employee(100, "문채형", 5000.0);
        Employee employee2 = new Employee(200, "김민수", 6000.0);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(new Employee(300,"이영희", 7000));

        // Employee 객체의 정보 출력
        for (int i = 0; i < employeeList.size(); i++) {
            Employee emp = employeeList.get(i); // Employee 객체를 가져옴
            System.out.println(emp);
            System.out.println("사원번호: " + emp.getEmpNo() + ", 이름: " + emp.getName() + ", 급여: " + emp.getSalary());
        }

        System.out.println();

        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        System.out.println();

        //Iterator를 사용한 Employee 객체의 정보 출력
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next(); // 다음 Employee 객체를 가져옴
            System.out.println(emp);
            System.out.println("사원번호: " + emp.getEmpNo() + ", 이름: " + emp.getName() + ", 급여: " + emp.getSalary());
        }
    }
}
