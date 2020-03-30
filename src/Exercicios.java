public class Exercicios {

    public void exercicioPrimeiraLinha() {
        boolean p = false;
        boolean q = false;
        boolean r = false;

        System.out.println("Reposta do primeiro exercicio, coluna um: " + ((p && q)  || !r));
        System.out.println("Resposta do primeiro exercicio, coluna dois: " + !(p && (q || !r)) + "\n");
    }

    public void exercicioSegundaLinha() {
        boolean p = false;
        boolean q = false;
        boolean r = true;

        System.out.println("Reposta do segundo exercicio, coluna um: " + ((p && q)  || !r));
        System.out.println("Resposta do segundo exercicio, coluna dois: " + !(p && (q || !r)) + "\n");
    }

    public void exercicioTerceiraLinha() {
        boolean p = false;
        boolean q = true;
        boolean r = false;

        System.out.println("Reposta do terceiro exercicio, coluna um: " + ((p && q)  || !r));
        System.out.println("Resposta do terceiro exercicio, coluna dois: " + !(p && (q || !r)) + "\n");
    }





}
