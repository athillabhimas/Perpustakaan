package id.ac.ub.filkom.contoh.repository;

import id.ac.ub.filkom.contoh.entity.TransaksiPinjam;
import org.springframework.data.jpa.repository.JpaRepository;

/** save(transaksi) merealisasikan simpan() milik TransaksiPinjam. (BARU) */
public interface TransaksiPinjamRepository extends JpaRepository<TransaksiPinjam, String> {
}
