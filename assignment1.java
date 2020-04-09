public class assignment1{
    public static void main(String args[]){
        String designation = "NOA";
        String designation_code = "NOA" ;
        String name = "NOA";
        String department = "NOA";
        int salary = 0;
        int basic = 0;
        int it = 0;
        int hra = 0;
        int da = 0;
        
        String emp_id = args[0];
        Object[][] emp_details = {
                       {"1001", "Ashish", "01/04/2009", "e", "R&D", 20000, 8000, 3000},
                       {"1002", "Sushma", "23/08/2012", "c", "PM", 30000, 12000, 9000},
                       {"1003", "Rahul", "12/08/2012", "k", "Acct", 10000, 8000, 1000},
                       {"1004", "Chachat", "29/01/2013", "r", "Front Desk", 120000, 6000, 2000},
                       {"1005", "Ranjan", "16/07/2005", "m", "Engg", 50000, 20000, 20000},
                       {"1006", "Suman", "01/01/2000", "e", "Manufacturing", 230000, 9000, 4400},
                       {"1007", "Tanmay", "12/06/2000", "c", "PM", 290000, 12000, 10000}
                    };

        for(int x=0; x<emp_details.length; x++){
            if(emp_details[x][0].equals(emp_id)){
                name = (String) emp_details[x][1];
                department = (String) emp_details[x][4];
                basic = (int) emp_details[x][5];
                hra = (int )emp_details[x][6];
                it = (int) emp_details[x][7];
                designation_code = (String) emp_details[x][3];
                break;
            }
            if(x == emp_details.length-1){
                System.out.println("There is no employee with empid : "+emp_id);
                System.exit(0);
            }
        }

        switch(designation_code){
                    case "e" : designation = "Engineer";
                               da = 20000;
                               break;

                    case "c" : designation = "Consultant";
                               da = 32000;
                               break;
                    
                    case "k" : designation = "Clerk";
                               da = 12000;
                               break;

                    case "r" : designation = "Receptionist";
                               da = 15000;
                               break;

                    case "m" : designation = "Manager";
                               da = 40000;
                               break;
                               
        }
        salary = basic+hra+da-it;
        System.out.println("Emp NO.\tEmp Name\tDepartment\tDesignation\tSalary");
        System.out.println(emp_id+"\t"+name+"\t"+department+"\t"+designation+"\t"+salary);
    }
}