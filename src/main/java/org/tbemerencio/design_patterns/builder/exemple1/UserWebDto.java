package org.tbemerencio.design_patterns.builder.exemple1;

public class UserWebDto extends UserDto {
    private String mame;
    private String address;
    private String age;

    public UserWebDto(String mame, String address, String age) {
        this.mame = mame;
        this.address = address;
        this.age = age;
    }

    public String getMame() {
        return mame;
    }

    public void setMame(String mame) {
        this.mame = mame;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
