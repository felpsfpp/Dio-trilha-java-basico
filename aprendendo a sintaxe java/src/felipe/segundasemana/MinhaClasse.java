package felipe.segundasemana;
public class MinhaClasse {
 
    public static void main (String [] args) {

        //String meuNome = "Gleyson";

        //int anoFabricacao = 2022;

        // boolean verdadeira = true;

        //anoFabricacao = 2018;

        

        // TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
        


        String primeiroNome = "Gleyson";
        String segundoNome = "Sampaio";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do metodo: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}