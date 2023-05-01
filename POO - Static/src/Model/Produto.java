package Model;

public interface Produto {
// Atributos da interface são sempre CONSTANTES

    public static final String codigoinicial = "BR01SC";
    public static final String codigofinal = "FLN";
// Métodos abstratos, mesmo SEM USAR ABSTRACT

    public String Incluircodigo_inicio(String codigoatual);

    public String Incluircodigo_fim(String codigoatual);
}
