package ekspresi;

/**
 *
 * @author Hafshy Yazid A. - 13518051
 */
public class tambahEkspresi implements duaEkspresi {
    // memiliki atribut sebanyak dua ekspresi
    private ekspresi x, y;
    
    // memilki constructor default
    // mengisi nilai x = y = 0
    public tambahEkspresi() {
        this.x = new ekspresi(0);
        this.y = new ekspresi(0);
    }
    
    // memiliki constructor yang menerima dua parameter ekspresi
    // mengisi nilai x = _x dan y = _y
    public tambahEkspresi(ekspresi _x, ekspresi _y) {
        this.x = new ekspresi(_x.getNilai());
        this.y = new ekspresi(_y.getNilai());
    }
    
    /**
     *
     * @return hasil nilai dari penjumlahan x dan y
     */
    @Override
    public double getHasil() {
       return (this.x.getNilai() + this.y.getNilai());
    }
}
