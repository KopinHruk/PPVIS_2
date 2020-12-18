package structure;

public class Таймер {
    private int значение_таймера;
    private boolean остановлен;
    private Таймер состояние;

    public void установить_значение_таймера(int значение){}
    public boolean запустить_таймер(){return true;}
    public boolean остановить_таймер(){return true;}
    public Таймер получить_состоняие(){return new Таймер();}
}
