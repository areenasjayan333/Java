/*Suppose your institution wishes to maintain a database of its employees. The database
is divided into a number of classes whose (Assistant Professor, Associate Professor,
Professor etc). Construct a Super Class Person to store personal information. Derive
all the above classes from the Class. Develop a Java program to specify all the classes
and define functions to create the database and retrieve individual information as and
when required. Support at least 5 employees on each category.*/

package inheritance2;

class Person{
    String Name;
    String Address;
    String email;
    String phonenumber;
            
Person(String Name,String Address,String email,String phonenumber){
   this.Name=Name;
   this.Address = Address;
   this.email=email;
   this.phonenumber = phonenumber;
}
public void createDatabase(){
    System.out.println("DataBase Created");
}
}
class Assistantprofessor extends Person{

    public Assistantprofessor(String Name,String Address,String email,String phonenumber) {
        super( Name, Address, email, phonenumber);
    }
    @Override
    public void createDatabase(){
        System.out.println("Assistant professor DataBase Created ");
    }
    
}
class Associateprofessor extends Person{

    public Associateprofessor(String Name,String Address,String email,String phonenumber) {
        super( Name, Address, email, phonenumber);
    }
    @Override
    public void createDatabase(){
        System.out.println("Associate professor DataBase Created");
    }
    
}
class Professor extends Person{
     String type;
    public Professor(String Name,String Address,String email,String phonenumber,String type) {
        super( Name, Address, email, phonenumber);
    }
    @Override
    public void createDatabase(){
        System.out.println(" Professor DataBase Created");
    }
    
}

public class Inheritance2 {

       public static void main(String[] args) {
       Person person = new  Person("Sona","Sona Villa","sona@gmail.com","9807654321");
       Person assistantprofessor1 = new Assistantprofessor("Sona","Sona Villa","sona@gmail.com","9807654321");
        Person assistantprofessor2 = new Assistantprofessor("Sonashi","SonashiVilla","sonashi@gmail.com","9836654321");
         Person assistantprofessor3 = new Assistantprofessor("Appu","Appu Villa","appu@gmail.com","9807654321");
          Person assistantprofessor4 = new Assistantprofessor("Anu","Anu Villa","anu@gmail.com","9237654321");
           Person assistantprofessor5 = new Assistantprofessor("Deepu","Deepu Villa","deepu@gmail.com","9337654321");
           
        Person associateprofessor1 = new Associateprofessor("Sona","Sona Villa","sona@gmail.com","9807654321");
         Person associateprofessor2 = new Associateprofessor("Sonashi","SonashiVilla","sonashi@gmail.com","9836654321");
         Person associateprofessor3 = new Associateprofessor("Appu","Appu Villa","appu@gmail.com","9807654321");
          Person associateprofessor4 = new Associateprofessor("Anu","Anu Villa","anu@gmail.com","9237654321");
           Person associateprofessor5 = new Associateprofessor("Deepu","Deepu Villa","deepu@gmail.com","9337654321");  
           
        Professor professor1 = new Professor("Sona","Sona Villa","sona@gmail.com","9807654321","Mechanical");
        Professor professor2 = new Professor("Sonashi","SonashiVilla","sonashi@gmail.com","9836654321","Electrical");
        Professor professor3 =new Professor("Appu","Appu Villa","appu@gmail.com","9807654321","IT");
        Professor professor4 = new Professor("Anu","Anu Villa","anu@gmail.com","9237654321","IT");
        Professor professor5= new Professor("Deepu","Deepu Villa","deepu@gmail.com","9337654321","IT");
        
        assistantprofessor1.createDatabase();
        associateprofessor1.createDatabase();
        professor1.createDatabase();
        person.createDatabase();
       }
    
}
