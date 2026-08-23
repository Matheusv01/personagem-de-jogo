import static java.lang.IO.*;

void main() {


    String nome = readln("qual o nome do seu personagem? : ");
    int vida = Integer.parseInt(readln("qual a vida inicial do seu personagem? 0/100 : "));
    if (vida <101 && vida > 0){
        println("energia aceita");
    }else {
        println(" a energia deve de 0/100");
        return;
    }

    int energia = Integer.parseInt(readln("qual a vida inicial do seu personagem? 0/100 : "));
    if (energia <101 && energia > 0){
        println("energia aceita");
    }else {
        println(" a energia deve de 0/100");
        return;
    }

    Kratos personagem = new Kratos(nome, vida, energia);








}


