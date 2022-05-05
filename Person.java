class Person {
    
    private int age;
    private String name;
    private long phone;
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;

    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public long getPhone() {
        return this.phone;
    }
    
    public void setPhone(long phone) {
        this.phone = phone;
    }
    
    public static void main(String[] args) {
        Person myPerson = new Person();
        myPerson.setAge(15);
        int age = myPerson.getAge();
        
        myPerson.setName("Jhon");
        String name = myPerson.getName();
        
        myPerson.setPhone(22234322);
        long phone = myPerson.getPhone();
        
        
        System.out.println("Age: " + age);        
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);

    }
}