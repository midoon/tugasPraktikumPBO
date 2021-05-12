package T9_Generic;


public class Barang <T> {

    private T barang;

    public Barang(T barang){
        this.barang = barang;
    }

    public void getInfo(){
        System.out.println(barang);
    }

    public T getBarang() {
        return barang;
    }

    public void setBarang(T barang) {
        this.barang = barang;
    }
}
