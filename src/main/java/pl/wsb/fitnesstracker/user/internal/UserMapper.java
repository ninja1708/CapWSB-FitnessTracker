package pl.wsb.fitnesstracker.user.internal;

import org.springframework.stereotype.Component;
import pl.wsb.fitnesstracker.user.api.User;
import pl.wsb.fitnesstracker.user.api.UserDto;
import pl.wsb.fitnesstracker.user.api.SimpleUserDto;

@Component
class UserMapper {
    UserDto toDto(User user) {
        return new UserDto(user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getBirthdate(),
                user.getEmail());
    }


    SimpleUserDto toSimpleDto(User user) {
        return new SimpleUserDto(user.getId(),
                user.getFirstName(),
                user.getLastName()
        );
    }

    public User toEntity(final UserDto dto) {
        return User.builder()
                .id(dto.id())
                .email(dto.email())
                .birthdate(dto.birthdate())
                .firstName(dto.firstName())
                .lastName(dto.lastName())
                .build();
    }
}

