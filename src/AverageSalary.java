public class AverageSalary {
    public static void main(String[] args){
        AverageSalary obj = new AverageSalary();
        int salary[] = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        obj.average(salary);

    }

    public double average(int[] salary) {
        double averageSalary = 0;
        double sum = 0;
        int count = 0;
        double high = salary[0];
        double low = salary[0];
        for(int i=0; i<salary.length ;i++){
            if(salary[i] > high){
                high = salary[i];
            }
            if(salary[i] < low){
                low = salary[i];
            }
            sum = sum + salary[i];
            count++;
        }

        averageSalary =  (sum - (high+low) ) / (count-2);
        System.out.println("average = " + averageSalary);
        System.out.println("max salary = " + high);
        System.out.println("min salary = " + low);

        return averageSalary;
    }
}



