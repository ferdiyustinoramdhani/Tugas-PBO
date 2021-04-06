/*
Dibuat oleh :
1. Adhi Muhammad (1902316)
2. Ferdi Yustino Ramdhani (19088808)

kelas A
 */
import java.util.ArrayList;

//class sebagai child dari item
public class ItemAnu extends Item{

    //variabel dari class item;
    private ArrayList<String> arrAksi = new ArrayList<>(); //pilihan aksi pada item
    private GameInfo objGameInfo; //ruangan tempat item

    //variabel dari class pintu
    public ItemAnu(String nama) {
        super.setNama(nama);
        arrAksi.add("Deskripsikan pintu");
        arrAksi.add("Coba buka pintu");
    }

    @Override
    public void prosesAksi(int subPil) {
        //1: deskripsikan
        //2: buka pintu
        if (subPil==1) {
            System.out.println("Pintu berwarna merah dengan tulisan 'EXIT' di atas ");
        } else if (subPil==2) {
            //cek apakah mempunyai kunci
            if (objGameInfo.getObjPlayer().cariItem("Kunci")) {
                //kunci ada, pintu terbuka
                System.out.println("Player menggunakan kunci untuk membuka pintu dan pintu terbuka!");
                objGameInfo.setGameOver(true); //game over
            } else {
                //kunci tidak ada
                System.out.println("Player mencboa membuka pintu. TERKUNCI!");
            }
        }
    }

    public void setObjGameInfo(GameInfo objGameInfo) {
        this.objGameInfo = objGameInfo;
    }

    @Override
    public ArrayList<String> getAksi() {
        return arrAksi;
    }


}
