
public class DesarrolladorFrontend {
private final static double Aumento_Variable=5;
private int aniosExperienciaBootstrap;
private boolean experienciaCloud;

//metodos get/set
public int getaniosExperienciaBootstrap() {
	return aniosExperienciaBootstrap;

}
public void setaniosExperienciaBootstrap(int aniosExperienciaBootstrap) {
	this.aniosExperienciaBootstrap = aniosExperienciaBootstrap;

}
public boolean getexperienciaCloud() {
	return experienciaCloud;

}
public void setexperienciaCloud(boolean experienciaCloud) {
	this.experienciaCloud = experienciaCloud;
	
}
// construtor por defecto
public DesarrolladorFrontend() {
	
}
//construtor  2 atributos
public DesarrolladorFrontend(int aniosExperienciaBootstrap ) {
	this.aniosExperienciaBootstrap = aniosExperienciaBootstrap;
}
public DesarrolladorFrontend(boolean experienciaCloud) {
	this.experienciaCloud = experienciaCloud;
}
}
