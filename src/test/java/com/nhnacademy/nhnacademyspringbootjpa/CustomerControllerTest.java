package com.nhnacademy.nhnacademyspringbootjpa;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

@RequiredArgsConstructor
@DataJpaTest
public class CustomerControllerTest {



    @Sql("customer-test.sql")
    @Test
    void getCustomerTest() {

    }
}
