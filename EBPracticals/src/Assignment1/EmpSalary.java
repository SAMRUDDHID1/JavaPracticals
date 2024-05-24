package Assignment1;

public class EmpSalary {

	public static void main(String[] args) {
            double HRA,DA,total_salary,basic_salary;
            HRA=0;
            DA=0;
            basic_salary=10000;
            if (basic_salary<=10000)
            {
            	HRA = basic_salary * 0.2;
            	DA = basic_salary * 0.8;
            }
            if (basic_salary<=20000)
            {
            	HRA = basic_salary * 0.25;
            	DA = basic_salary * 0.9;
            }
            if (basic_salary>20000)
            {
            	HRA = basic_salary * 0.3;
            	DA = basic_salary * 0.95;
            }
            
            total_salary = basic_salary + HRA + DA ;
            
            System.out.println("Total salay is :" +total_salary);
            
                
            
            	
            
            
	}

}
