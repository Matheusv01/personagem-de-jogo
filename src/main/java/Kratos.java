import static java.lang.IO.*;

public class Kratos {

    private String nome;
    private int vida;
    private int energia;
    private int nivel;

      public Kratos (String nome, int vida, int energia){
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
    }

    public String getNome(){
        return nome;
    }

    public int getVida(){
        return vida;
    }

    public int getEnergia(){
        return energia;
    }
    public int getNivel(){
        return nivel;
    }

    public String getStatus(){
        if (this.vida <= 0){
            return "morto";
        }else {
            return "vivo";
        }
    }


    public void receberDano(int dano){
        this.vida = this.vida - dano;

        if (this.vida < 0)
            this.vida = 0;
    }

    public void desncansar (){
        this.energia = 100;
        this.vida = 100;
    }

    public void atacar (){
        if (this.energia >= 20 ) {
            this.energia -= 20;
        } else {
            println(" não tem energia suficiente para atacar!");
        }
    }

    public String bater(){
        return "pá";
    }
    public String assoprar() {
        return "fuuuuu";
    }
}




