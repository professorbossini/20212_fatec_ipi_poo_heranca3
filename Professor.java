public class Professor extends Pessoa{
    private int matricula;
    public void lecionar (){
        System.out.printf ("%s esta lecionando..", getNome());
    }

    public int getMatricula(){
        return this.matricula;
    }
}