package dk.mithus.services;

import dk.mithus.DAOInterfaces.PostDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    private PostDAO postDAO;
}
