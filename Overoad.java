class P {
    private String name;
    private int age;
 
    // Getter
    public String getName() {
      return name;
    }
    public int getAge(){
        return age;
    }
 
    // Setter
    public void setName(String newName) {
      this.name = newName;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
 }
class Overload {
    public static void main(String[] args) {
        P myObj = new P();
        myObj.setName("John "); // Set the value of the name variable to "John"
        myObj.setAge(14);
        System.out.println(myObj.getName()+myObj.getAge());
    
    }
  }