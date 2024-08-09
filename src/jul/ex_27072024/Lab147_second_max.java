package jul.ex_27072024;

public class Lab147_second_max {
    public static void main(String[] args) {
        int [] salary = {3,5,7,9,21,19,17,101};
        int temp = 0;
        for (int i = 0; i < salary.length-1; i++) {
            for (int j = 0; j < salary.length-i-1; j++) {
                if(salary[j]<salary[j+1]){
                    temp = salary[j];
                    salary[j] = salary[j+1];
                    salary[j+1] = temp;
                }
            }

        }
        System.out.println("The second max of salary is: " + salary[1]);


    }
}
