

public class EmployeeWage {

    public void calculateEmployeeWage(int wkhr, int hrlyWage,int monthlyhrs,int totalnoofdays){
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs <= monthlyhrs && totalWorkingDays < totalnoofdays){ ;

            totalWorkingDays++;
            int empCheck =(int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case 1:
                    wkhr = 4;
                    break;
                case 2:
                    wkhr = 8;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    wkhr = 0;
            }
            totalEmpHrs=totalWorkingDays+wkhr;

        }
        int totalwage=totalEmpHrs*hrlyWage;
        //monthlywage=monthlywage+empwage;
        /*if (empCheck == FULL_TIME)
            System.out.println("Employee is Present");
        else if (empCheck == Part_TIME)
         else
                */


        System.out.println("Emplyee wage="+totalwage);

    }





    public static void main(String[] args) {
        int FULL_TIME = 2;
        int Part_TIME = 1;
        int emphr=0,empwage=0;
        final int wageperhr=20;
        int monthlywage=0;
        int hrsinmonth=100;
        int noofday=20;
        EmployeeWage obj= new EmployeeWage();
        obj.calculateEmployeeWage(emphr, wageperhr,hrsinmonth,noofday);


    }
}
