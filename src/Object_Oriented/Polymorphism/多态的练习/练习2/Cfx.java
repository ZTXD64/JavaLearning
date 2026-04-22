package Object_Oriented.Polymorphism.多态的练习.练习2;

public class Cfx extends Tuxing{
    private int kuan;
    private int gao;

    public Cfx() {

    }
    public Cfx(int kuan, int gao) {
        this.kuan = kuan;
        this.gao = gao;
    }

    public int getKuan() {
        return kuan;
    }

    public void setKuan(int kuan) {
        this.kuan = kuan;
    }

    public int getGao() {
        return gao;
    }

    public void setGao(int gao) {
        this.gao = gao;
    }

    @Override
    public void s() {
        System.out.println("长方形的面积是"+kuan*gao);
    }
}
