package com.gb.jobint.lesson1.person;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.country = builder.country;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
        this.gender = builder.gender;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private int age;
        private String gender;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (firstName != null) sb.append(firstName).append(", ");
        if (lastName != null) sb.append(lastName).append(", ");
        if (middleName != null) sb.append(middleName).append(", ");
        if (country != null) sb.append(country).append(", ");
        if (address != null) sb.append(address).append(", ");
        if (phone != null) sb.append(phone).append(", ");
        if (age != 0) sb.append(age).append(", ");
        if (gender != null) sb.append(gender).append(", ");
        sb.setLength(sb.length() - 2);
        sb.append("]");
        return sb.toString();
    }
}
