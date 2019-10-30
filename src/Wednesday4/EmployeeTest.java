package Wednesday4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeTest
{
	public static void main(String[] args)
	{
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

	
	Map<String,Long> noOfMaleAndFmale =employeeList
			                         .stream()
	                                 .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
	System.out.println(noOfMaleAndFmale);
	
	System.out.println("-----------------------");
	
	employeeList.stream()
	              .map(Employee::getDept)
	              .distinct()
	              .forEach(System.out::println);
	
	System.out.println("------------------------------");
	Map<String,Double> avgAgeMaleFemale = employeeList
			         .stream()
			          .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
	
	System.out.println(avgAgeMaleFemale);
	
	System.out.println("--------------------------------------------");
	
	Optional<Employee> highestPaidEmployee = 
			 employeeList.stream()
			      .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
	
	Employee highestpaid = highestPaidEmployee.get();
	System.out.println("dteails--employee");
	System.out.println("naam---"+highestpaid.name);
	System.out.println("salary--"+highestpaid.salary);
	
	System.out.println("---------------------------------");
	employeeList.stream()
	       .filter(e -> e.getYearOfJoin() > 2015)
	       .map(Employee::getName)
	       .forEach(System.out::println);
	
	System.out.println("------------------------------------");
	Map<String,Long> empCountByDept = 
			employeeList.stream()
			 .collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
	
	Set<Entry<String,Long>> entrySet = empCountByDept.entrySet();
	for(Entry<String,Long> entry:entrySet)
	{
		System.out.println(entry.getKey()+" : "+entry.getValue());
	}
	
	System.out.println("--------------------------------------------");
	
	Map<String,Double> avgSalaryOfDept = 
			 employeeList.stream()
			   .collect(Collectors.groupingBy(Employee::getDept,
					        Collectors.averagingDouble(Employee::getSalary)));
	
	Set<Entry<String,Double>> entrySet1 = avgSalaryOfDept.entrySet();
	for(Entry<String,Double> entry:entrySet1)
	{
		System.out.println(entry.getKey()+" : "+entry.getValue());
	}
	
	System.out.println("-------------------------------------------");
	//Optional<Employee> youngEmpProductiveDept =
		//	employeeList.stream();
		//	 .filter(e -> e.getGender()=="Male"&amp;&amp; e.getDept() == "Productive Department")
	      //   .min(Comparator.comparingInt(Employee::getAge));
	
	
	}

}
