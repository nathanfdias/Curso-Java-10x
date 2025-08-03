public class App {
    public static void main(String[] args) throws Exception {

        // Obj 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 18;
        Naruto.aldeia = "Aldeia Folha";

        // Obj 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 17;
        Sasuke.aldeia = "Aldeia Folha";

        // Obj 3
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata";
        Hinata.idade = 18;
        Hinata.aldeia = "Aldeia Folha";

        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura";
        Sakura.idade = 17;
        Sakura.aldeia = "Folha";

        // Metodo Pesonalizado
        Sasuke.SharinganAtivado();
        Naruto.ModoSabioAtivado();
        Sakura.ativarCura();
        Hinata.ByakuganAtivado();

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.idade = 11;
        Boruto.ModoSabioAtivado();
        Boruto.AtivarJougan();
        Boruto.AtivarOKarma();

    }
}