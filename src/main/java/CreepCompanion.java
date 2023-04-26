public class CreepCompanion implements Npc {
    private static CreepCompanion instancia = new CreepCompanion();

    private CreepCompanion(){}

    public static CreepCompanion getInstancia(){
        return instancia;
    }
    public String mensagemAndar() {
        return " O creep companion está andando.";
    }
    public String mensagemAtacar() {
        return " O creep companion está atacando.";
    }
    public String acaoAndar(String ato){
        return ato;
    }

    public String acaoAtacar(String ato){
        return ato;
    }
}
