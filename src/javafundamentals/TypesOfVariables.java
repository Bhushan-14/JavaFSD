package javafundamentals;

class TypesOfVariables{
    /* There are basically three types of variables:
        1. Local Variables : variables declared inside a method are called local variables.
        2. Instance Variables : Instance variables are declared inside a class but outside any method.
                               They are not static.
        3. Static Variables : Static variables are declared inside a class but outside any method, 
                              and they are prefixed with the keyword 'static'.
    */
    
    int instance_var = 10;  
    static int static_var = 50;  

    public static void main(String[] args){
        TypesOfVariables obj = new TypesOfVariables(); 

        obj.local();
        System.out.println("Instance Variable is: " + obj.instance_var);
        System.out.println("Static Variable is: " + TypesOfVariables.static_var);
    }
    void local(){
        int a = 10;
        int b = 20; 
		 System.out.println("Local Variable is:"+a+""+b);
	}
}
