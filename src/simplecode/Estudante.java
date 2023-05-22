package simplecode;


class Studant{
    private int id;
    private String nome;
    public Studant(int _id, String _nome){
        this.id = _id;
        this.nome = _nome;
    }

    private int getStudantId(){
        return this.id;
    }
    private String getStudantNome(){
        return this.nome;
    }
    public void getStudant(){
        System.out.println("Id: " + this.getStudantId() + " -> Nome: " + this.getStudantNome());
    }
}




public class Estudante {
    public static void main(String[] args) {
        Studant estudante1 = new Studant(0,"Deivid K.L");
        estudante1.getStudant();
    }
}
