package com.example.demo.Services;
import com.example.demo.Models.Besoin;
import com.example.demo.repositories.BesoinEnsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.DataTransferObjects.BesoinDto;

@Service
public class BesoinEnsService {

    private final BesoinEnsRepository besoinRepository;

    @Autowired
    public BesoinEnsService(BesoinEnsRepository besoinRepository) {
        this.besoinRepository = besoinRepository;
    }

    public void ajouterBesoin(BesoinDto besoinDto) {
        // Logique métier pour ajouter un besoin
        Besoin besoin = convertirDtoEnEntite(besoinDto);
        besoinRepository.save(besoin);
    }

    public Besoin convertirDtoEnEntite(BesoinDto besoinDto) {
        if (besoinDto == null) {
            return null;
        }

        Besoin besoin = new Besoin();
        besoin.setDescription(besoinDto.getDescription());
        besoin.setNom(besoinDto.getNom());

        // L'ID peut être laissé vide car il sera généré automatiquement par la base de données
        // Si vous souhaitez définir l'ID manuellement, vous pouvez utiliser besoin.setId(...);

        return besoin;
    }
}

