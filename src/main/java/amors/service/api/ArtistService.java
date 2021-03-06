package amors.service.api;

import amors.entity.Artist;

import java.util.List;

public interface ArtistService {
    List<Artist> getArtists();

    Artist findById(Long id);

    byte[] getArtistLogo(Long id);
}
