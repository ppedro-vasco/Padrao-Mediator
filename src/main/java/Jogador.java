public class Jogador {
    public String pedirMovimentoCreep(String ato){
        return ActionMediator.getInstancia().receberAcaoAndarCreep(ato);
    }
    public String pedirAtaqueCreep(String ato){
        return ActionMediator.getInstancia().receberAcaoAtacarCreep(ato);
    }
}
