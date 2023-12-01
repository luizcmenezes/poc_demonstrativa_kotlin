package br.com.poc;

import lombok.Getter;
import lombok.ToString;


public class ExemploMapper {

    @Getter
    public static class Person {
        private long id;
        private String name;
        private int age;

        public Person(long id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }
    }

    @ToString
    public static class PersonDto {
        private long id;
        private String fullName;

        public PersonDto(long id, String fullName) {
            this.id = id;
            this.fullName = fullName;
        }

    }

    public static class PersonMapper {
        public static PersonDto mapPersonToDto(Person person) {
            String fullName = person.getName() + " (" + person.getAge() + " years old)";
            return new PersonDto(person.getId(), fullName);
        }
    }

    public static void main(String[] args) {
        Person person = new Person(1L, "Junior", 34);
        System.out.println(PersonMapper.mapPersonToDto(person));
    }
}