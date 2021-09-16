public class TesteLecionar{
    public static void main(String[] args) {
        ProfessorHorista horista = new ProfessorHorista();
        horista.setNome("Jose");
        ProfessorPesquisador pesquisador = new ProfessorPesquisador();
        pesquisador.setNome("Ana");
        horista.lecionar();
        pesquisador.lecionar();
    }
}