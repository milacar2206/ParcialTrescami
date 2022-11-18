//clase empleado

public class Empleado1 {
private final static double Salario_Minimo=980000;
private final static double Descuento_EPS=4;
private String Nombre;
private String Apellido;
private String Direccion;
private int DNI;
private double Salario;
private char Sexo;

// construtor sobrecargado 
public Empleado1(String Nombre) {
 this.Nombre = Nombre;
 System.out.println("this.Nombre" + Nombre);
}

 public void Empleado(String Apellido) {
	 this.Apellido = Apellido;
	 System.out.println("this.Apellido" + Apellido);
}
public void Empleado(int DNI) {
}{
this.DNI = DNI;
System.out.println("this.DNI" + DNI);
	}
	public void Empleado(double Salario) {
	}{
		this.Salario = Salario;
		System.out.println("This.Salario" + Salario);
		
	}
	public void Empleado(char Sexo) {
		this.Sexo = Sexo;
		System.out.println("this.Sexo" + Sexo);
	}
	public void Empleado(String Nombre,String Apellido,String Direccion, int DNI, double Salario) {
		
}
public void Empleado(String Dirrecion, int DNI, char Sexo) {
	
}
public void Empleado(String Direccion, int DNI, double Salario) {
}
public void Empleado(String Nombre, String Apellido, int DNI, double Salario, char Sexo) {
}

//Constructor por defecto
public Empleado1() {
}
//Metodos getter/setter
public String getNombre() {
	return Nombre;
}
public void setNombre(String Nombre) {
	this.Nombre = Nombre;
}

public String getApellido() {
	return Apellido;
}
public void setApellido(String Apellido) {
	this.Apellido = Apellido;
}
public String getDireccion() {
	return Direccion;
}
public void setDireccion(String Direccion) {
	this.Direccion = Direccion;
}
public int getDNI() {
	return DNI;
}
public void setDNI(int DNI) {
	this.DNI = DNI;
}
public double getSalario() {
	return Salario;
}
public void setSalario(double Salario) {
	this.Salario = Salario;
	
}
public char getSexo() {
	return Sexo;
	
}
public void setSalario(char Sexo) {
	this.Sexo = Sexo;
}
}
