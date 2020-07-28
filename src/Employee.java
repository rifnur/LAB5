public class Employee {
    private String FIO;
    private String function;
    private String mail;
    private String phone;
    private double salary;
    private int age;

    public  Employee  (String FIO,String function,String mail,String phone,double salary,int age){
        this.FIO=FIO;
        this.function=function;
        this.mail=mail;
        this.phone=phone;
        this.salary=salary;
        this.age=age;
    }
    public void info () {
        System.out.println("Сотрудник: "+FIO+" Должность: "+function+" email: "+mail+" Тел.: "
                +phone+" Зарплата: "+salary+" Возраст: "+age);
    }
    public int getAge (){
        return age;
    }
    /*ublic void ageOld (int ){
        for (int i=0;i<5;i++){
            perArray[i].info();
        }
    }*/
}
