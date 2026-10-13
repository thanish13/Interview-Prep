package org.t13.app.records;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;

public class RecordsTest {

    @Builder
    public record Person(@JsonProperty("PersonName") String name, @JsonProperty("PersonAge") int age) {}

    void main() throws JsonProcessingException {
        Person person1 = Person.builder().age(1).name("Doe").build();
        System.out.println("Name: " + person1.name());
        System.out.println("Age: " + person1.age());

        System.out.println("------------------------");

        Person person2 = new Person("John Doe", 30);
        System.out.println("Name: " + person2.name());
        System.out.println("Age: " + person2.age());

        System.out.println("------------------------");

        ObjectMapper mapper = new ObjectMapper();
        String result  = mapper.writeValueAsString(person1);
        System.out.println(result);

        Person person3 = mapper.readValue(result, Person.class);
        System.out.println("Name: " + person3.name());
        System.out.println("Age: " + person3.age());
    }
}
