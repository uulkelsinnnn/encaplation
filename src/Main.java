public class Main {
    public static void main(String[] args) {
        Person person2 = new Person();
        Person person1 = new Person();
        person2.setName("Uulkelsin");
        person2.setSurName("Nurdinova");
        person2.setAge(22);

        person1.setName("Diana");
        person1.setSurName("Mamutova");
        person1.setAge(21);
        Person  [] persons = {person2,person1};
        for (Person person : persons) {
            System.out.println("_________________________________");
            System.out.println("Имя: " +person.getName());
            System.out.println("Фамилия: "+person.getSurName());
            System.out.println("Возраст: " +person.getAge());
        }

        University university1 = new University();
        university1.setFaculty("Национальный Университет");
        university1.setContract(15000);

        University university2 = new University();
        university2.setFaculty("Технический Университет");
        university2.setContract(12000);

        University university3 = new University();
        university3.setFaculty("Медицинский Университет");
        university3.setContract(8000);
        University [] universities = {university1,university2,university3};


        for (University university : universities){
            System.out.println("_________________________________");
            System.out.println("Faculty: "+university.getFaculty());
            System.out.println("Contract  price: "+university.getContract());
        }


        School school1 = new School();
        school1.setLessons("English");
        school1.setCourses("Mathematics");

        School school2 = new School();
        school2.setLessons("Biology");
        school2.setCourses("Dance");
        School [] schools = {school1,school2};

        for (School school : schools ){
            System.out.println("_________________________________");
            System.out.println("Lessons: "+school.getLessons());
            System.out.println("Courses: "+school.getCourses());
        }



        Car car1 = new Car();
        car1.setStamp("Camry");
        car1.setColour("Black");
        car1.setPrice(30000);

        Car  car2 = new Car();
        car2.setStamp("Porsche");
        car2.setColour("Red");
        car2.setPrice(40000);
        Car [] cars ={car1,car2};
        for (Car car : cars){
            System.out.println("_________________________________");
            System.out.println("Stamp: "+car.getStamp());
            System.out.println("Colour: "+car.getColour());
            System.out.println("Price: "+car.getPrice());
        }

    }
}