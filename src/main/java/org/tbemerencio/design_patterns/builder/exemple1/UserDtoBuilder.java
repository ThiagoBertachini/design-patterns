package org.tbemerencio.design_patterns.builder.exemple1;

import java.time.LocalDate;

public interface UserDtoBuilder {

    UserDtoBuilder withFirstName(String firstName);

    UserDtoBuilder withLastName(String lasttName);

    UserDtoBuilder withBirthDate(LocalDate birthDate);

    UserDtoBuilder withAddress(Address address);

    UserDto build();

    UserDto getUserDto();
}