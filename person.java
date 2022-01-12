class Person
{
    String behaviour="attitude";
    int age;

    void B()
    {
        System.out.println("Enter Behaviour: " + behaviour);
    }
}

class outt
{
    public static void main(String[] args) {
        Person p1= new Person();
        p1.B();
    }
}