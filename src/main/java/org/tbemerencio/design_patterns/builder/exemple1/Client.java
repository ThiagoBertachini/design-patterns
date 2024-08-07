package org.tbemerencio.design_patterns.builder.exemple1;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
    User user = createUser();
    UserDto dto = directBuilder(new UserWebDtoBuilder(), user);
        System.out.println(dto);
    }

    private static UserDto directBuilder(UserDtoBuilder builder, User user){
        return builder
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthDate(user.getBirthDate())
                .withAddress(user.getAddress()).build();
    }


    public static User createUser(){
        User user = new User();
        user.setFirstName("name");
        user.setLastName("last name");
        user.setBirthDate(LocalDate.of(1994, 4, 23));
        Address address = new Address();
        address.setHouseNumber("1");
        address.setStreet("street");
        address.setCity("city");
        address.setState("state");
        address.setZipcode("00000000");
        user.setAddress(address);
        return user;
    }
}
