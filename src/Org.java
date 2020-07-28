public class Org {
    public static void main(String[] args) {
    Employee[] perArray=new Employee[5];
    perArray[0]  = new Employee("Иванов И.И.","Директор","ivanov@mail.ru","89047999999",5999.90,42);
    perArray[1]  = new Employee("Петров М.И.","Курьер","petr@mail.ru","89005555999",10000,18);
    perArray[2]  = new Employee("Сидров А.У.","Менеджер","sidr@mail.ru","89047944499",20000,20);
    perArray[3]  = new Employee("Галустян К.К.","Комик","gal@mail.ru","89047994127",100000,25);
    perArray[4]  = new Employee("Горбачёв В.В.","Сантехник","gorb@mail.ru","89047942569",45000,54);
/*Выведим всех сотрудников*/
        System.out.println("Все сотрудники организации Рога и Копыта");
        for (int i=0;i<perArray.length;i++){
            perArray[i].info();
            };
        System.out.println("");
 /*Выведим только старше 40 лет*/
        System.out.println("Сотрудники организации Рога и Копыта старше 40 лет");
        for (int i=0;i<5;i++){
            if (perArray[i].getAge()>40){
             perArray[i].info();
            };
        }
    }




}
