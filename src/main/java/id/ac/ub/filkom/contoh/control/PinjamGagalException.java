package id.ac.ub.filkom.contoh.control;

/** Alur alternatif UC-01 (stok habis, melewati batas, data tidak ditemukan). */
public class PinjamGagalException extends RuntimeException {

    private final boolean bisaReservasi;

    private PinjamGagalException(String pesan, boolean bisaReservasi) {
        super(pesan);
        this.bisaReservasi = bisaReservasi;
    }

    /** Alur 4a / [13] pesanHabis: boleh mengajukan reservasi. */
    public static PinjamGagalException stokHabis() {
        return new PinjamGagalException("Stok buku habis", true);
    }

    /** Alur 4b. */
    public static PinjamGagalException melewatiBatas() {
        return new PinjamGagalException("Melewati batas pinjam", false);
    }

    /** Validasi input. */
    public static PinjamGagalException tidakDitemukan(String objek) {
        return new PinjamGagalException(objek + " tidak ditemukan", false);
    }

    public boolean isBisaReservasi() { return bisaReservasi; }
}
