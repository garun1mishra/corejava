package newupdate.garun;

public class Employee {
     public static int id;
     public static String name;

    public Employee() {
    }

    public Employee( int id, String name) {
        this.id = id;
        this.name=name;
    }

    
    
    public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Employee.id = id;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Employee.name = name;
	}

	@Override
    public int hashCode() {
        return super.hashCode();
    }

//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
//
//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
