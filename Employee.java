package new2;

public class Employee {
	    String name , address;   
	    float salary; 
	    int yoj;

	    public void getInfo(String name, String address, float salary,int yoj) {

	        this.name = name;
	        this.address = address;
	        this.salary = salary;
	        this.yoj = yoj;          

	    }
	    public void printInfo(String name, String address, double salary, int yoj) {

	        System.out.println(name  + "\t\t" + address + "\t\t" + salary + "\t\t" +yoj );  

	    }
	    public static void main(String[] args){

	        String [] name = new String[3];
	        int [] yoj = new int[3];
	        float [] salary = new float [3];
	        String [] address = new String[3];
	        
	        Employee em1 = new Employee(); 
	        em1.getInfo(name[0],address[0],salary[0], yoj[0]);

	        Employee em2 = new Employee();
	        em2.getInfo(name[1],address[1],salary[1], yoj[1]);
	        
	        Employee em3 = new Employee(); 
	        em3.getInfo(name[2],address[2],salary[2], yoj[2]);

	        System.out.println("NAME \t\tADDRESS \t\tSALARY   \tYEAR OF JOINING\t");
	        em1.printInfo("Robert" , "64C-Wallstreet" , 70000.0 , 1994);
	        em2.printInfo("Sam" , "68D-WallStreet" , 80000.0 , 2000);
	        em3.printInfo("John" , "26B-WallStreet" , 90000.0 , 1999);

	}
	}

