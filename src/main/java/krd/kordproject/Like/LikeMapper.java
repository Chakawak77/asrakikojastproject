package krd.kordproject.Like;

import krd.kordproject.place.PlaceMapper;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring", uses = {PlaceMapper.class})

public interface LikeMapper {

    Like toLike(LikeDTO likeDTO);

    List<Like> toLikes(List<LikeDTO> likeDTOS);

    LikeDTO toLikeDTO(Like like);

    List<LikeDTO> toLikesDTO(List<Like> likes);
}