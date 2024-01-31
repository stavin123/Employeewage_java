import java.util.Scanner;

public class EmployeeWage {

    public void calculateEmployeeWage(int wkhr, int hrlyWage,int monthlyhrs,int totalnoofdays,String Company){
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
        System.out.println(" ");
        System.out.println("Name of the Company="+Company);
        System.out.println("Total Employee wage="+totalwage);

    }





    public static void main(String[] args) {
        int FULL_TIME = 2;
        int Part_TIME = 1;
        int emphr=0,empwage=0;
        int wageperhr=20;
        int monthlywage=0;
        int hrsinmonth=100;
        int noofday=20;
        String company;


        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the name of the Company");
        company=sc.next();
        System.out.println("Enter Employee wage per hour for the company");
        wageperhr= sc.nextInt();
        System.out.println("Enter the no. of working days ");
        noofday=sc.nextInt();
        System.out.println("Enter the no. of working hours in a month");
        hrsinmonth=sc.nextInt();


        EmployeeWage obj= new EmployeeWage();
        obj.calculateEmployeeWage(emphr, wageperhr,hrsinmonth,noofday,company);


    }
}
