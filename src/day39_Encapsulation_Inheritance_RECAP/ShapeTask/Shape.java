package day39_Encapsulation_Inheritance_RECAP.ShapeTask;

public class Shape {
    private String name;// none of the Classes will have any access to this instance variable.
                   // Developers can add additional requirements/conditions to getter and setter when the instance variable is private

    public String getName() { // created getter and setter automatically
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape(String name) {  // I need a constructor, so as soon as the Object is created we can set the name
      if (name == null){
          System.err.println("Name can not be null");
          System.exit(1);// status 1 --> something went wrong
      }

      if (name.isBlank()|| name.isBlank()){
          System.err.println("Invalid name");
          System.exit(1);
      }

        this.name = name;
    }

    public double area(){
        return 0;
    }

    public double parameter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                ", name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", parameter='" + parameter() + '\'' +
                '}';
    }
}

/*
	Shape:
	variables:
			name
	Encapsulate the field
	Add a constructor to set the filed
	Methods:
		area(){}
		perimeter(){}
 */