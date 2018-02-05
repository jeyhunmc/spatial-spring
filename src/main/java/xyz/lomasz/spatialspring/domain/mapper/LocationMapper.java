package xyz.lomasz.spatialspring.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;
import xyz.lomasz.spatialspring.domain.dto.LocationDto;
import xyz.lomasz.spatialspring.domain.dto.LocationWithIdDto;
import xyz.lomasz.spatialspring.domain.entity.LocationEntity;

@Component
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LocationMapper {

    @Mapping(target = "geometry", ignore = true)
    LocationWithIdDto to(LocationEntity entity);

    @Mapping(target = "geometry", ignore = true)
    LocationEntity to(LocationDto dto);

}