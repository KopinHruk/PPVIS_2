package structure;

public class Команда {
    public Футболист[] состав;
    public String название;

    public String получить_название(){return "";}
    public Футболист получить_футболиста(String фамилия, String имя, String отчество){return new Футболист();}
    public Футболист получить_футболиста(String фамилия){return new Футболист();}
    public Футболист получить_название(String имя){return new Футболист();}
}
