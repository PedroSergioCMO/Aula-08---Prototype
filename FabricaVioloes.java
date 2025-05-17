import java.util.HashMap;
import java.util.Map;

public class FabricaVioloes {
    private static final Map<String, Violao> prototipos = new HashMap<>();

    static {
        prototipos.put("classico", new ViolaoClassico());
        prototipos.put("folk", new ViolaoFolk());
        prototipos.put("flet", new ViolaoFlet());
        prototipos.put("jumbo", new ViolaoJumbo());
        prototipos.put("7cordas", new Violao7Cordas());
        prototipos.put("12cordas", new Violao12Cordas());
        prototipos.put("zero", new ViolaoZero());
        prototipos.put("duplozero", new ViolaoDuploZero());
        prototipos.put("triplozero", new ViolaoTriploZero());
    }

    public static Violao getViolao(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            System.err.println("Erro: Tipo não pode ser vazio");
            return null;
        }

        Violao prototipo = prototipos.get(tipo.toLowerCase());
        if (prototipo == null) {
            System.err.println("Erro: Violão não encontrado - " + tipo);
            return null;
        }

        return (Violao) prototipo.clone();
    }
}