

public class EmployeeWage {
    int FULL_TIME = 2;
    int Part_TIME = 1;
    int emphr=0,empwage=0;
    int wageperhr=20;
    int monthlywage=0;

    public void calculateEmployeeWage(){
        int totalEmpHrs = 0;
        int hrsinmonth=10;
        int noofday=20, totalWorkingDays = 0;
        while (totalEmpHrs <= hrsinmonth && totalWorkingDays < noofday){ ;

            totalWorkingDays++;
            int empCheck =(int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case 1:
                    emphr = 4;
                    break;
                case 2:
                    emphr = 8;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    emphr = 0;
            }
            totalEmpHrs=totalWorkingDays+emphr;

        }
        int totalwage=totalEmpHrs*wageperhr;
        //monthlywage=monthlywage+empwage;
        /*if (empCheck == FULL_TIME)
            System.out.println("Employee is Present");
        else if (empCheck == Part_TIME)
         else
                */


        System.out.println("Emplyee wage="+totalwage);

    }





    public static void main(String[] args) {
        EmployeeWage obj= new EmployeeWage();
        obj.calculateEmployeeWage();


    }
}