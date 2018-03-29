public class calebpoly extends polyrubyy {
    public calebpoly(String name, String address, int number){
        super(name, address, number);
setSalary(salary);
    }
    public void mailCheck(){
        System.out.println("Within mailCheck of salary");
        System.out.println("MAiling check to" + getName() + "with salary" + salary);
        
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double newSalary){
        if (newSalary >= 0.0){
            salary=newSalary;
        }
    }
    public double computePay(){
        System.out.println("Computing salary pay for" + getName());
        return salary/52;
    }
}
