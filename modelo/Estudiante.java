package modelo;

public class Estudiante {
    private int codigo;
    private String nombre;
    private  String apellido;

    public  Estudiante(String nombre, String apellido, int codigo){
    }

    public boolean asignarCurso(Curso curso){

        return asignarCurso(curso);
    }
    public double calcularPromedio(){

        return calcularPromedio();
    }
    public boolean pensumIncluyeCurso(String codigoCurso){


        return false;
    }
    public boolean estudianteEstaPrubea(){


        return false;
    }
    public boolean tieneCursosCompletos(String codigoCurso){

        return false;
    }
    public Curso buscarCurso(String codigoCurso){
        Curso curso;
       // curso = new Curso(String cod, String nom, int cred);

        return curso;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public Curso getCurso1(){return Curso;}
    public Curso getCurso2(){return Curso;}
    public Curso getCurso3(){return Curso;}
    public Curso getCurso4(){return Curso;}
    public Curso getCurso5(){return Curso;}

}
