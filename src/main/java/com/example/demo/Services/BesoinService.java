package com.example.demo.Services;

import com.example.demo.DataTransferObjects.BesoinEnseignantDTO;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Service
public class BesoinService {

    @PersistenceContext
    private EntityManager entityManager;

    public List<BesoinEnseignantDTO> getBesoinEnseignantData() {
        String sql = "SELECT b.BesoinID, b.Description, b.Nom AS nomBesoin, b.quantite, e.nomEnseignant " +
                "FROM besoin b, enseignant e " +
                "WHERE e.EnseignantID = b.EnseignantID";

        List<Object[]> results = entityManager.createNativeQuery(sql).getResultList();
        List<BesoinEnseignantDTO> dtos = new ArrayList<>();

        for (Object[] row : results) {
            BesoinEnseignantDTO dto = new BesoinEnseignantDTO();
            dto.setBesoinID((Integer) row[0]);
            dto.setDescription((String) row[1]);
            dto.setNomBesoin((String) row[2]);
            dto.setQuantite((Integer) row[3]); // Ajoutez la quantité ici
            dto.setNomEnseignant((String) row[4]);
            dtos.add(dto);
        }

        return dtos;
    }
}