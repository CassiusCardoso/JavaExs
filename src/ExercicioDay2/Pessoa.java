package ExercicioDay2;

public class Pessoa {

    // Atributos que a pessoa tem
    private String nome;
    private String Sobrenome;
    private int idade;
    private char sexo;

    // Construtor -> cria o objeto com valores iniciais
    public Pessoa(String nome, String Sobrenome, int idade, char sexo) {
        this.nome = nome;
        this.Sobrenome = Sobrenome;
        this.idade = idade;
        this.sexo = sexo;

    }

    // Getters -> acessa as variáveis
    public String getNome(){
        return nome;
    }

    public String getSobrenome(){
        return Sobrenome;
    }

    public int getIdade(){
        return idade;
    }

    public char getSexo(){
        return sexo;
    }

    // Setters -> adiciona os valores às variáveis

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public void apresentar(){
       System.out.println("Nome: " + nome + "\n" + "Sobrenome: "  + Sobrenome + "\n" + "Idade: " + idade  +"\n"+ "Sexo: " + sexo);
    }
}
