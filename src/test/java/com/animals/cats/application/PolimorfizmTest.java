package com.animals.cats.application;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PolimorfizmTest {
    @Test
    public void test() {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Dog dog2 = new Dog();
        Animal cat = new Cat();

        Assertions.assertThat(dog.sound()).isEqualTo("wuf");
        Assertions.assertThat(((Animal)dog).sound()).isEqualTo("wuf");
        Assertions.assertThat(dog2.sound()).isEqualTo("wuf");
        Assertions.assertThat(cat.sound()).isEqualTo("meow");
    }
    @Test
    public void test2() {
        Vehicle car = new Car();
        Vehicle bus = new Bus();

        Assertions.assertThat(car.drive()).isEqualTo("car");
        Assertions.assertThat(bus.drive()).isEqualTo("bus");
    }

    interface Vehicle {
        public String drive();
    }
    class Car implements Vehicle {
        @Override
        public String drive() {
            return "car";
        }
    }
    class Bus implements Vehicle {
        @Override
        public String drive() {
            return "bus";
        }
    }

    class Animal {
        public String sound() {
            return "none";
        }
    }
    class Dog extends Animal {
        public String sound() {
            return "wuf";
        }
    }
    class Cat extends Animal {
        @Override
        public String sound() {
            return "meow";
        }
    }
}
