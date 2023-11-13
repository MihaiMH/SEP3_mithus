package dk.via.mithus.DAOInterfaces;

import dk.via.mithus.Shared.Image;

import java.util.Collection;

public interface ImageDAO {
    Image createImage(Image image);
    Image findImage(String imageId);
    Collection<Image> getImages();
}
