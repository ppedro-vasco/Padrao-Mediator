public class ActionMediator {
    private static ActionMediator instancia = new ActionMediator();
    private ActionMediator(){}

    public static ActionMediator getInstancia(){
        return instancia;
    }

    public String receberAcaoAndarCreep(String ato){
        return "O pedido: "+ CreepCompanion.getInstancia().acaoAndar(ato) +"está sendo executado.\n" + CreepCompanion.getInstancia().mensagemAndar();
    }
    public String receberAcaoAtacarCreep(String ato){
        return "O pedido: "+ CreepCompanion.getInstancia().acaoAtacar(ato) +"está sendo executado.\n" + CreepCompanion.getInstancia().mensagemAtacar();
    }
}
