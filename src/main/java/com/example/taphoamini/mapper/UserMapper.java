package be.datamining.mapper;

import be.datamining.dto.request.create.UserCreationRequest;
import be.datamining.dto.request.patch.UserPatchRequest;
import be.datamining.dto.request.update.UserUpdateRequest;
import be.datamining.dto.response.UserResponse;
import be.datamining.model.Roles;
import be.datamining.model.User;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "passwordHash", ignore = true)
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);


    List<UserResponse> toUserResponseList(List<User> users);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "passwordHash", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);


    @BeanMapping(nullValuePropertyMappingStrategy =
            NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "passwordHash", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    void patchUser(@MappingTarget User user, UserPatchRequest request);

    default String mapRolesToString(Roles role) {
        return role != null ? role.getName() : null;
    }
}
