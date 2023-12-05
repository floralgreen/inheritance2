public class Rettangolo extends Forma{

    private int nLati;
    private int base;
    private int altezza;

    public Rettangolo(String nome, int nLati, int base, int altezza) {
        super(nome); //chiamata al supercostruttore
        this.nLati = nLati;
        this.base = base;
        this.altezza = altezza;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getnLati() {
        return nLati;
    }

    public void setnLati(int nLati) {
        this.nLati = nLati;
    }

    @Override
    public void stampaArea() {
        super.stampaArea();
        System.out.print(getNome() + " = " + base * altezza);
    }

}
