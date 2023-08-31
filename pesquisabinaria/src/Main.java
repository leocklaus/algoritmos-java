public class Main {
    public static void main(String[] args) {

        Integer[] numbers = {1,2,5,7,9,12,23,35,67,89,100,112};
        encontraNumero(numbers, 67);

        var p1 = new Pessoa("Alberto", 25);
        var p2 = new Pessoa("Carlos", 30);
        var p3 = new Pessoa("Marcio", 32);
        var p4 = new Pessoa("Pedro", 27);

        Pessoa[] pessoas = {p1,p2,p3,p4};

        econtraPessoaComALetra('M', pessoas);

    }
    private static void encontraNumero(Integer[] arr, Integer numeroEscolhido){

        int indexMenor = 0;
        int indexMaior = arr.length -1;

        while(indexMenor <= indexMaior){


            int indexPivo = Math.round((indexMaior + indexMenor) / 2);
            int pivo = arr[indexPivo];

            if(numeroEscolhido == pivo){
                System.out.println("Encontrei o número " + numeroEscolhido);
                break;
            }

            if(numeroEscolhido > pivo){
                indexMenor = indexPivo + 1;
            }

            if(numeroEscolhido < pivo){
                indexMaior = indexPivo - 1;
            }

            if(indexMenor > indexMaior){
                System.out.println("Não encontrei");
            }

        }
    }

    private static void econtraPessoaComALetra(char letraInicial, Pessoa[] pessoas){
        int indexMenor = 0;
        int indexMaior = pessoas.length - 1;

        while (indexMenor <= indexMaior){

            int indexPivo = Math.round((indexMaior + indexMenor) / 2);
            Pessoa pessoaPivo = pessoas[indexPivo];

            if(pessoaPivo.getName().charAt(0) == letraInicial){
                System.out.println(pessoaPivo.getName());
                break;
            }

            if(pessoaPivo.getName().charAt(0) < letraInicial){
                indexMenor = indexPivo + 1;
            }

            if(pessoaPivo.getName().charAt(0) > letraInicial){
                indexMaior = indexPivo - 1;
            }

            if(indexMenor > indexMaior){
                System.out.println("Não encotrei");
            }

        }

    }

    public static class Pessoa{
        private String name;
        private Integer idade;

        public Pessoa(String name, Integer idade){
            this.name = name;
            this.idade = idade;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getIdade() {
            return idade;
        }

        public void setIdade(Integer idade) {
            this.idade = idade;
        }
    }
}