package utils;

import org.modelmapper.ModelMapper;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;


public class BaseObjectTranslator {

    protected ModelMapper mapper;

    public BaseObjectTranslator(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public <T, R> R map(T entity, Class<R> targetType) {
        return mapper.map(entity, targetType);
    }

    public <T, R> List<R> mapToList(List<T> entities, Class<R> targetType) {
        return entities.stream().map(source -> map(source, targetType)).collect(Collectors.toList());
    }
}