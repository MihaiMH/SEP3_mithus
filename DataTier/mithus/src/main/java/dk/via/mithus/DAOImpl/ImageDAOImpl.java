package dk.via.mithus.DAOImpl;

import dk.via.mithus.DAOInterfaces.ImageDAO;
import dk.via.mithus.Shared.Image;
import dk.via.mithus.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class ImageDAOImpl implements ImageDAO {
    @Autowired
    private ImageRepository imageRepository;

    @Override
    public Image createImage(Image image) {
        return imageRepository.save(image);
    }
}
