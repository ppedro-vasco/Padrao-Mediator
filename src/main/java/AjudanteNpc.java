public class AjudanteNpc implements Npc {
    private static AjudanteNpc instancia = new AjudanteNpc();

    private AjudanteNpc(){}

    public static AjudanteNpc getInstancia(){
        return instancia;
    }
    public String mensagemAndar() {
        return " O ajudante está andando.";
    }
    public String mensagemAtacar() {
        return " O ajudante está atacando.";
    }
    public String acaoAndar(String ato){
        return ato;
    }

    public String acaoAtacar(String ato){
        return ato;
    }
}
