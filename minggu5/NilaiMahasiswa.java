package minggu5;

public class NilaiMahasiswa {

    Mahasiswa[] data;

    NilaiMahasiswa(Mahasiswa[] data){
        this.data = data;
    }


    int maxUTS(int l, int r){
        if(l == r){
            return data[l].uts;
        }

        int mid = (l + r) / 2;

        int lmax = maxUTS(l, mid);
        int rmax = maxUTS(mid+1, r);

        return Math.max(lmax, rmax);
    }

    int minUTS(int l, int r){
        if(l == r){
            return data[l].uts;
        }

        int mid = (l + r) / 2;

        int lmin = minUTS(l, mid);
        int rmin = minUTS(mid+1, r);

        return Math.min(lmin, rmin);
    }

    
    double rataUAS(){
        double total = 0;

        for(int i = 0; i < data.length; i++){
            total += data[i].uas;
        }

        return total / data.length;
    }
}